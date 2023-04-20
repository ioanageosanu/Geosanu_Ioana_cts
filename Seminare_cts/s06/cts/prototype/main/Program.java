package cts.prototype.main;

import java.util.HashMap;
import java.util.Map;

import cts.prototype.IReteta;
import cts.prototype.Reteta;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//realizam prototip iReteta
		Map<String,Float>solutii=new HashMap<>();
		solutii.put("Acid salicilic", (float) 20);
		solutii.put("Acid azotic", (float) 30);
		solutii.put("Clorura de potasiu", (float) 10);
		
		IReteta prototype=new Reteta("Reteta",solutii,60);
		Reteta farmacie=(Reteta)prototype.copiazaReteta();
		farmacie.setNume("Reteta farmaciei");
		System.out.println(farmacie.toString());
		Reteta laborator=(Reteta)prototype.copiazaReteta();
		laborator.setNume("Reteta laboratorului");
		System.out.println(laborator.toString());
		//creez noi obiecte farmacie si laborator fara sa apelez constructorul
	}

}
