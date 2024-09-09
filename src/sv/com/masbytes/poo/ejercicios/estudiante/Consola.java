package sv.com.masbytes.poo.ejercicios.estudiante;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Consola {

	//	Objeto Scanner que leera la info que ingrese el usuario.
	static Scanner input = new Scanner(System.in);

	//	Metodo que solicita los nombres del estudiante al usuario
	public static String solicitaNombres(String mensaje) {
		String nombres = "No Ingresados";
		boolean nombresValidos = false;
		while (!nombresValidos) {
			try {
				System.out.println(mensaje);
				nombres = input.nextLine();
				if (!nombres.isEmpty()) {
					nombresValidos = true;
				} else {
					System.out.println("El campo NOMBRES no puede quedar en blanco.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Ingrese datos validos por favor.");
				input.nextLine();
			}
		}
		return nombres;
	}

	//	Metodo que solicita los apellidos del estudiante al usuario.
	public static String solicitaApellidos(String mensaje) {
		String apellidos = "No Ingresados";
		boolean apellidosValidos = false;
		while (!apellidosValidos) {
			try {
				System.out.println(mensaje);
				apellidos = input.nextLine();
				if (!apellidos.isEmpty()) {
					apellidosValidos = true;
				} else {
					System.out.println("El campo NOMBRES no puede quedar en blanco.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Ingrese datos validos por favor.");
				input.nextLine();
			}
		}
		return apellidos;
	}

	//	Metodo que solicita la edad del estudiante al usuario.
	public static int solicitaEdad(String mensaje) {
		int edad = 0;
		boolean edadValida = false;
		while (!edadValida) {
			try {
				System.out.println(mensaje);
				edad = input.nextInt();
				if (edad > 0) {
					edadValida = true;
				} else {
					System.out.println("Ingrese una edad valida!");
				}
			} catch (InputMismatchException e) {
				System.out.println("Ingrese datos validos por favor.");
				input.nextLine();
			}
		}
		return edad;
	}

	//	Metodo que solicita el sexo del estudiante al usuario.
	public static char solicitaSexo(String mensaje) {
		char sexo = 'O';
		boolean sexoValido = false;
		while (!sexoValido) {
			try {
				System.out.println(mensaje);
				sexo = input.next().charAt(0);
				if (sexo == 'M' || sexo == 'F') {
					sexoValido = true;
				} else {
					System.out.println("Ingrese M o F para definir sexo.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Ingrese un dato valido por favor.");
				input.nextLine();
			}
		}
		return sexo;
	}

	//	Metodo que solicita las materias a cursar por el estudiante al usuario.
	public static String[] solicitaMaterias(String mensaje) {
		int cantidadMaterias = 0;
		boolean cantidadValida = false;

		// Solicitar la cantidad de materias al usuario
		while (!cantidadValida) {
			try {
				System.out.println("¿Cuántas materias va a ingresar?");
				cantidadMaterias = input.nextInt();
				input.nextLine(); // Limpiar el buffer después de leer un número
				if (cantidadMaterias > 0) {
					cantidadValida = true;
				} else {
					System.out.println("Ingrese una cantidad válida de materias.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Ingrese un número válido.");
				input.nextLine(); // Limpiar el buffer en caso de error
			}
		}

		// Crear el array de materias con la cantidad ingresada
		String[] materias = new String[cantidadMaterias];

		// Solicitar el nombre de cada materia
		for (int i = 0; i < cantidadMaterias; i++) {
			boolean materiaValida = false;
			while (!materiaValida) {
				try {
					System.out.println(mensaje + " " + (i + 1) + ":");
					String materia = input.nextLine();
					if (!materia.isEmpty()) {
						materias[i] = materia;
						materiaValida = true;
					} else {
						System.out.println("El nombre de la materia no puede quedar en blanco.");
					}
				} catch (InputMismatchException e) {
					System.out.println("Ingrese un dato válido.");
					input.nextLine(); // Limpiar el buffer en caso de error
				}
			}
		}
		return materias;
	}

}