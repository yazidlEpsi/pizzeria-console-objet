package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {
	public static Scanner sc = new Scanner(System.in);
	
	/**	
	 * 
	 * @Author yazid
	 * @since 24/07/2018
	 */
	
	
	public static void main(String[] args) {
		navigation();

	}

	private static void navigation() {

		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza");
		System.out.println("3. Mettre à jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");

		int userChoice = sc.nextInt();

		menu(userChoice);
	}

	private static void menu(int userChoice) {

		switch (userChoice) {
		case 1:  showAllPizza();
		break;
		case 2:  addNewPizza();
		break;
		case 3:  updatePizza();
		break;
		case 4:  deletePizza();
		break;
		case 99:  System.out.println("Aurevoir");
		break;
		default: navigation();
		break;
		}

	}

	private static void deletePizza() {
		// TODO Auto-generated method stub

	}

	private static void updatePizza() {
		// TODO Auto-generated method stub

	}

	private static void addNewPizza() {
		// TODO Auto-generated method stub

	}

	private static void showAllPizza() {
		// TODO Auto-generated method stub

	}


}
