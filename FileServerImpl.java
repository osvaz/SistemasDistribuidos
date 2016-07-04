package fileserver;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.io.FileNotFoundException;

/**
* Implementacion de FileServer
*/
public class FileServerImpl extends UnicastRemoteObject implements FileServer {

	public FileServerImpl() throws RemoteException {
		super();
	}

	public FileLector abre(String nombre) throws RemoteException, FileNotFoundException {

		return new FileLectorImpl(nombre);
	}
}