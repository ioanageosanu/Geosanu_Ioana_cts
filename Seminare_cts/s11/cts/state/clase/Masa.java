package cts.state.clase;

public class Masa {
	
	int numar;
	Stare stare;
	
	public Masa(int numar) {
		super();
		this.numar = numar;
	}
	public int getNumar() {
		return numar;
	}
	public void setNumar(int numar) {
		this.numar = numar;
	}
	public void setStare(Stare stare) {
		this.stare = stare;
	}
	public Stare getStare() {
		return stare;
	}
	public void rezervaMasa() {
		Stare stareRezervata=new StareRezervata();
		stareRezervata.schimbareStare(this);
	}
	
	public void ocupaMasa() {
		Stare stareOcupata=new StareOcupata();
		stareOcupata.schimbareStare(this);
	}
	public void eliberareMasa() {
		Stare stareLibera=new StareLibera();
		stareLibera.schimbareStare(this);
	}
	public void ridicaRezervare() {
		Stare stareOcupata=new StareOcupata();
		stareOcupata.schimbareStare(this);
	}
	public void anuleazaRezervare() {
		Stare stareLibera=new StareLibera();
		stareLibera.schimbareStare(this);
	}
}
