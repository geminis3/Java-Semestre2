
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato1 = new Gato();
		gato1.PresentarGato();
		if (gato1.dormido==true) {
			gato1.Despertar();
		} else {
			gato1.Dormir();
		}
		Gato gato2 = new Gato("Marco", "runa", 2, 10);
		gato2.PresentarGato();
		Gato gato3 = new Gato("pelusa", "cafe");
		gato3.PresentarGato();
		System.out.println("\n==================================================\n");
		Perro perro1 = new Perro("Firulais", "Dalmata", 4.99f, 56.2f, 5);
		perro1.mostrarPerro();
	}

}
