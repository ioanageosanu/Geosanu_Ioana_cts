package cts.proxy.main;

import cts.proxy.clase.IRestaurant;
import cts.proxy.clase.ProxyRestaurant;
import cts.proxy.clase.Restaurant;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IRestaurant restaurant=new Restaurant("Hush");
		restaurant.rezervareMasa(2);
		IRestaurant proxy=new ProxyRestaurant(restaurant);
		proxy.rezervareMasa(2);
		System.out.println("");
		proxy.rezervareMasa(5);

	}
}
