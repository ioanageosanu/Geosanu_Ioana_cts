package cts.flyweight.clase;

import java.util.HashMap;

public class FabricaClienti {
	//in map punem cheia pt client, adica numele
	private HashMap<String,IClient> clienti;

	public FabricaClienti() {
		clienti=new HashMap<String,IClient>();
	}
	public IClient getClient(String numeClient) {
		if(clienti.get(numeClient)!=null) {
			return clienti.get(numeClient);
		}
		else {
			IClient client=new Client(numeClient,"Nespecificat","Nespecificat");
			clienti.put(numeClient, client);
			return client;
		}
	}
}
