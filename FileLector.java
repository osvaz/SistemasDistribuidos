package fileserver;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
* Interfaz para leer las lineas secuencialmente de un archivo de texto.
*/
public interface FileLector extends Remote {

	/**
	* Utiliza BufferedReader.readLine() para leer las lineas del archivo.
	* @return String con la linea actual del archivo.
	* @throws RemoteException
	* @throws IOException del mismo modo que BufferedReader->readLine()
	*/
	String leeLinea() throws RemoteException, IOException;
}