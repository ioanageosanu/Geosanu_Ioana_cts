package cts.state.clase;

public class StareRezervata implements Stare{

	@Override
	public void schimbareStare(Masa rez) {
		// TODO Auto-generated method stub
		if(rez.getStare() instanceof StareLibera) {
			rez.setStare(this);
			System.out.println("Masa cu numarul "+rez.getNumar() +" este rezervata");
		}
		else {
			System.out.println("Masa nu poate fi rezervata");
		}
	}

}
