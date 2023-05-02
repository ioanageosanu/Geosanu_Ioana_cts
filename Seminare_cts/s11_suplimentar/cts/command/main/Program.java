package cts.command.main;

import cts.command.clase.Autobuz;
import cts.command.clase.Automobil;
import cts.command.clase.ComandPlecareInCursa;
import cts.command.clase.ManagerComenzi;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In cadrul unei autobaze este ceruta implementarea unui modul software prin care operatorul sa poata solicita plecarile pentru fiecare autobuz de la capat de linie si pe ce linie va merge (numarul liniei). Comenzile de plecare pe o anumita linie vor fi salvate intr-o colectie, iar in momentul in care autobuzul este disponibil acesta va prelua comanda de plecare in traseu.
		//Operatorul are posibilitatea sa stabileasca plecarile de la prima ora a zilei, astfel nu mai este necesara interventia acestuia pe timpul zilei
		ManagerComenzi managerComenzi=new ManagerComenzi();
		Automobil autobuz=new Autobuz(13);
		//ne facem un manager care poate prelua comenzi
		managerComenzi.invocaComanda(new ComandPlecareInCursa(10, new Autobuz(1)));
		managerComenzi.invocaComanda(new ComandPlecareInCursa(11, autobuz));
		managerComenzi.invocaComanda(new ComandPlecareInCursa(12, new Autobuz(3)));
		managerComenzi.invocaComanda(new ComandPlecareInCursa(11, autobuz));
		
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.invocaComanda(new ComandPlecareInCursa(10, new Autobuz(23)));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
	}

}
