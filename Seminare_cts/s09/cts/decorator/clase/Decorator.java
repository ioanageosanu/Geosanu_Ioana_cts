package cts.decorator.clase;

public abstract class Decorator implements INotaDePlata{
	private INotaDePlata notaDePlata;

	public Decorator(INotaDePlata notaDePlata) {
		this.notaDePlata = notaDePlata;
	}
	
	
	@Override
	public void printeazaNotaPlata(double totalPlata) {
		this.notaDePlata.printeazaNotaPlata(totalPlata);
	}

	public abstract void printeazaFelicitare();
}
