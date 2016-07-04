package cajaclientrmi;

import cajaserver.Caja;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import util.Contador;
import java.io.Serializable;

/**
* Introduce en Caja un elemento Contador con valor 1
*/
public class CajaClientRMIset {

	public static void main(String[] args) {

		Contador c = new Contador();
		c.inc();
		System.out.println("Valor del nuevo contador: "+c.lee());
		try {
			Caja caja = (Caja) Naming.lookup("rmi://localhost:1099/CajaRemota");
			caja.pon(c);
		} catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}
}