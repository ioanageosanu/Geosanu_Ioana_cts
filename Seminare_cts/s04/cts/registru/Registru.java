package cts.registru;

import java.util.HashMap;
import java.util.Map;

public class Registru {
	private static Map<String,Firma> registru=new HashMap<String, Firma>();
	
	public Firma getFirma(String nume) {
		if(!registru.containsKey(nume)) {
			Firma f= new Firma(nume,0);
			registru.put(nume, f);
		}
		return registru.get(nume);
	}
}
