package cts.state.clase;

public class StareLibera implements Stare {

	@Override
	public void schimbareStare(Masa masa) {
		// TODO Auto-generated method stub
		//daca nu e libera, o faci libera
		
		if(!(masa.getStare()instanceof StareLibera)) {
			masa.setStare(this);
			System.out.println("Masa cu numarul "+ masa.getNumar() +" este eliberata");
		}
		else {
			System.out.println("Masa este deja libera");
		}
	}
	
}
