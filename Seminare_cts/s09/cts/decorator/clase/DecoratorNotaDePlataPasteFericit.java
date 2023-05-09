package cts.decorator.clase;

public class DecoratorNotaDePlataPasteFericit extends Decorator{

	public DecoratorNotaDePlataPasteFericit(INotaDePlata notaDePlata) {
		super(notaDePlata);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void printeazaNotaPlata(double totalPlata) {
		// TODO Auto-generated method stub
		super.printeazaNotaPlata(totalPlata);
		System.out.println("Paste Fericit!");
	}



	@Override
	public void printeazaFelicitare() {
		System.out.println("Paste Fericit!");
		
	}
	
}
