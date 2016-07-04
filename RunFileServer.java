package runfileserver;

import fileserver.*;
import java.rmi.registry.*;
import java.rmi.RemoteException; 

/**
* Lanza el objeto remoto ObjetoFileServer de tipo FileServer.
*/
public class RunFileServer {

	public static void main(String[] args) {

		try {
			FileServer cc = new FileServerImpl();

			Registry registro = LocateRegistry.createRegistry(1099);

			registro.rebind("ObjetoFileServer", cc);
			System.out.println("Objeto remoto 'ObjetoFileServer' enlazado.");
		} catch(RemoteException re) {
			re.printStackTrace(System.err);
		} catch(Exception e){
			e.printStackTrace(System.err);
		}
	}
}