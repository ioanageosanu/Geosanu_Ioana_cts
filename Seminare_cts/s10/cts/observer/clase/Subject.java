package cts.observer.clase;

public interface Subject {
	void adaugaObserver(Observer observer);
	void stergereObserver(Observer observer);
	void notificaAbonati(String mesaj);
}
