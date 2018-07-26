package fr.pizza.services;

import java.util.Scanner;

import fr.pizza.Dao.PizzaArrayDao;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.Pizza.Pizza;

public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(PizzaArrayDao pizzaCrud, Scanner sc) throws UpdatePizzaException {
		
		sc.nextLine();
		
		System.out.println("********************");

		System.out.println("Veuillez saisir le code");
		String codePizzaTemp = sc.nextLine();
		
		System.out.println("Veuillez saisir le nouveau code");
		String codePizza = sc.nextLine();
		
		System.out.println("Veuillez saisir le nouveau nom (sans espace)");
		String namePizza = sc.nextLine();

		System.out.println("Veuillez saisir le nouveau prix");
		double prixPizza = Double.parseDouble(sc.nextLine());
		Pizza pTemp = new Pizza(codePizza,namePizza,prixPizza);
		
			for( int i = 0; i< pizzaCrud.findAllPizzas().size();i++){
				
				if(pizzaCrud.findAllPizzas().get(i).getCode().equals(codePizzaTemp)){
					pizzaCrud.updatePizza(codePizzaTemp, pTemp);

				}else{
					throw new UpdatePizzaException("champ incorrect");
				}
			}

	}

}
