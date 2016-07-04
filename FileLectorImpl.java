package fileserver;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.io.*;

/**
* Implementacion de la interfaz FileLector
*/
public class FileLectorImpl extends UnicastRemoteObject implements FileLector {

	private final BufferedReader br;

	public FileLectorImpl(String nombre) throws RemoteException, FileNotFoundException {

		super();
		this.br = new BufferedReader(new FileReader(nombre));
	}

	public String leeLinea() throws RemoteException, IOException {

		return br.readLine();
	}
}