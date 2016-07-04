package cajaserver;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import cajaserver.Caja;
import util.Contador;
/**
* Implementacion de la interfaz remota Caja.
* @param <T> Tipo de dato a almacenar en la Caja.
*/
public class CajaImpl<T> extends UnicastRemoteObject implements Caja<T> {

	private T contenido = null;

	public CajaImpl() throws RemoteException {
		super();
	}

	public void pon(T a) throws RemoteException {
		contenido = a;
	}

	public T quita() throws RemoteException {
		T x = contenido;
		contenido = null;
		return x;
	}

	public T lee() throws RemoteException {
		return contenido;
	}
}