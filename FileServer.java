package fileserver;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.io.FileNotFoundException;

/**
* Interfaz que construye un objeto remoto FileLector para leer archivos de texto.
*/
public interface FileServer extends Remote {

	public FileLector abre(String nombre) throws RemoteException, FileNotFoundException;
}