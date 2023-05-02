package cts.template.clase;

public class MasaRezervata extends MasaRestaurant{
	
	private String oraRezervare;
	
	

	public MasaRezervata(int numarMasa,String oraRezervare) {
		super(numarMasa);
		this.oraRezervare=oraRezervare;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void curataMasa() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul curata masa "+this.getNumarMasa()+" pentru rezervarea de la ora "+this.oraRezervare);
	}

	@Override
	public void asazaServetelele() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul asaza servetele pe masa "+this.getNumarMasa()+" pentru rezervarea de la ora "+this.oraRezervare);
	}

	@Override
	public void puneTacamuri() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul pune tacamuri pe masa "+this.getNumarMasa()+" pentru rezervarea de la ora "+this.oraRezervare);
		
	}

	@Override
	public void invitaPersoane() {
		// TODO Auto-generated method stub
		System.out.println("Va asteptam la masa "+this.getNumarMasa()+" la ora "+this.oraRezervare);
	}

}
