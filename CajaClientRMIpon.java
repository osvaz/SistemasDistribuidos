package cajaclientrmi;

import cajaserver.Caja;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import util.Contador;

/**
* Lee el valor de la Caja, lo incrementa y lo vuelve a volcar.
* Si la Caja está vacía se queja.
*/
public class CajaClientRMIpon {

	public static void main(String[] args) {

		Contador c = null;
		try {
			Caja caja = (Caja) Naming.lookup("rmi://localhost:1099/CajaRemota");
			c = (Contador) caja.lee();
			if(null != c) {
				c.inc();
				caja.pon(c);
				System.out.println("Valor de la caja: "+((Contador) caja.lee()).lee());
			} else {
				System.out.println("La caja esta vacia.");
			}
		} catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}
}