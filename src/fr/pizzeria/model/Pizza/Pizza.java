package fr.pizzeria.model.Pizza;

public class Pizza {
	private int id =0;
	private String code;
	private String libelle;
	private double prix;
	private static int currentLastId =0;
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public static int getCurrentLastId() {
		return currentLastId;
	}

	public static void setCurrentLastId(int currentLastId) {
		Pizza.currentLastId = currentLastId;
	}

	@Override
	public String toString() {
		return getCode() +"->"+getLibelle() +"(" + getPrix()+"€)";
	}
	
	
	
}

