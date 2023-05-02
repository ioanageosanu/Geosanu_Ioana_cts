package cts.strategy.clase;

public class PlataCash implements ModPlata{

	@Override
	public void plateste(String numeClient, double sumaPlata) {
		// TODO Auto-generated method stub
		System.out.println("Clientul "+numeClient+" realizeaza plata cash pentru suma de "+sumaPlata);
	}

}
