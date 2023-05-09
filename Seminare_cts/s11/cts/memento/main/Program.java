package cts.memento.main;

import cts.memento.clase.Autobuz;
import cts.memento.clase.OperatorAutobuz;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//consum optim de memorie => facem clasa separata
		//e memento pt ca trebuie sa ne tot intoarcem
		
		Autobuz autobuz=new Autobuz("Ion",15,"Mercedes",2017,44);
		OperatorAutobuz operator=new OperatorAutobuz();
		operator.adaugaMemento(autobuz.creareMemento());
		System.out.println(autobuz.toString());
		
		autobuz.setNumeSofer("Vasile");
		autobuz.setConsumMediu(17);
		System.out.println(autobuz.toString());
		//daca vreau sa fac o revenire, pe autobuz fac restaurare pe baza unui memento luat din operator
		autobuz.restaurareAutobuz(operator.getMemento(0));
		//punem de 0 pt ca avem unul singur
		System.out.println(autobuz.toString());
	}

}
