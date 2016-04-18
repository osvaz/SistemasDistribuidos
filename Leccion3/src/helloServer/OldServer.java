package helloServer;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OldServer implements Hello {

    public OldServer() {}

    public String sayHello() {
	return "Hello, world!";
    }

    public static void main(String args[]) {

		try {
		    OldServer obj = new OldServer();
		    Hello stub = (Hello) UnicastRemoteObject.exportObject((Remote) obj, 0);
	
		    // Bind the remote object's stub in the registry
		    Registry registry = LocateRegistry.getRegistry();
		    registry.bind("Hello", (Remote) stub);
	
		    System.err.println("Old version Server ready");
		} catch (Exception e) {
		    System.err.println("Server exception: " + e.toString());
		    e.printStackTrace();
		}
    }
}
