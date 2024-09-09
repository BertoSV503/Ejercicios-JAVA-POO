package sv.com.masbytes.poo.ejercicios.circulo;


public class PruebaCirculo {

	public static void main(String[] args) {
		
		//	La variable se inicializara utilizando el metodo .pideRadio de la Clase Consola
		double radio = Consola.pideRadio("Digite el radio del circulo: ");
		
		//	Creamos una instancia de Circulo para poder utilizar los metodos de instancia creados
		//	en la Clase modelo.
		Circulo circulo = new Circulo(radio);

		//	Muestra los resultados.
		System.out.println("Area: " + circulo.calculaArea());
		System.out.println("Perimetro: " + circulo.calculaPerimetro());
	}

}