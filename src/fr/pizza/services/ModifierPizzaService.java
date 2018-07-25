package fr.pizza.services;

import java.util.Scanner;

import fr.pizza.Dao.PizzaArrayDao;
import fr.pizzeria.model.Pizza.Pizza;

public class ModifierPizzaService extends MenuService {

	@Override
	public void executeUC(PizzaArrayDao pizzaCrud, Scanner sc) {
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

		pizzaCrud.updatePizza(codePizzaTemp, pTemp);
	}

}
