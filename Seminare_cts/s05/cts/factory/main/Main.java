package cts.factory.main;

import java.util.ArrayList;
import java.util.List;

import cts.factory.Asistent;
import cts.factory.Factory;
import cts.factory.PersonalSpital;
import cts.factory.TipPersonalSpital;

public class Main {
	public static void main(String[] args) {
		Factory factory=new Factory();
		PersonalSpital asistent=factory.createInstance(TipPersonalSpital.ASISTENT, "Popescu");
		PersonalSpital medic=factory.createInstance(TipPersonalSpital.MEDIC, "Ionescu");
		PersonalSpital brancardier=factory.createInstance(TipPersonalSpital.BRANCARDIER, "Georgescu");
		
		asistent.descriere();
		medic.descriere();
		brancardier.descriere();
		
		List<PersonalSpital>listaPersonal=new ArrayList<>();
		listaPersonal.add(asistent);
		listaPersonal.add(medic);
		listaPersonal.add(brancardier);
		listaPersonal.add(factory.createInstance(TipPersonalSpital.MEDIC, "Ion"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.ASISTENT, "Mihai"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.BRANCARDIER, "Elena"));
		listaPersonal.add(factory.createInstance(TipPersonalSpital.ANESTEZIST, "Carmen"));
		
		for(PersonalSpital personal:listaPersonal) {
			personal.descriere();
		}
	}
}
