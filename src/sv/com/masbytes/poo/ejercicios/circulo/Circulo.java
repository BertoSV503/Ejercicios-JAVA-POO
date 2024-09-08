package sv.com.masbytes.poo.ejercicios.circulo;

public class Circulo {

	private double radio;

	public Circulo(double radio) {
		if (radio > 0.0) {
			this.radio = radio;
		} else {
			this.radio = 0.0;
		}
	}

	public double getRadio() {
		return radio;
	}

	public double calculaArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	public double calculaPerimetro() {
		return 2 * Math.PI * radio;
	}

}