package fr.pizzeria.model.Pizza;

public class Pizza {
	public int id =0;
	public String code;
	public String libelle;
	public double prix;
	public static int currentLastId =0;
	
	public Pizza(String code, String libelle, double prix) {
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		nombrePizza();
	}

	public Pizza(int id, String code, String libelle, double prix) {

		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	
	public void nombrePizza(){
		this.currentLastId = currentLastId++;
	}
	
}
