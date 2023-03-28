package cts.prototype;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta{
	private String nume;
	private Map<String, Float> solutii=new HashMap<>();
	private float gramaj;
	
	public Reteta(String nume, Map<String, Float> solutii, float gramaj) {
		super();
		this.nume = nume;
		this.solutii = solutii;
		
		float sum=0; //suma gramajului
		for(float gramajSolutie :solutii.values()) {
			sum+=gramajSolutie;
		}
		if(sum==gramaj) {
			this.gramaj=gramaj;
		}
		else {
			//control space ca sa apara comanda
			throw new IllegalArgumentException();
		}
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	//ne adaugam in atribut fiecare pereche cheie si valoare
	
	public void setSolutii(Map<String, Float> solutii) {
		this.solutii=new HashMap<>();
		for(String keys : solutii.keySet()) {
			this.solutii.put(keys, solutii.get(keys));
		}
	}

	public void setGramaj(float gramaj) {
		this.gramaj = gramaj;
	}
	
	private Reteta() {
		this.nume="N/A";
		this.gramaj=0;
		this.solutii=null;
	}

	@Override
	public IReteta copiazaReteta() {
		Reteta retetaNoua=new Reteta();
		retetaNoua.setGramaj(gramaj);
		retetaNoua.setNume(nume);
		retetaNoua.setSolutii(solutii);
		return retetaNoua;
	}

	@Override
	public String toString() {
		return "Reteta [nume=" + nume + ", solutii=" + solutii + ", gramaj=" + gramaj + "]";
	}
	
}
