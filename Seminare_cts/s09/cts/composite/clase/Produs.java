package cts.composite.clase;

public class Produs implements Item{
	private String nume;
	

	public Produs(String nume) {
		this.nume = nume;
	}

	@Override
	public void adaugareItem(Item item) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("AdaugareItem nu e implementat");
	}

	@Override
	public void stergereItem(Item item) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("stergereItem nu e implementat");
	}

	@Override
	public void descriere(String indentare) {
		// TODO Auto-generated method stub
		System.out.println(indentare+this.nume);
	}

	@Override
	public Item getItem(int index) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("getItem nu e implementat");
	}
	
}
