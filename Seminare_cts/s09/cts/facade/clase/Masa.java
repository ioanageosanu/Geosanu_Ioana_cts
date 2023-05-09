package cts.facade.clase;

public class Masa {
	private Boolean masaLibera;
	private int nrMasa;
	private Boolean areServetele;
	
	public Masa(Boolean masaLibera, int nrMasa,Boolean areServetele) {
		super();
		this.masaLibera = masaLibera;
		this.nrMasa = nrMasa;
		this.areServetele=areServetele;
	}

	public Integer getNrMasa() {
		// TODO Auto-generated method stub
		return this.nrMasa;
	}

	public Boolean getMasaLibera() {
		return masaLibera;
	}

	public void setMasaLibera(Boolean masaLibera) {
		this.masaLibera = masaLibera;
	}

	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}

	
	@Override
	public String toString() {
		return "Masa [masaLibera=" + masaLibera + ", nrMasa=" + nrMasa + "]";
	}

	public Boolean getAreServetele() {
		// TODO Auto-generated method stub
		return this.areServetele;
	}
	
	
	
}
