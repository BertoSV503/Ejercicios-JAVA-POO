package sv.com.masbytes.poo.ejercicios.libro;

public class Libro {

	private String titulo;
	private String autor;
	private int anioPublicacion;

	// Constructor sin argumentos
	public Libro() {

	}

	//	Constructor con argumentos e inicializa las variables.
	public Libro(String titulo, String autor, int anioPublicacion) {
		if (!titulo.isEmpty()) {
			this.titulo = titulo;
		} else {
			this.titulo = "S/T";
		}
		if (!autor.isEmpty()) {
			this.autor = autor;
		} else {
			this.autor = "Anonimo";
		}
		if (anioPublicacion > 0) {
			this.anioPublicacion = anioPublicacion;
		} else {
			this.anioPublicacion = 0;
		}
	}

	//	Metodos Getters
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}	

}
