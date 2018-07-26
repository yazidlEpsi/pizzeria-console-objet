package fr.pizzeria.console;

import java.util.ArrayList;
import java.util.Scanner;

import fr.pizza.Dao.PizzaArrayDao;
import fr.pizza.services.MenuService;
import fr.pizza.services.MenuServiceFactory;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.Pizza.Pizza;


public class PizzeriaAdminConsoleApp {

	/**	
	 * 
	 * @throws StockageException 
	 * @Author yazid
	 * @since 24/07/2018
	 */
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		PizzaArrayDao IDao = new PizzaArrayDao();
		IDao.createIntoTables();
		MenuServiceFactory menu = new MenuServiceFactory();

		boolean check = true;
		
		while(check){
			
			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Liste les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");
			try {
				int userChoice = sc.nextInt();
				check =valid(userChoice);
				if(check){
					MenuService menuFactory= menu.serviceFactory(userChoice);
					menuFactory.executeUC(IDao, sc);
				}else{
					System.out.println("Aurevoir"); 
				}
				
			} catch (StockageException e) {
				System.out.println(e+ "dd");
			}
			
			
			
		}
	}
	
	
	private static boolean valid(int value){
		if(!(value == 99)){
			return true;
		}else{
			return false;
		}
		
	}
}
