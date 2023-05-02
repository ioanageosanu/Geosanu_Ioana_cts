package cts.composite.clase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sectiune implements Item{
	private String nume;
	private List<Item>listaOptiuni;
	public Sectiune(String nume) {
		super();
		this.nume = nume;
	}
	@Override
	public void adaugareItem(Item item) throws Exception {
		// TODO Auto-generated method stub
		this.listaOptiuni.add(item);
	}
	@Override
	public void stergereItem(Item item) throws Exception {
		// TODO Auto-generated method stub
		this.listaOptiuni.remove(item);
	}
	@Override
	public void descriere(String indentare) {
		// TODO Auto-generated method stub
		System.out.println(indentare+this.nume);
		for (Item item : this.listaOptiuni) {
			item.descriere(indentare+ " ");
			
		}
	}
	@Override
	public Item getItem(int index) throws Exception {
		// TODO Auto-generated method stub
		return this.listaOptiuni.get(index);
	}
	
	
}
