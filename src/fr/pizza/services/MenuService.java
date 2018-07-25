package fr.pizza.services;

import java.util.Scanner;

import fr.pizza.Dao.PizzaArrayDao;

public abstract class MenuService  {
	
	public abstract void executeUC(PizzaArrayDao pizzaCrud, Scanner sc);
}
