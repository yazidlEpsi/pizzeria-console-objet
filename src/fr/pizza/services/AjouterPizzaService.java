package fr.pizza.services;

import java.util.Scanner;

import fr.pizza.Dao.PizzaArrayDao;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.UpdatePizzaException;
import fr.pizzeria.model.Pizza.Pizza;

public class AjouterPizzaService  extends MenuService{

	@Override
	public void executeUC(PizzaArrayDao pizzaCrud, Scanner sc) throws SavePizzaException {
		
		
		sc.nextLine();
		System.out.println("Veuillez saisir le code :");
		String codePizza = sc.nextLine();
		
		if(codePizza.isEmpty()){ 
			throw new SavePizzaException("les champs sont vides");
		}
		
		System.out.println("Veuillez saisir le nom (sans espace) :");
		String namePizza = sc.nextLine();

		System.out.println("Veuillez saisir le prix :");
		double prixPizza  = Double.parseDouble(sc.nextLine());
		
		Pizza pTemp = new Pizza(codePizza,namePizza,prixPizza);
		pizzaCrud.saveNewPizza(pTemp);
		
	}
	
}
