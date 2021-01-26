//dev Victor Bayas
public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciamos
		Circulo circulo1 = new Circulo(0,0,20);
		Circulo circulo2 = new Circulo(-5.99,20,300.12);
		//imprimos valores
		System.out.println("==================================================");
		System.out.println("\t\tCírculo #1");
		System.out.println("==================================================\n");
		System.out.println("Coordenada X: "+circulo1.x);
		System.out.println("Coordenada Y: "+circulo1.y);
		System.out.println("Radio: "+circulo1.radio);
		System.out.println("\n==================================================");
		System.out.println("\t\tCírculo #2");
		System.out.println("==================================================\n");
		System.out.println("Coordenada X: "+circulo2.x);
		System.out.println("Coordenada Y: "+circulo2.y);
		System.out.println("Radio: "+circulo2.radio);
	}

}
