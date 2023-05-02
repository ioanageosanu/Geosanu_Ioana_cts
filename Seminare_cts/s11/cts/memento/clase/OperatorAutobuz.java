package cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

//cel care se ocupa de schimbari => operatorul

public class OperatorAutobuz {
	List<AutobuzMemento> listaMemento=new ArrayList<>();
	
	//o metoda prin intermediul careia sa adaugam un memento in lista
	public void adaugaMemento(AutobuzMemento memento) {
		this.listaMemento.add(memento);
	}
	
	//o metoda care sa ne returrneze un memento din lista
	public AutobuzMemento getMemento(int pozitie) {
		return this.listaMemento.get(pozitie);
	}
}
