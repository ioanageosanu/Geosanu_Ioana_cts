package cts.factory_method;

public class Infirmier implements PersonalSpital, cts.factory.PersonalSpital {
	private String nume;
	private int anVechime;
	
	public Infirmier(String nume, int anVechime) {
		super();
		this.nume = nume;
		this.anVechime = anVechime;
	}
	public int getAnVechime() {
		return anVechime;
	}
	public void setAnVechime(int anVechime) {
		this.anVechime = anVechime;
	}
	Infirmier(String nume) {
		super();
		this.nume = nume;
		this.anVechime=0;
	}
	public void descriere() {
		System.out.println("Infirmierul "+this.nume+" are "+this.anVechime+" ani vechime");
	}
	
}
