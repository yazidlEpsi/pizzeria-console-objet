package fr.pizza.Dao;

import fr.pizzeria.model.Pizza.Pizza;

public class PizzaArrayDao implements IPizzaDao {

	private Pizza [] pizzas =  {
		new Pizza("PEP","Pépéroni",12.50),
		new Pizza("MAR","Margherita",14.00),
		new Pizza("REIN","La Reine",11.50),
		new Pizza("FRO","La 4 fromages",12.00),
		new Pizza("CAN","La cannibale",12.50)
	};
	@Override
	public Pizza[] findAllPizzas() {
		return pizzas;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {

		Pizza pTemp [] = new Pizza[pizzas.length+1];

		for(int i=0;i<pizzas.length;i++){
			pTemp[i] = pizzas[i] ;
		}
		pTemp[pizzas.length] = new Pizza(pizza.getCode(), pizza.getLibelle() , pizza.getPrix());
		pizzas = pTemp;
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		for(int i =0; i< pizzas.length;i++){

			if(pizzas[i].getCode().equals(codePizza)){
				pizzas[i] = new Pizza(pizza.getCode(), pizza.getLibelle(), pizza.getPrix());
			}
		}
	}

	@Override
	public void deletePizza(String codePizza) {
		Pizza pTemp [] = new Pizza[pizzas.length-1];
		int j =0;
		for(int i =0; i< pizzas.length;i++){

			if(!pizzas[i].getCode().equals(codePizza)){	
				pTemp[j] = pizzas[i] ;
				j++;
			}
		}
		pizzas = pTemp;
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		for(int i=0;i<pizzas.length;i++){
			if(pizzas[i].getCode().equals(codePizza)){
				return pizzas[i];
			}		
		}
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		for(int i=0;i<pizzas.length;i++){
			if(pizzas[i].getCode().equals(codePizza)){
				return true;
			}		
		}
		return false;
	}

}
