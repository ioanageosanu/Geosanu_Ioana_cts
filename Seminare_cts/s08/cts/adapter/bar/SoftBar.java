package cts.adapter.bar;

public class SoftBar implements ISoftBar {
	private String denumire;

	public SoftBar(String denumire) {
		super();
		this.denumire = denumire;
	}

	@Override
	public void printeazaNotaBauturi(double totalSuma) {
		// TODO Auto-generated method stub
		System.out.println("Comanda are suma "+totalSuma+" la barul "+ this.denumire);
	}
	
}
