package cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	private List<IComand> comenzi=new ArrayList<>();
	
	public void invocaComanda(IComand comand) {
		comenzi.add(comand);
	}
	public void executaComanda() {
		if(this.comenzi.size()!=0) {
			this.comenzi.get(0).execute();
			this.comenzi.remove(this.comenzi.get(0));
		}
	}
}
