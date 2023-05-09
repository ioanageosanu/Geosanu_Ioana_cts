package cts.state.clase;

public class StareOcupata implements Stare{

	@Override
	public void schimbareStare(Masa rez) {
		// TODO Auto-generated method stub
		if(rez.getStare() instanceof StareOcupata) {
			rez.setStare(this);
			System.out.println("Masa cu numarul "+rez.getNumar() +" este ocupata");
		}
		else {
			System.out.println("Masa nu poate fi ocupata");
		}
	}
	
}
