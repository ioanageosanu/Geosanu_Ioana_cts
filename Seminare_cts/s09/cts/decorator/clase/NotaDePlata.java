package cts.decorator.clase;

public class NotaDePlata implements INotaDePlata{
	private String dataEmiterii;
	
	
	
	public NotaDePlata(String dataEmiterii) {
		super();
		this.dataEmiterii = dataEmiterii;
	}



	@Override
	public void printeazaNotaPlata(double totalPlata) {
		// TODO Auto-generated method stub
		System.out.println("Nota dvs de plata din data de "+this.dataEmiterii+" este in valoare de "+totalPlata);
	}
	
}
