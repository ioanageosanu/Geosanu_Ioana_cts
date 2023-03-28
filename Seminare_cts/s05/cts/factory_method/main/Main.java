package cts.factory_method.main;

import java.util.ArrayList;
import java.util.List;

import cts.factory_method.Factory;
import cts.factory_method.PersonalSpital;
import cts.factory_method.FactoryAsistent;
import cts.factory_method.FactoryInfirmier;
import cts.factory_method.FactoryMedic;
import cts.factory_method.Infirmier;

public class Main {
	public static void main(String[] args) {
		Factory fabricaAsistenti=new FactoryAsistent();
		Factory fabricaMedici=new FactoryMedic();
		Factory fabricaInfirmier=new FactoryInfirmier();
		Infirmier infirmier=(Infirmier) fabricaInfirmier.createPersonal("Ion");
		infirmier.setAnVechime(15);
		
		List<PersonalSpital> listaPersonal=new ArrayList<>();
		listaPersonal.add( fabricaAsistenti.createPersonal("Popescu"));
		listaPersonal.add(fabricaAsistenti.createPersonal("Ionescu"));
		listaPersonal.add(infirmier);
		for(PersonalSpital personal: listaPersonal) {
			personal.descriere();
		}
	}
}
