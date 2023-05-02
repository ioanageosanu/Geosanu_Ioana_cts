package cts.flyweight.clase;

public class Rezervare {
	private int id;
	private int nrMasa;
	private int numarPersoane;
	private int oreRezervare;
	public Rezervare(int id, int nrMasa, int numarPersoane, int oreRezervare) {
		super();
		this.id = id;
		this.nrMasa = nrMasa;
		this.numarPersoane = numarPersoane;
		this.oreRezervare = oreRezervare;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNrMasa() {
		return nrMasa;
	}
	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}
	public int getNumarPersoane() {
		return numarPersoane;
	}
	public void setNumarPersoane(int numarPersoane) {
		this.numarPersoane = numarPersoane;
	}
	public int getOreRezervare() {
		return oreRezervare;
	}
	public void setOreRezervare(int oreRezervare) {
		this.oreRezervare = oreRezervare;
	}
	@Override
	public String toString() {
		return "Rezervare [id=" + id + ", nrMasa=" + nrMasa + ", numarPersoane=" + numarPersoane + ", oreRezervare="
				+ oreRezervare + "]";
	}
	
	
}
