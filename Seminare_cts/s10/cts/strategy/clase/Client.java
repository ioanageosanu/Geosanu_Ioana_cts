package cts.strategy.clase;

public class Client {
	private String nume;
	private ModPlata modPlata;
	public Client(String nume) {
		super();
		this.nume = nume;
		//by default plateste cash
		this.modPlata = new PlataCash();
	}
	public ModPlata getModPlata() {
		return modPlata;
	}
	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public void realizeazaPlata(double sumaPlata) {
		//plata se realizeaza prin intermediul interfetei modplata
		modPlata.plateste(nume, sumaPlata);
	}
}
