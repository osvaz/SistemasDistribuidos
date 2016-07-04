package holaServer;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class RunHola {

	public static void main(String[] args) {

		try {
			HolaImpl oRemoto = new HolaImpl();
			Registry registro = LocateRegistry.getRegistry("localhost");
			registro.rebind("ObjetoHola", oRemoto);
			System.out.println("Servidor preparado.");
		} catch(Exception e) {
			System.err.println("Excepcion del servidor: "+e.toString());
			e.printStackTrace();
		}
	}
}