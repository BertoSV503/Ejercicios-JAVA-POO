package sv.com.masbytes.poo.ejercicios.libro;

public class PruebaLibro {

	public static void main(String[] args) {

		//	Solicitar datos del libro al usuario
		String titulo = Consola.solicitaTitulo("Digite el titulo del libro: ");
		String autor = Consola.solicitaAutor("Digite el autor del libro: ");
		int anioPublicacion = Consola.solicitaAnioPublicacion("Digite el año de publicacion del libro: ");

		 //	Crear el objeto libro con los datos proporcionados
		Libro libro = new Libro(titulo, autor, anioPublicacion);

		// Mostrar la información del libro
		System.out.println("*** INFORMACION DE LIBRO ***");
		System.out.println("Titulo\t\t: " + libro.getTitulo());
		System.out.println("Autor\t\t: " + libro.getAutor());
		System.out.println("Anio Publicacion: " + libro.getAnioPublicacion());
		System.out.println("------------------------------------");

	}

}
