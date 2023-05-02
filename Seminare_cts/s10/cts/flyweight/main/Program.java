package cts.flyweight.main;

import cts.flyweight.clase.FabricaClienti;
import cts.flyweight.clase.IClient;
import cts.flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//problema 10
		FabricaClienti fabricaClienti=new FabricaClienti();
		Rezervare rezervare1=new Rezervare(1,1,2,16);
		Rezervare rezervare2=new Rezervare(2,2,4,14);
		Rezervare rezervare3=new Rezervare(3,1,2,18);
		Rezervare rezervare4=new Rezervare(4,3,1,12);
		
		IClient client1=fabricaClienti.getClient("Maria");
		client1.descriereDetaliiRezervare(rezervare1);
		
		IClient client2=fabricaClienti.getClient("Ion");
		client2.descriereDetaliiRezervare(rezervare2);
		
		fabricaClienti.getClient("Maria").descriereDetaliiRezervare(rezervare3);
		fabricaClienti.getClient("Ion").descriereDetaliiRezervare(rezervare4);
	}

}
