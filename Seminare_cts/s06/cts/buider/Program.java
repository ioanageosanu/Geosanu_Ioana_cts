package cts.buider;

public class Program {

	public static void main(String[] args) {
		PacientBuilder pacientBuilder=new PacientBuilder("Ion");
		Pacient pacient=pacientBuilder.setMicDejuninclus(true).setNume("Ion ").setPapuciDeCamera(true).build();
		Pacient pacientNou= new PacientBuilder("Maria").build();
		System.out.println(pacient.toString());
		System.out.println(pacientNou.toString());
		pacient.setMicDejuninclus(false);
		
		Pacient pacientNou2= new PacientBuilder("Vasile").setMicDejuninclus(true).build();
		System.out.println(pacientNou2.toString());
		
		Pacient pacientNou3= pacientBuilder.setPatRabatabil(true).setNume("Andrei").build();
		System.out.println(pacientNou3.toString());
	}

}
