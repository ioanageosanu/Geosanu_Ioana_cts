package cts.buider;


public class PacientBuilder implements Builder{
	private Pacient pacient;
	
	public PacientBuilder(String nume) {
		this.pacient=new Pacient();
		this.pacient.setNume(nume);
	}
	
	public Pacient build() {
		return this.pacient;
	}
	
	public PacientBuilder setNume(String nume) {
		this.pacient.setNume(nume);
		return this;
	}
	public PacientBuilder setPatRabatabil(Boolean patRabatabil) {
		this.pacient.setPatRabatabil(patRabatabil);
		return this;
	}
	public PacientBuilder setMicDejuninclus(Boolean micDejuninclus) {
		this.pacient.setMicDejuninclus(micDejuninclus);
		return this;
	}
	public PacientBuilder setPapuciDeCamera(Boolean papuciDeCamera) {
		this.pacient.setPapuciDeCamera(papuciDeCamera);
		return this;
	}

}
