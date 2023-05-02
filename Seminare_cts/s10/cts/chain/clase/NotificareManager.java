package cts.chain.clase;

public class NotificareManager extends Notificator{

	@Override
	public void notificaClient(String mesaj, Client client) {
		// TODO Auto-generated method stub
		System.out.println("clientul " +client.getNume()+" nu primeste notificare");
	}
	
}
