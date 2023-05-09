package cts.chain.clase;

public class NotificareMail extends Notificator{

	@Override
	public void notificaClient(String mesaj, Client client) {
		// TODO Auto-generated method stub
		if(client.getAdresaMail()!=null) {
			System.out.println("Clientul "+client.getNume()+ " primeste mail cu mesajul "+mesaj);
		}
		else {
			if(super.getSuccesor()!=null) {
				super.getSuccesor().notificaClient(mesaj, client);
			}
			else {
				System.out.println("Clientul "+client.getNume()+" nu poate fi notificat");
			}
		}
	}

}
