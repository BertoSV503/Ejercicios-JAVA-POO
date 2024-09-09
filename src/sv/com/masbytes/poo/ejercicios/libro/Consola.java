package sv.com.masbytes.poo.ejercicios.libro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Consola {
	
	//	Objeto Scanner que leera los datos ingresados por el usuario.
	static Scanner input = new Scanner (System.in);
	
	//	Metodo que solicita al usuario el ingreso del titulo del libro.
	public static String solicitaTitulo(String mensaje) {
		String titulo = "S/T";
		boolean tituloValido = false;
		while(!tituloValido) {
			try {
				System.out.println(mensaje);
				titulo = input.nextLine();
				if(!titulo.isEmpty()) {
					tituloValido = true;
				} else {
					System.out.println("El titulo no puede estar en blanco.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Ingrese un dato valido por favor.");
				input.nextLine();
			}
		}
		return titulo;
	}
	
	//	Metodo que solicita al usuario el ingreso del nombre del autor del libro.
	public static String solicitaAutor(String mensaje) {
		String autor = "Anonimo";
		boolean autorValido = false;
		while(!autorValido) {
			try {
				System.out.println(mensaje);
				autor = input.nextLine();
				if(!autor.isEmpty()) {
					autorValido = true;
				} else {
					System.out.println("El autor no puede estar en blanco.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Ingrese un dato valido por favor.");
				input.nextLine();
			}			
		}
		return autor;
	}
	
	//	Metodo que solicita al usuario el ingreso del año de publicacion del libro.
	public static int solicitaAnioPublicacion(String mensaje) {
		int anioPublicacion = 0;
		boolean anioValido = false;
		while(!anioValido) {
			try {
				System.out.println(mensaje);
				anioPublicacion = input.nextInt();
				if(anioPublicacion > 0) {
					anioValido = true;
				} else {
					System.out.println("Ingrese un año correcto de publicacion. Si lo desconoce ingrese 0.");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Ingrese un dato valido por favor.");
				input.nextLine();
			}
		}
		return anioPublicacion;
	}

}
