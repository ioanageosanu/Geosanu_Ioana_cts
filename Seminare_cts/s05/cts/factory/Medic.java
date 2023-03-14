package cts.factory;

public class Medic implements PersonalSpital{
	private String nume;

	public Medic(String numePersonal) {
		this.nume=numePersonal;
	}

	public void descriere() {
		System.out.println("Medicul: " + this.nume);
	}

}
