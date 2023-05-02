package cts.template.clase;

public class MasaLocal extends MasaRestaurant{


	public MasaLocal(int numarMasa) {
		super(numarMasa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void curataMasa() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul curata masa "+this.getNumarMasa());
	}

	@Override
	public void asazaServetelele() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul asaza servetelele pe masa "+this.getNumarMasa());
		
	}

	@Override
	public void puneTacamuri() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul pune tacamuri pe masa "+this.getNumarMasa());
		
	}

	@Override
	public void invitaPersoane() {
		// TODO Auto-generated method stub
		System.out.println("Chelnerul invita persoanele la masa "+this.getNumarMasa());
		
	}

}
