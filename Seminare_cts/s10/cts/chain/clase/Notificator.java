package cts.chain.clase;

public abstract class Notificator {
	private Notificator succesor;

	public void setSuccesor(Notificator succesor) {
		this.succesor = succesor;
	}

	
	public Notificator getSuccesor() {
		return succesor;
	}


	//handler
	public abstract void notificaClient(String mesaj, Client client);
	
}
