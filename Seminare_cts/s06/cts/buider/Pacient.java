package cts.buider;

public class Pacient {
	private String nume;
	private Boolean patRabatabil;
	private Boolean micDejuninclus;
	private Boolean papuciDeCamera;
	
	public String getNume() {
		return nume;
	}
	protected void setNume(String nume) {
		this.nume = nume;
	}
	public Boolean getPatRabatabil() {
		return patRabatabil;
	}
	protected void setPatRabatabil(Boolean patRabatabil) {
		this.patRabatabil = patRabatabil;
	}
	public Boolean getMicDejuninclus() {
		return micDejuninclus;
	}
	protected void setMicDejuninclus(Boolean micDejuninclus) {
		this.micDejuninclus = micDejuninclus;
	}
	public Boolean getPapuciDeCamera() {
		return papuciDeCamera;
	}
	protected void setPapuciDeCamera(Boolean papuciDeCamera) {
		this.papuciDeCamera = papuciDeCamera;
	}
	
	private Pacient(Boolean patRabatabil, Boolean micDejuninclus, Boolean papuciDeCamera) {
		super();
		this.patRabatabil = false;
		this.micDejuninclus = false;
		this.papuciDeCamera = false;
	}
	private Pacient(String nume, Boolean patRabatabil, Boolean micDejuninclus, Boolean papuciDeCamera) {
		super();
		this.nume = "Anonim";
		this.patRabatabil = patRabatabil;
		this.micDejuninclus = micDejuninclus;
		this.papuciDeCamera = papuciDeCamera;
	}
	public Pacient() {
		super();
	}
	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", patRabatabil=" + patRabatabil + ", micDejuninclus=" + micDejuninclus
				+ ", papuciDeCamera=" + papuciDeCamera + "]";
	}
	
	
	
}
