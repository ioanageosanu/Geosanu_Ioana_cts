package cts.registru;

public class Firma {
	private String nume;
	private int numarAngajati;
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getNumarAngajati() {
		return numarAngajati;
	}
	public void setNumarAngajati(int numarAngajati) {
		this.numarAngajati = numarAngajati;
	}
	protected Firma(String nume, int numarAngajati) {
		super();
		this.nume = nume;
		this.numarAngajati = numarAngajati;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Firma [nume]=" + nume + "[numar angajati]= "+numarAngajati;
	}
	public void angajeaza() {
		this.numarAngajati++;
	}
	
}
