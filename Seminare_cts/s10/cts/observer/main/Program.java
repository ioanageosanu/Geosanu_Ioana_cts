package cts.observer.main;

import cts.observer.clase.Restaurant;
import cts.observer.clase.ClientRestaurant;
import cts.observer.clase.Observer;
import cts.observer.clase.Subject;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//problema 12
		//de fiecare data cand restaurantul schimba, anunta
		Restaurant restaurant=new Restaurant("Bonita");
		
		Observer client1=new ClientRestaurant("Vlad");
		Observer client2=new ClientRestaurant("Bogdan");
		Observer client3=new ClientRestaurant("Ionut");
		
		restaurant.adaugaObserver(client1);
		restaurant.adaugaObserver(client2);
		
		restaurant.notificaOfertaPret();
		restaurant.stergereObserver(client2);
		
		restaurant.adaugaObserver(client3);
		restaurant.notificaSchimbareMeniu();
	}
}
