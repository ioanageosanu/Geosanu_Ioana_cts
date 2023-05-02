package cts.command.clase;

public class ComandPlecareInCursa implements IComand{
	private int numarLinie;
	private Automobil automobil;
	
	
	public ComandPlecareInCursa(int numarLinie, Automobil automobil) {
		super();
		this.numarLinie = numarLinie;
		this.automobil = automobil;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		automobil.plecareInCursa(numarLinie);
	}
	
}
