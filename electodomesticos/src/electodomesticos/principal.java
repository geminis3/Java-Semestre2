/*
 * Developed by Victor Bayas @ Linux
 */

package electodomesticos;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable q controla el menu
		int op;
		//instanciamos nuevo scanner
		Scanner sc = new Scanner(System.in);
		//instanciamos los nuevos televisores
		televisor televisor1 = new televisor();
		televisor televisor2 = new televisor("Samsung","120AH930",50,330);
		televisor televisor3 = new televisor("LG", 32);
		//mostramos sus datos
		System.out.println("==================================================");
		System.out.println("\tMostrando datos de mi televisor 1");
		System.out.println("==================================================");
		televisor1.MostrarTelevisor();
		System.out.println("\n==================================================");
		System.out.println("\tMostrando datos de mi televisor 2");
		System.out.println("==================================================");
		televisor2.MostrarTelevisor();
		System.out.println("\n==================================================");
		System.out.println("\tMostrando datos de mi televisor 3");
		System.out.println("==================================================");
		televisor3.MostrarTelevisor();
		//ejecuta min 1 vez y sale si el user ingresa 0
		do {
			System.out.println("\n==================================================");
			System.out.println("\tControl remoto de mi televisor");
			System.out.println("==================================================");
			System.out.print("1) Encender\n2) Cambiar canal\n3) Modificar volumen\n4) Apagar\n0) Salir del sistema\nIngrese una de las opciones: ");
			op = sc.nextInt();
			switch(op) {
			case 1:
				//validamos estado de encendido
				if(televisor1.encendido==false) {
					televisor1.EncenderTelevisor();
				}
				else {
					System.out.println("\nERROR: El televisor ya está encendido");
				}
				break;
			case 2:
				if(televisor1.encendido==true) {
					televisor1.CambiarCanal();
				}
				else {
					System.out.println("\nERROR: El televisor debe de estar encendido para cambiar el canal");
				}
				break;
			case 3:
				if(televisor1.encendido==true) {
					televisor1.CambiarVolumen();
				}
				else {
					System.out.println("\nERROR: El televisor debe de estar encendido para modificar el volumen");
				}
				break;
			case 4:
				if(televisor1.encendido==true) {
					televisor1.ApagarTelevisor();
				}
				else {
					System.out.println("\nERROR: El televisor ya está apagado");
				}
				break;
			case 0:
				System.out.println("\nSaliendo del sistema...");
				break;
			default:
				System.out.println("\nERROR: Opción no válida, intente nuevamente");
				break;
			}
		} while (op!=0);
		sc.close();
	}

}
