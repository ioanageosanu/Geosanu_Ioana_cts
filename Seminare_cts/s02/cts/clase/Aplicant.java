package cts.clase;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumireProiect;
	
	public String[] getDenumireProiect() {
		return denumireProiect;
	}
	public void setNr_proiecte(int nrProiecte,String[] denumireProiect) {
		this.nrProiecte=nrProiecte;
		this.denumireProiect=new String[this.nrProiecte];
		for(int i=0;i<this.nrProiecte;i++) {
			this.denumireProiect[i] = denumireProiect[i];
		}
	}

	protected static int pragAcceptare=80;
	
	public static int getPragAcceptare() {
		return pragAcceptare;
	}
	public static void setPragAcceptare(int pragAcceptare) {
		Aplicant.pragAcceptare = pragAcceptare;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void afisareStatut(){
		System.out.println("Aplicantul "+nume+" "+prenume+ (punctaj<pragAcceptare? "nu" : " ") + "a fost acceptat.");
	}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}
	public int getNr_proiecte() {
		return nrProiecte;
	}
	public void setNr_proiecte(int nr_proiecte) {
		this.nrProiecte = nr_proiecte;
	}
	
	public abstract void afisareFinantare();
	
	protected void afisareFinantare(String tipAplicant, int sumaFinantare) {
		// TODO Auto-generated method stub
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+sumaFinantare+" Euro/zi in proiect.");
	}

}
