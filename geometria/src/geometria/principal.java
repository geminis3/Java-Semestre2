package geometria;
 
import java.util.Scanner;
 
public class principal {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int op;
		double x,y,x2,y2;
		System.out.println(">>>>>>>> BIENVENIDO >>>>>>>>");
		System.out.println("\n1) Crear un punto\n2) Crear una línea\n");
		System.out.print("Ingresa una opción: ");
		op = sc.nextInt();
		switch(op) {
		case 1:
			System.out.println("\n>>> CREAR NUEVO PUNTO >>>");
			System.out.print("Ingrese X: ");
			x = sc.nextDouble();
			if (x<0) {
				System.out.println("No se puede ingresar valores negativos");
			} else {
				System.out.print("Ingrese Y: ");
				y = sc.nextDouble();
				if (y<0) {
					System.out.println("No puede ingresar un número negativo");
				}
				else {
					punto punto1 = new punto(x, y); 
					punto1.mostrarPunto();
				}
			}
			break;
		case 2:
			System.out.println("\n>>> CREAR UNA NUEVA LÍNEA >>>");
			System.out.print("Ingrese X1: ");
			x = sc.nextDouble();
			if (x<0) {
				System.out.println("No se puede ingresar valores negativos");
			} else {
				System.out.print("Ingrese x2: ");
				x2 = sc.nextDouble();
				if (x2<0) {
					System.out.println("No puede ingresar un número negativo");
				}
				else {
					System.out.print("Ingrese X2: ");
					y = sc.nextDouble();
					if (y<0) {
						System.out.println("No puede ingresar un número negativo");
					}
					else {
						System.out.print("Ingrese Y2: ");
						y2 = sc.nextDouble();
						if (y2<0) {
							System.out.println("No puede ingresar un número negativo");
						}
						else {
							linea linea1 = new linea(x,y,x2,y2);
							linea1.mostrarLinea();
						}
					}

				}
			}
			break;
		default:
			System.out.println("\nOpción no válida, saliendo...");
			break;
		}
	}
 
}