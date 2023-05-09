package cts.facade.main;

import cts.facade.clase.Restaurant;

public class Program {

	public static void main(String[] args) {
		//EX 6
		// TODO Auto-generated method stub
		Restaurant restaurant=new Restaurant();
		System.out.println(restaurant.verificareDisponibilitateMasa(10));
		System.out.println(restaurant.verificareDisponibilitateMasa(20));
		System.out.println(restaurant.verificareDisponibilitateMasa(30));
	}

}
