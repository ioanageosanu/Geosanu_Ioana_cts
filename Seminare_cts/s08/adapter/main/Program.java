package adapter.main;

import cts.adapter.bar.ISoftBar;
import cts.adapter.bar.SoftBar;
import cts.adapter.bucatarie.AdapterObiecteRestaurant;
import cts.adapter.bucatarie.AdapterRestaurant;
import cts.adapter.bucatarie.Bucatarie;
import cts.adapter.bucatarie.ISoftRestaurant;

public class Program {
	
	public static void imprimare(ISoftRestaurant restaurant,int totalNota) {
		restaurant.printeazaNota(totalNota);
	}

	public static void main(String[] args) {
		ISoftBar bar = new SoftBar("Alcadibo");
		bar.printeazaNotaBauturi(240);
		
		ISoftRestaurant bucatarie = new Bucatarie("George");
		Program.imprimare(bucatarie,500);
		
		AdapterRestaurant adapter = new AdapterRestaurant("Alcadibo");
		adapter.printeazaNota(500);
		
		AdapterObiecteRestaurant adapterObiecte=new AdapterObiecteRestaurant(bar);
		imprimare(adapterObiecte,150);
	}

}
