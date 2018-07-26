package fr.pizza.services;

import java.util.Scanner;

import fr.pizza.Dao.PizzaArrayDao;
import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.exception.UpdatePizzaException;

public abstract class MenuService  {
	
	public abstract void executeUC(PizzaArrayDao pizzaCrud, Scanner sc) throws StockageException;
}
