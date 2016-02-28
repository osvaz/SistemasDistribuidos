package ejemplo.sincronizacion;

public class Consumidor implements Runnable {

	private final ColaStrings cola;
	
	public Consumidor(ColaStrings c) {
		
		this.cola = c;
	}
	
	public void run() {
		
		String linea;
		
		while(true) {
			linea = cola.pop();
			System.out.println(">> "+linea); // Imprime
		}
	}
}
