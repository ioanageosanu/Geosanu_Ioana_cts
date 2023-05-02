package cts.chain.main;

import cts.chain.clase.Client;
import cts.chain.clase.NotificareMail;
import cts.chain.clase.NotificareManager;
import cts.chain.clase.NotificareTelefon;
import cts.chain.clase.Notificator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notificator notificatorTelefon=new NotificareTelefon();
		Notificator notificatorMail=new NotificareMail();
		Notificator notificatorManager=new NotificareManager();
		
		//luam telefonul ca primul. Daca nu merge prin tel, trimitem la succesorul prin mail, daca nu merge orin mail atunci merge la manager care nu poate face nimic
		notificatorTelefon.setSuccesor(notificatorMail);
		notificatorMail.setSuccesor(notificatorManager);
		
		Client client1=new Client("Ana","ana@yahoo.com","0722333444");
		Client client2=new Client("Ion","ion@yahoo.com","0711000888");
		Client client3=new Client("Marius",null,"0733555666");
		Client client4=new Client("Ionut",null,null);
		
		notificatorTelefon.notificaClient("mesaj", client1);
		notificatorTelefon.notificaClient("mesaj", client2);
		notificatorTelefon.notificaClient("mesaj", client3);
		notificatorTelefon.notificaClient("mesaj", client4);
		
	}

}
