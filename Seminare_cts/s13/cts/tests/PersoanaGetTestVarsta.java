package cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.MyException;
import clase.Persoana;

public class PersoanaGetTestVarsta {

	@Test
	public void getVarstaRightTest() {
		Persoana p=new Persoana("Tiberiu","5001020046230");
		assertEquals(21, p.getVarsta());
	}

	//la boundary verificam pt o persoana nascuta ieri; la boundary definim intervale
	@Test
	public void getVarstaBoundaryNouNascut() {
		Persoana p=new Persoana("Tiberiu","5230522046230");
		assertEquals(0, p.getVarsta());
	} 
	//testam pentru o persoana nascuta pe 1 ian 2000 -->  boundary inferior
	@Test
	public void getVarstaBoundaryAn2000() {
		Persoana p=new Persoana("Tiberiu","5000101046230");
		assertEquals(23, p.getVarsta());
	} 
	
	//boundary superior 31 dec 1999
	@Test
	public void getVarstaBoundarySuperior() {
		Persoana p=new Persoana("Tiberiu","4991231046230");
		assertEquals(23, p.getVarsta());
	} 
	//cross check => ceva de genul prin aflarea varstei obtinem cnp
	@Test(expected = MyException.class)
	public void getVarstaException() {
		Persoana p=new Persoana("Tiberiu","4991231046230");
		p.getVarsta();
	} 
	
	@Test(timeout=100)
	public void getVarstaTimeout() {
		Persoana p=new Persoana("Tiberiu","4991231046230");
		p.getVarsta();
	} 
}
