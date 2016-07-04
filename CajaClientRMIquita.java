package cajaclientrmi;

import cajaserver.Caja;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import util.Contador;

/**
* Quita el elemento de la Caja
*/
public class CajaClientRMIquita {

	public static void main(String[] args) {

		Contador c = null;
		try {
			Caja caja = (Caja) Naming.lookup("rmi://localhost:1099/CajaRemota");
			c = (Contador) caja.lee();
			if(null != c) {
				System.out.println("Valor de la caja: "+c.lee());
				caja.quita();
				System.out.println("Caja vaciada.");
			} else {
				System.out.println("La caja esta vacia.");
			}
		} catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}
}