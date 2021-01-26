/*
 * developed by Victor Bayas @ Arch Linux
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idCliente,edad,cantidad;
		String nombre,apellido;
		Scanner sc = new Scanner(System.in);
		System.out.println("..:: Bienvenido a Programa de Facturación ::..");
		//me resultó más conveniente capturar las excepciones dentro del main
		try {
			System.out.print("\nNombre: ");
			nombre=sc.nextLine();
			System.out.print("Apellido: ");
			apellido=sc.nextLine();
			System.out.print("CI: ");
			idCliente=sc.nextInt();
			System.out.print("Edad: ");
			edad=sc.nextInt();
			System.out.print("\n>>> Cantidad de items a comprar: ");
			cantidad=sc.nextInt();
			//instanciamos la factura f1 según la edad
			if(edad>65) {
				FacturaSinIVA f1 = new FacturaSinIVA(2, idCliente, edad, nombre, apellido, cantidad);
				f1.ImprimirFactura();
			}
			else {
				FacturaConIVA f1 = new FacturaConIVA(1, idCliente, edad, nombre, apellido, cantidad);
				f1.ImprimirFactura();
			}
		} catch (InputMismatchException e) {//capturamos input mismatch
			System.out.println("\n(EXCEPCIÓN) El tipo de dato ingresado no es válido\nCódigo: "+e);
		} catch (Exception e1) {//adicional un atrapalo todo porque si
			System.out.println("\n(EXCEPCIÓN GENÉRICA) Código: "+e1);
		} finally {
			sc.close();
			System.out.println("\n..:: Gracias por preferirnos ::..");
		}
	}

}
