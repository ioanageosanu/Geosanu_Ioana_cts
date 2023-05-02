package cts.decorator.clase;

public class DecoratorNotaDePlataLaMultiAni extends Decorator{
	

	public DecoratorNotaDePlataLaMultiAni(INotaDePlata notaDePlata) {
		super(notaDePlata);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printeazaFelicitare() {
		System.out.println("La multi ani");
		
	}
	
}
