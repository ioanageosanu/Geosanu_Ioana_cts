package cts.facade.clase;

public class Restaurant {
	
	private MeseRestaurant meseRestaurant;
	private Ospatar ospatar;
	
	public Restaurant() {
		//initializam atribut
		//facade e restaurantul
		meseRestaurant=new MeseRestaurant();
		meseRestaurant.adaugareMasa(new Masa(true,10,true));
		meseRestaurant.adaugareMasa(new Masa(false,20,true));
		meseRestaurant.adaugareMasa(new Masa(true,30,false));
		ospatar=new Ospatar();
		ospatar.debaraseazaMasa(10);
		ospatar.debaraseazaMasa(20);
	}
		

	public String verificareDisponibilitateMasa(int nrMasa) {
		if (meseRestaurant.esteLibera(nrMasa)) {
			if (ospatar.esteDebarasata(nrMasa) &&meseRestaurant.suntServeteleleNoi(nrMasa)) {
				return "Masa este libera si puteti lua loc";
			}
			else {
				return "Masa nu este disponibila momentan";
			}
		}
		else {
			return "Masa este libera, dar asteptati sa fie debarasata";
		}
	}
}
