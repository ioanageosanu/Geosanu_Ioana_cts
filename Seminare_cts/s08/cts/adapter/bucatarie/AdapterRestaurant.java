package cts.adapter.bucatarie;

public class AdapterRestaurant {
	private String denumire;

	public AdapterRestaurant(String denumire) {
		// TODO Auto-generated constructor stub
		this.denumire=denumire;
	}

	public void printeazaNota(int suma) {
		// TODO Auto-generated method stub
		System.out.println("Comanda are suma "+suma+" la restaurantul "+ this.denumire);
	}

}
