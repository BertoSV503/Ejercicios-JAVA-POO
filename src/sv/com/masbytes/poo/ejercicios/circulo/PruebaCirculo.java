package sv.com.masbytes.poo.ejercicios.circulo;


public class PruebaCirculo {

	public static void main(String[] args) {
		double radio = Consola.pideRadio("Digite el radio del circulo: ");
		Circulo circulo = new Circulo(radio);

		System.out.println("Area: " + circulo.calculaArea());
		System.out.println("Perimetro: " + circulo.calculaPerimetro());
	}

}