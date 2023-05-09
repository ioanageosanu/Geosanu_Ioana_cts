package cts.observer.clase;

public class ClientRestaurant implements Observer{
	private String nume;
	
	
	
	public ClientRestaurant(String nume) {
		super();
		this.nume = nume;
	}



	@Override
	public void receptioneazaNotificare(String mesaj) {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" ai primit o notificare "+mesaj);
	}

}
