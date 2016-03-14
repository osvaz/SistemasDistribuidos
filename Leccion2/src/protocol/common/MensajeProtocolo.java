package protocol.common;

import java.util.*;
import java.io.*;

public class MensajeProtocolo {

	private Primitive primitiva;
	private String mensaje;
	
	MensajeProtocolo(Primitive p) {
        /* hemos incluido dos assert por la peligrosidad del constructor
        * recordad que hay que activar expresamente la evaluación
        * de asserts en la JVM */
		assert p.isCompound() == false;
		
		this.primitiva = p;
		this.mensaje = "";
	}
	MensajeProtocolo(Primitive p, String m) {
		assert p.isCompound() == true && m != null;
		this.primitiva = p;
		this.mensaje = m;
	}
	Primitive getPrimitive() { return this.primitiva; }
	String getMessage() { return this.mensaje; }
	
	public String toString() { /*prettyPrinter de la clase */
		String prettyPrint = "["+this.primitiva;
		switch(this.primitiva) {
		case HELLO: ;
		case PUSH: ;
		case PULL_OK: ;
			return "["+this.primitiva+":"+this.mensaje+"]";
		default:
			return "["+this.primitiva+"]";
		}
	}
}