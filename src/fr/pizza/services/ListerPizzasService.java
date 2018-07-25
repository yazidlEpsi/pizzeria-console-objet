package fr.pizza.services;

import java.util.Scanner;

import fr.pizza.Dao.PizzaArrayDao;
import fr.pizzeria.model.Pizza.Pizza;

public class ListerPizzasService extends MenuService {

	@Override
	public void executeUC(PizzaArrayDao pizzaCrud, Scanner sc) {
		for(Pizza temp : pizzaCrud.findAllPizzas()){
			System.out.println(temp.getCode() +"->"+temp.getLibelle() +"(" + temp.getPrix()+"€)");
		}
		
	}



}
