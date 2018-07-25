package fr.pizza.Dao;

import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.model.Pizza.Pizza;

public class PizzaArrayDao implements IPizzaDao {
	
	private List <Pizza> pizzas = new ArrayList<Pizza>();
	
	@Override
	public List<Pizza> findAllPizzas() {
		return pizzas;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {

		pizzas.add(new Pizza(pizza.getCode(), pizza.getLibelle() , pizza.getPrix()));

	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		for(int i =0; i< pizzas.size();i++){

			if(pizzas.get(i).getCode().equals(codePizza)){
				pizzas.get(i).setCode(pizza.getCode());
				pizzas.get(i).setLibelle(pizza.getLibelle()); 
				pizzas.get(i).setPrix(pizza.getPrix()); 
			}
		}
	}

	@Override
	public void deletePizza(String codePizza) {
		for(int i=0;i<pizzas.size();i++){
			if(pizzas.get(i).getCode().equals(codePizza)){
				pizzas.remove(i).toString();
			}		
		}
		
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		for(int i=0;i<pizzas.size();i++){
			if(pizzas.get(i).getCode().equals(codePizza)){
				return pizzas.get(i);
			}		
		}
		
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		for(int i=0;i<pizzas.size();i++){
			if(pizzas.get(i).getCode().equals(codePizza)){
				return true;
			}		
		}
		return false;
	}

	@Override
	public void createIntoTables() {
		pizzas.add(new Pizza("PEP","Pépéroni",12.50));
		pizzas.add(new Pizza("MAR","Margherita",14.00));
		pizzas.add(new Pizza("REIN","La Reine",11.50));

		
	}

}
