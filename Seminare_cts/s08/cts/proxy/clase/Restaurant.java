package cts.proxy.clase;

public class Restaurant implements IRestaurant{
	private String nume;
	
	public Restaurant(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void rezervareMasa(int numarPersoane) {
		System.out.println("Rezervarea a fost realizata pentru "+numarPersoane+" persoane la restaurantul "+ this.nume);
		
	}

}
