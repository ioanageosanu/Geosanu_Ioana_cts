package cts.composite.main;

import cts.composite.clase.Item;
import cts.composite.clase.Produs;
import cts.composite.clase.Sectiune;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//meniu cu cele 2 sectiuni
		Item meniu= new Sectiune("Meniu");
		
		//sectiuni
		Item sectiuneBauturi = new Sectiune("Bauturi");
		Item sectiuneStarters = new Sectiune("Starters");
		
		//subsectiuni
		Item subsectiuneCafele = new Sectiune("Coffee");
		Item subsectiuneSucuri= new Sectiune("Sucuri");
		
		//Produse
		Item produseCafeaNeagra= new Sectiune("Cafea Neagra");
		Item produseCafeaAlba= new Sectiune("Cafea Alba");
		
		Item produseCocaCola= new Sectiune("Coca Cola");
		Item produsePepsi= new Sectiune("Pepsi");
		
		Item produseApaPlata= new Sectiune("Apa Plata");
		
		Item bruschete = new Produs("Bruschete");
		
		try {
			subsectiuneCafele.adaugareItem(produseCafeaNeagra);
			subsectiuneCafele.adaugareItem(produseCafeaAlba);
			
			subsectiuneSucuri.adaugareItem(produseCocaCola);
			subsectiuneSucuri.adaugareItem(produsePepsi);
			
			subsectiuneCafele.adaugareItem(produseCafeaNeagra);
			subsectiuneCafele.adaugareItem(produseCafeaNeagra);
			
			meniu.adaugareItem(sectiuneBauturi);
			meniu.adaugareItem(sectiuneStarters);
			meniu.descriere("   ");
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		
	}

}
