package cts.template.clase;

public abstract class MasaRestaurant {
	private int numarMasa;

	public MasaRestaurant(int numarMasa) {
		this.numarMasa = numarMasa;
	}
	
	public int getNumarMasa() {
		return numarMasa;
	}

	public void setNumarMasa(int numarMasa) {
		this.numarMasa = numarMasa;
	}

	protected abstract void curataMasa();
	protected abstract void asazaServetelele();
	protected abstract void puneTacamuri();
	protected abstract void invitaPersoane();
	
	public final void ocupaMasa() {
		curataMasa();
		asazaServetelele();
		puneTacamuri();
		invitaPersoane();
	}
}
