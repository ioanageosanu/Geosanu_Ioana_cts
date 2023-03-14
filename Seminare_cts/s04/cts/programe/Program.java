package cts.programe;

import cts.registru.Firma;
import cts.registru.Registru;

public class Program {
 public static void main(String[]args) {
	 Registru registru=new Registru();
	 Registru registruNou=new Registru();
	 
	 Firma f1=registru.getFirma("SC nume1 SRL");
	 Firma f2=registru.getFirma("SC nume2 SRL");
	 Firma f3=registruNou.getFirma("SC nume1 SRL");
//	 Firma f4=new Firma("SC nume1 SRL",0);
	 
	 f1.angajeaza();
	 f2.angajeaza();
	 f3.angajeaza();
	 System.out.println(f1.toString());
	 System.out.println(f2.toString());
	 System.out.println(f3.toString());
 }
}
