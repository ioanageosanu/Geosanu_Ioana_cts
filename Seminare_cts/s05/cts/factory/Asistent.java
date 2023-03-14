package cts.factory;

public class Asistent implements PersonalSpital {
	private String nume;

	public Asistent(String numePersonal) {
		this.nume=numePersonal;
	}

	public void descriere() {
		System.out.println("Asistentul: " + this.nume);
	}

}
