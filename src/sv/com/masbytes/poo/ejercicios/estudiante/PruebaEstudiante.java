package sv.com.masbytes.poo.ejercicios.estudiante;

public class PruebaEstudiante {

	public static void main(String[] args) {

//		Solicitar info del estudiante
		String nombres = Consola.solicitaNombres("Digite los nombres del estudiante: ");
		String apellidos = Consola.solicitaApellidos("Digite los apellidos del estudiante: ");
		int edad = Consola.solicitaEdad("Ingrese la edad del estudiante: ");
		char sexo = Consola.solicitaSexo("Ingrese el sexo del estudiante (M o F): ");
		String[] materias = Consola.solicitaMaterias("Digite las materias a cursar: ");

		Estudiante estudiante = new Estudiante(nombres, apellidos, edad, sexo, materias);

		//	Muestra la info del estudiante.
		System.out.println(" *** INFO DEL ESTUDIANTE *** ");
		System.out.println("-----");
		System.out.println("Nombre Completo\t\t: " + estudiante.getNombres() + " " + estudiante.getApellidos());
		System.out.println("Edad\t\t\t: " + estudiante.getEdad() + " años.");
		System.out.println("Genero\t\t\t: " + estudiante.getSexo());

		// Mostrar materias inscritas
		System.out.println("Materias Inscritas\t:");
		//	Bucle for-each para recorrer el array de materias e imprime cada una de las materias.
		for (String materia : estudiante.getMaterias()) {
			System.out.println("- " + materia);
		}
		System.out.println("-------------------------------------------------");

	}

}