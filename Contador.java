package util;

import java.io.Serializable;
/**
* Parte de un valor y permite su incremento
*/
public class Contador implements Serializable {

	private int valor;
	/**
	* Inicializa Contador con valor 0
	*/
	public Contador() {
		this.valor = 0;
	}
	/**
	* Inicializa Contador con un valor inicial.
	* @param inicial valor inicial del contador que puede ser negativo.
	*/
	public Contador(int inicial) {
		this.valor = inicial;
	}
	/**
	* Incrementa el contador en una unidad y devuelve su contenido.
	* @return valor actual del contador tras el incremento.
	*/
	public int inc() {
		return valor++;
	}
	/**
	* Lee el contenido del contador.
	* @return valor actual del contador.
	*/
	public int lee() {
		return valor;
	}
}