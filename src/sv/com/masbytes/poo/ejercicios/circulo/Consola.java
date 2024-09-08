package sv.com.masbytes.poo.ejercicios.circulo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Consola {

	private static Scanner input = new Scanner(System.in);

	public static double pideRadio(String mensaje) {
		double radio = 0.0;
		boolean radioValido = false;
		while (!radioValido) {
			try {
				System.out.println(mensaje);
				radio = input.nextDouble();
				if (radio > 0.0) {
					radioValido = true;
				} else {
					System.out.println("Ingrese un radio mayor a 0 : ");
				}
			} catch (InputMismatchException e) {
				System.out.println("Digite un dato valido por favor!");
				input.next(); // Limpiar el buffer
			}
		}
		return radio;
	}

}
