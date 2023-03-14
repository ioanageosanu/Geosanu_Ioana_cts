package cts.factory;

public class Brancardier implements PersonalSpital{
	private String nume;
	
	
	public Brancardier(String numePersonal) {
		this.nume=numePersonal;
	}


	public void descriere() {
		System.out.println("Brancardierul: " + this.nume);
	}
}
