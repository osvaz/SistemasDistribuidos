package fileservercliente;

import fileserver.*;
import java.rmi.Naming;
import java.io.*;
import java.util.Scanner;

/**
* Cliente de prueba de FileServer.
*/
public class FileServerCliente {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el nombre del archivo: ");
		String nombreArchivo = teclado.nextLine();
		FileLector fl;
		FileServer fs;
		String linea;

		try {
			fs = (FileServer) Naming.lookup("rmi://localhost:1099/ObjetoFileServer");
			fl = fs.abre(nombreArchivo);
			while((linea = fl.leeLinea()) != null) {
				System.out.println(nombreArchivo+": "+linea);
			}
		} catch(EOFException eofe) {
			System.err.println("Archivo finalizado con EOFException.");
		} catch(FileNotFoundException fnfe) {
			System.err.println("El archivo "+"\""+nombreArchivo+"\""+" no existe.");
		} catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}
}