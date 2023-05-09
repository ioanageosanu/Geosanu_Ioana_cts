package cts.facade.clase;

import java.util.HashMap;
import java.util.Map;

public class MeseRestaurant {
	private Map<Integer,Masa> listaMese;
	
	public MeseRestaurant() {
		listaMese=new HashMap<Integer,Masa>();
			
	}
	public void adaugareMasa(Masa masa) {
		listaMese.put(masa.getNrMasa(),masa);
	}
	public Boolean esteLibera(int nrMasa) {
		return listaMese.get(nrMasa).getMasaLibera();
	}
	
	public Boolean suntServeteleleNoi(int nrMasa) {
		return listaMese.get(nrMasa).getAreServetele();
	}
}
