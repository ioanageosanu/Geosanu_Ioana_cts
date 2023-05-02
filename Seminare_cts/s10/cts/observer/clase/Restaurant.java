package cts.observer.clase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Restaurant implements Subject{
	private String numeRestaurant;
	private List<Observer>clientiAbonati;
	
	
	public Restaurant(String numeRestaurant) {
		super();
		this.numeRestaurant = numeRestaurant;
		this.clientiAbonati = new ArrayList<>();
	}

	@Override
	public void adaugaObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.clientiAbonati.add(observer);
	}

	@Override
	public void stergereObserver(Observer observer) {
		// TODO Auto-generated method stub
		this.clientiAbonati.remove(observer);
	}

	@Override
	public void notificaAbonati(String mesaj) {
		// TODO Auto-generated method stub
		for(Observer clientiAbonati:this.clientiAbonati) {
			clientiAbonati.receptioneazaNotificare(mesaj);
		}
	}
	public void notificaOfertaPret() {
		this.notificaAbonati(numeRestaurant + "Sunt reduceri de pret la shaorma");
	}
	public void notificaSchimbareMeniu() {
		notificaAbonati(numeRestaurant+" Avem produse noi la fructe de mare");
	}
}
