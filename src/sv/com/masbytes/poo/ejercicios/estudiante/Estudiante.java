package sv.com.masbytes.poo.ejercicios.estudiante;

public class Estudiante {

	private String nombres;
	private String apellidos;
	private int edad;
	private char sexo;
	private String[] materias;

	// Constructor sin argumentos
	public Estudiante() {

	}

	// Constructor con argumentos
	public Estudiante(String nombres, String apellidos, int edad, char sexo, String[] materias) {
		if (!nombres.isEmpty()) {
			this.nombres = nombres;
		} else {
			this.nombres = "No Ingresados";
		}
		if (!apellidos.isEmpty()) {
			this.apellidos = apellidos;
		} else {
			this.apellidos = "No Ingresados";
		}
		if (edad > 0) {
			this.edad = edad;
		} else {
			this.edad = 0;
		}
		// Validación del sexo (solo 'M' o 'F', insensible a mayúsculas/minúsculas)
		if (Character.toUpperCase(sexo) == 'M' || Character.toUpperCase(sexo) == 'F') {
			this.sexo = sexo;
		} else {
			// Si el sexo no es válido, establecemos un valor por defecto ('O' para otro)
			this.sexo = 'O';
		}
		this.materias = materias;

	}

	//	Metodos Getter & Setter
	public String[] getMaterias() {
		return materias;
	}

	public void setMaterias(String[] materias) {
		this.materias = materias;
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexo() {
		return sexo;
	}	

}