package cts.command.clase;

public class Autobuz implements Automobil{
	private int numar;
	
	public Autobuz(int numar) {
		super();
		this.numar = numar;
	}

	@Override
	public void plecareInCursa(int numarLinie) {
		// TODO Auto-generated method stub
		System.out.println("Autobuzul cu numarul "+this.numar+" a plecat in cursa pe linia "+numarLinie);
	}

}
