package ejemplo.sincronizacion;

public class Main {
	
	public static void main(String[] args) {
		
		ColaStrings cola = new ColaStrings();
		Runnable genera = new Productor(cola);
		Runnable come = new Consumidor(cola);
		
		new Thread(genera).start();
		new Thread(come).start();
	}
}
