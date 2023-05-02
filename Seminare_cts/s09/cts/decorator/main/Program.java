package cts.decorator.main;

import cts.decorator.clase.Decorator;
import cts.decorator.clase.DecoratorNotaDePlataLaMultiAni;
import cts.decorator.clase.DecoratorNotaDePlataPasteFericit;
import cts.decorator.clase.INotaDePlata;
import cts.decorator.clase.NotaDePlata;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INotaDePlata notaDePlata1=new NotaDePlata("2023-04-25");
		INotaDePlata notaDePlata2=new NotaDePlata("2023-04-26");
		
		notaDePlata1.printeazaNotaPlata(250);
		notaDePlata2.printeazaNotaPlata(400);
		System.out.println();
		
		Decorator notaDePlataDePaste=new DecoratorNotaDePlataPasteFericit(notaDePlata2);
		notaDePlataDePaste.printeazaNotaPlata(400);
		notaDePlataDePaste.printeazaFelicitare();
		System.out.println();
		
		Decorator notaDePlataLaMultiAni=new DecoratorNotaDePlataLaMultiAni(notaDePlataDePaste);
		notaDePlataLaMultiAni.printeazaNotaPlata(250);
		notaDePlataLaMultiAni.printeazaFelicitare();
		System.out.println();
		
	}

}
