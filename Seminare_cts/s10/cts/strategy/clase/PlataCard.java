package cts.strategy.clase;

public class PlataCard implements ModPlata{

	@Override
	public void plateste(String numeClient, double sumaPlata) {
		// TODO Auto-generated method stub
		System.out.println("Clientul "+numeClient+" realizeaza plata cu cardul pentru suma de "+sumaPlata);
	}

}
