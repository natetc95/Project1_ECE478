package wireless;

public class Environment {

	public void run() {
        System.out.println("Hello World!"); // Display the string.
        Medium M = new Medium();
        Host A = new Host("Nate's Computer");
        Host B = new Host("Ivan's Computer");
        Host C = new Host("David's iPhone");
        Host D = new Host("Berto's Android");
        A.connect(M);
        B.connect(M);
        C.connect(M);
        D.connect(M);
        M.listClients();
    }
}