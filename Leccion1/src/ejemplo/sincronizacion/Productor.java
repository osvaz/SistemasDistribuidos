package ejemplo.sincronizacion;

import java.io.*;

public class Productor implements Runnable {

	private final ColaStrings cola;
	
	public Productor(ColaStrings c) {
		
		this.cola = c;
	}
	
	public void run() {
		
		final Reader r1 = new InputStreamReader(System.in);
		final BufferedReader teclado = new BufferedReader(r1);
		
		String linea;
		try {
			while((linea = teclado.readLine()) != null) { // Lee del teclado
				cola.push(linea);
			}
		} catch(final IOException x) {x.printStackTrace(System.err); }
	}
}
