package wireless;

import java.util.ArrayList;

public class Host {
	ArrayList<Medium> connectedTo = new ArrayList<Medium>();
	String TxBuffer;
	String RxBuffer;
	String name;
	String id;
	
	//Constructors
	
	Host(String name) {
		this.name = name;
	}
	
	//Functions
	void connect(Medium M) {
		System.out.println(this.name + " connects to Medium " + M.name);
		M.connect(this);
	}
	void recieve() {
		
	}
}
