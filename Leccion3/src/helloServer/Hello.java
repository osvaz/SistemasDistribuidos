package helloServer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello {

	String sayHello() throws RemoteException;
}