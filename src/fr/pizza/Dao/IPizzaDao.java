package fr.pizza.Dao;

import java.util.List;

import fr.pizzeria.model.Pizza.Pizza;

public interface IPizzaDao {
	
	void createIntoTables();
	List<Pizza>  findAllPizzas();
	void saveNewPizza(Pizza pizza);
	void updatePizza(String codePizza, Pizza pizza);
	void deletePizza(String codePizza);
	Pizza findPizzaByCode(String codePizza);
	boolean pizzaExists(String codePizza);

}
