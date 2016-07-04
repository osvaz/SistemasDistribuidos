package runserver;

import java.rmi.registry.*;
import java.rmi.RemoteException;
import cajaserver.CajaImpl;
import util.Contador;
/**
* Lanza el servidor de Caja(s) de Contador(es)
*/
public class RunCaja {

	public static void main(String[] args) {
		try {
			CajaImpl<Contador> cc = new CajaImpl<Contador>();

			Registry registro = LocateRegistry.createRegistry(1099);

			registro.rebind("CajaRemota", cc);
			System.out.println("Objeto remoto enlazado.");
		} catch(RemoteException e) {
			e.printStackTrace(System.err);
		} catch(Exception ex) {
			ex.printStackTrace(System.err);
		}
	}
}