package fr.pizza.services;

import java.util.Scanner;

import fr.pizza.Dao.PizzaArrayDao;

public class MenuServiceFactory {

	public MenuService serviceFactory(int menu){
   
		   switch (menu) {
			case 1: return new ListerPizzasService();		
			case 2: return new AjouterPizzaService();
			case 3: return new ModifierPizzaService();
			case 4: return new SupprimerPizzaService();
			}
		   return null;
	}
}
