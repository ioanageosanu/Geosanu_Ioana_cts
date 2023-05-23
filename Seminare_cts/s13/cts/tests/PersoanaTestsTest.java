package cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.MyException;
import clase.Persoana;

public class PersoanaTestsTest {

	@Test
	public void testGetRightSexMasculin()  {
		
		
		Persoana p=new Persoana("Tiberiu","5001020046230");
		assertEquals("M", p.getSex());
		
	}
	
	@Test
	public void testGetRightSexFeminin()  {
		
		Persoana p1=new Persoana("Ioana","6001020046230");
		assertEquals("F", p1.getSex());
		
	}
	
	@Test
	public void testGetBoundarySexMasculin() {
		
		Persoana p1=new Persoana("Tiberiu","5001020046230");
		assertEquals("M", p1.getSex());
		
	}
	
	@Test
	public void testGetCrossCheckSexMasculin() {
		
		Persoana p=new Persoana("Tiberiu","5001020046230");
		assertEquals(verificareParitate(p.CNP), 0);
		
	}
	//cross check implica verificarea unei metode prin intermediul alteia
	
	public String verificareParitate(String CNP) {
		int n=Integer.parseInt(CNP.charAt(0)+"");
		if(n%2!=0) {
			return "M";
		}
		return "F";
	}
	
	@Test(expected = MyException.class)
	public void testGetSexError() {
		
		Persoana p=new Persoana("Tiberiu","9001020046230");
		p.getSex();
		
	}
	
	//right bicep
	@Test(timeout = 100)
	public void testGetSexPerformance() {
		
		Persoana p=new Persoana("Tiberiu","9001020046230");
		p.getSex();
		
	}
	
	

}
