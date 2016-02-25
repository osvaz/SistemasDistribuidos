package ejemplo.reloj;

public class TimePrinter implements Runnable {
	
	public void run() {
		while(true) {
			System.out.println(new java.util.Date());
			try {
				Thread.sleep(1000); //Duerme proceso 1000 milisegundos
			} catch(InterruptedException x) {}
		}
	}
	
	public static void main(String[] args) {
		
		final Runnable tarea = new TimePrinter();
		Thread hilo1 = new Thread(tarea, "Hilo1 de TimePrinter");
		Thread hilo2 = new Thread(tarea, "Hilo2 de TimePrinter");
		hilo1.start();
		hilo2.start();
		
		
	}
}
