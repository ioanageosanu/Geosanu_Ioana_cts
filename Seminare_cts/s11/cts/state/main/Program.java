package cts.state.main;

import cts.state.clase.Masa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Masa masa=new Masa(12);
		
		masa.eliberareMasa();
		masa.ocupaMasa();
		masa.rezervaMasa();
		masa.ridicaRezervare();
		masa.ocupaMasa();
		masa.eliberareMasa();
		masa.rezervaMasa();
	}

}
