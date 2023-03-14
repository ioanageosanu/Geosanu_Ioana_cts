package cts.factory;

import cts.factory_method.Infirmier;

public class Factory {
	
	public Factory() {
		
	}
	
	public PersonalSpital createInstance(TipPersonalSpital tip, String numePersonal) {
		switch(tip) {
			case MEDIC:
				return new Medic(numePersonal);
			case ASISTENT:
				return new Asistent(numePersonal);
			case BRANCARDIER:
				return new Brancardier(numePersonal);
			case ANESTEZIST:
				return new Anestezist(numePersonal);
			default:
				return null;
		}
	}
}
