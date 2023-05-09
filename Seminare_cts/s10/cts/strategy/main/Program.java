package cts.strategy.main;

import cts.strategy.clase.Client;
import cts.strategy.clase.PlataCard;
import cts.strategy.clase.PlataCash;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//problema 11
		//la runtime schimbam strategia, schimbam modul de plata
		Client client1=new Client("Andrei");
		client1.realizeazaPlata(2000.0);
		client1.setModPlata(new PlataCard());
		
		client1.realizeazaPlata(336.0);
		client1.setModPlata(new PlataCash());
		
	}

}
