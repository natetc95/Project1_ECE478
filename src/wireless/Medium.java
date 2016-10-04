package wireless;

import java.util.ArrayList;

public class Medium {
	//Values
	String name;
	String type;
	int nClients;
	ArrayList<Host> clients = new ArrayList<Host>();
	String traffic;
	
	//Constructors
	Medium(String name) {
		this.name = name;
		this.nClients = 0;
		this.type = "Wireless";
	}
	Medium() {
		this.name = "Default";
		this.nClients = 0;
		this.type = "Wireless";
	}
	
	//Functions
	void connect(Host h) {
		this.clients.add(h);
		this.nClients = clients.size();
	}
	void disconnect(Host h) {
		clients.remove(h);
		this.nClients = clients.size();
	}
	void listClients() {
		int len = clients.size();
		String l;
		if (len == 1) {
			l = " client:";
		}
		else {
			l = " clients:";
		}
		System.out.println("Medium " + this.name + " contains " + this.nClients + l);
		for (int i = 0; i < len; i++) {
			System.out.println("   - " + clients.get(i).name);
		}
	}


}
