package cts.factory;

public class Anestezist implements PersonalSpital{
	private String nume;

	public Anestezist(String numePersonal) {
		this.nume=numePersonal;
	}

	public void descriere() {
		System.out.println("Anestezist: " + this.nume);
	}
}
