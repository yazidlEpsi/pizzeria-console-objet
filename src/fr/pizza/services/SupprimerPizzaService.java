package fr.pizza.services;

import java.util.Scanner;

import fr.pizza.Dao.PizzaArrayDao;

public class SupprimerPizzaService extends MenuService {

	@Override
	public void executeUC(PizzaArrayDao pizzaCrud, Scanner sc) {
		sc.nextLine();
		System.out.println("********************");
		System.out.println("Veuillez choisir le code de la pizza à supprimer");
		String codePizzaTemp = sc.nextLine();
		
		pizzaCrud.deletePizza(codePizzaTemp);
		
	}

}
