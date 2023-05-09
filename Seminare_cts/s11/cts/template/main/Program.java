package cts.template.main;

import cts.template.clase.MasaLocal;
import cts.template.clase.MasaRestaurant;
import cts.template.clase.MasaRezervata;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//oricate mese am face, pt toate, metoda finala va fi apelata pt toate clasele
		MasaRestaurant masa=new MasaLocal(5);
		masa.ocupaMasa();
		System.out.println();
		MasaRestaurant masa1=new MasaRezervata(10,"16:30");
		masa1.ocupaMasa();
	}

}
