package cts.singleton;

public class Program {
	public static void main(String[]args) {
//		Rector rector=Rector.getInstanta("Vasile", 2, 40);
//		Rector r=Rector.getInstanta("Ion", 1, 43);
//		System.out.println(rector);
//		System.out.println(r);
//		
//		Decan decan1 = Decan.getInstanta();
//		Decan decan2 = Decan.getInstanta();
//		decan2.setNume("Ionel");
//		System.out.println(decan1.getNume());
//		System.out.println(decan2.getNume());
		
		
		Firma f1=Firma.getFirma("SC Turda SRL");
		Firma f2=Firma.getFirma("SC Altex SRL");
		Firma f3=Firma.getFirma("SC Turda SRL");
		f1.setNumarAngajati(10);
		f2.setNumarAngajati(20);
		f3.setNumarAngajati(30);
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
	}
}
