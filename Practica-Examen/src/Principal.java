import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		Scanner sc = new Scanner(System.in);
		Linea linea1 = new Linea(11, 1, -4, -3, 2, 5);
		do {
			System.out.println("\n1) Dibujar\n2) Calcular distancia\n3) Cambiar color\n4) Borrar línea\n5) Salir");
			System.out.print("Ingrese una opción (1-5): ");
			op=sc.nextInt();
			switch(op) {
			case 1:
				linea1.Dibujar();
				break;
			case 2:
				System.out.println("\n..:: Calculando distancia ::..\nLa distancia entre los dos puntos es de: "+linea1.CalculaLongitud());
				break;
			case 3:
				linea1.CambiarColor();
				break;
			case 4:
				linea1.Borrar();
				break;
			default:
				if(op!=5) {
					System.out.println("\n>>> Opción no válida");
				}
			}	
		} while (op!=5);
		sc.close();
		System.out.println("\nSaliendo del sistema...");
	}

}
