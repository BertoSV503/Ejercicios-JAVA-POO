package sv.com.masbytes.poo.ejercicios.circulo;

public class Circulo {

	// Atributo privado para almacenar el radio del círculo
	private double radio;

	// Constructor que inicializa el radio
	public Circulo(double radio) {
		if (radio > 0.0) {
			this.radio = radio;
		} else {
			this.radio = 0.0; // Si el radio no es válido, se establece en 0.0
		}
	}

	// Método para obtener el valor del radio
	public double getRadio() {
		return radio;
	}

	// Método para calcular el área del círculo
	public double calculaArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	// Método para calcular el perímetro del círculo
	public double calculaPerimetro() {
		return 2 * Math.PI * radio;
	}

}