package runserver;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

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

            registro.rebind("CajaRemota", registro);
            System.out.println("Objeto remoto enlazado");
        } catch (RemoteException re) {
            re.printStackTrace(System.err);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}