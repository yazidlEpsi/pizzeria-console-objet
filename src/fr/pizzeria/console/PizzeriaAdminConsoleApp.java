package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza.Pizza;

public class PizzeriaAdminConsoleApp {
	public static Scanner sc = new Scanner(System.in);
	public static Pizza pizzas []  = new Pizza[5];
	/**	
	 * 
	 * @Author yazid
	 * @since 24/07/2018
	 */


	public static void main(String[] args) {
		pizzas[0] = new Pizza("PEP","Pépéroni",12.50);
		pizzas[1] = new Pizza("MAR","Margherita",14.00);
		pizzas[2] = new Pizza("REIN","La Reine",11.50);
		pizzas[3] = new Pizza("FRO","La 4 fromages",12.00);
		pizzas[4] = new Pizza("CAN","La cannibale",12.50);
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
		showPizza();
		sc.nextLine();
		System.out.println("********************");
		System.out.println("Veuillez choisir le code de la pizza à supprimer");
		String codePizzaTemp = sc.nextLine();
		codePizzaTemp.toUpperCase();
		Pizza pTemp [] = new Pizza[pizzas.length-1];
		int j =0;
		for(int i =0; i< pizzas.length;i++){
			
			if(!pizzas[i].code.equals(codePizzaTemp)){	
				pTemp[j] = pizzas[i] ;
				j++;
			}
		
		}
		pizzas = pTemp;
		navigation();
	}

	private static void updatePizza() {
		showPizza();
		sc.nextLine();
		System.out.println("********************");

		System.out.println("Veuillez saisir le code");
		String codePizzaTemp = sc.nextLine();
		codePizzaTemp.toUpperCase();
		
		System.out.println("Veuillez saisir le nouveau code");
		String codePizza = sc.nextLine();
		codePizza.toUpperCase();
		
		System.out.println("Veuillez saisir le nouveau nom (sans espace)");
		String namePizza = sc.nextLine();

		System.out.println("Veuillez saisir le nouveau prix");
		double prixPizza = Double.parseDouble(sc.nextLine());

		for(int i =0; i< pizzas.length;i++){
			if(pizzas[i].code.equals(codePizzaTemp)){
				pizzas[i] = new Pizza(codePizza, namePizza, prixPizza);
				
			}
		}
		if(ifExist()){
			System.out.println("Pizza modifié");
		}else{
			System.out.println("Pizza non trouvé en base");
		}
		navigation();
	}

	private static void addNewPizza() {
		sc.nextLine();
		System.out.println("Veuillez saisir le code :");
		String codePizza = sc.nextLine();

		System.out.println("Veuillez saisir le nom (sans espace) :");
		String namePizza = sc.nextLine();

		System.out.println("Veuillez saisir le prix :");
		double prixPizza = Double.parseDouble(sc.nextLine());

		Pizza pTemp [] = new Pizza[pizzas.length+1];

		for(int i=0;i<pizzas.length;i++){
			pTemp[i] = pizzas[i] ;
		}

		pTemp[pizzas.length] = new Pizza(codePizza, namePizza, prixPizza);
		pizzas = pTemp;
		navigation();
	}

	private static void showAllPizza() {
		showPizza();
		navigation();
	}

	private static void showPizza() {
		for(Pizza temp : pizzas){
			System.out.println(temp.code +"->"+temp.libelle +"(" + temp.prix+"€)");
		}
	} 

	private static boolean ifExist(){
		return true;
	}
}
