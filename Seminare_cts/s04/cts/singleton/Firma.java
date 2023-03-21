package cts.singleton;

import java.util.HashMap;
import java.util.Map;

public class Firma {
	private String nume;
	private int numarAngajati;
	private static Map<String,Firma> registru=new HashMap<>();
	
	private Firma(String nume, int numarAngajati) {
		super();
		this.nume = nume;
		this.numarAngajati = numarAngajati;
	}
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
	public static Firma getFirma(String nume) {
		if(registru.containsKey(nume)) {
			return registru.get(nume);
		}
		else {
			Firma f=new Firma(nume,0);
			registru.put(nume, f);
			return f;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Firma [nume]=" + nume + "[numar angajati]= "+numarAngajati;
	}
	
}
