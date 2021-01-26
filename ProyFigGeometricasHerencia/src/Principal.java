/*
 * coded by Victor Bayas
 */
public class Principal {

	public static void main(String[] args) {
		Cuadrado cuadrado1 = new Cuadrado(22, "Cuadrado", 5);
		cuadrado1.mostrarInfo();
		Circulo circulo1 = new Circulo(76, "Círculo", 3);
		circulo1.mostrarInfo();
		Triangulo triangulo1 = new Triangulo(14, "Triángulo", 4, 3);
		triangulo1.mostrarInfo();
		Trapecio trapecio1 = new Trapecio(134, "Trapecio", 9, 12, 5);
		trapecio1.mostrarInfo();
	}

}
