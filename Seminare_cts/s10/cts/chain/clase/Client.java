package cts.chain.clase;

public class Client {
	private String nume;
	private String numarTelefon;
	private String adresaMail;
	public Client(String nume, String numarTelefon, String adresaMail) {
		super();
		this.nume = nume;
		this.numarTelefon = numarTelefon;
		this.adresaMail = adresaMail;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getNumarTelefon() {
		return numarTelefon;
	}
	public void setNumarTelefon(String numarTelefon) {
		this.numarTelefon = numarTelefon;
	}
	public String getAdresaMail() {
		return adresaMail;
	}
	public void setAdresaMail(String adresaMail) {
		this.adresaMail = adresaMail;
	}
	
	
}
