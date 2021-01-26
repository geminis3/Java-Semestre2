import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cs = new Scanner(System.in);
		int  importe=0, importeFinal=0, idFactura=1, age, id, items;

		String  name, lastName;

		try {
			System.out.println("-0-0-0-0-0-0-0-0-0-Bienvenido-0-0-0-0-0-0-0-0-0-");
			System.out.println("\nNombre del cliente : ");
			name = cs.nextLine();
			System.out.println("\nApellido : ");
			lastName = cs.nextLine();
			System.out.println("\nOK, " + name + " " + lastName + 
					" Ingresa tu cedula de identidad (C.I) : ");
			id = cs.nextInt();
			System.out.println("\nEdad del cliente: " );
			age = cs.nextInt();
			System.out.println("\n-0-0-0-0- Informacion Guardada exitosamente-0-0-0-0-0-0-");
			System.out.println("\n\nBienvenido, para iniciar ingrese su numero de compras: ");
			items = cs.nextInt();
			System.out.println("\nOK! Ingrese los valores de cada una de sus " + items + " compras...");
			for (int i = 1; i <=items; i++) {
				System.out.println("\nCompra " + i + " :");
				importeFinal = cs.nextInt();
				importe = importe + importeFinal;
			}
			System.out.println("debug: "+importe);
			if (age<65) {
				FacturaConIva factura1 = new FacturaConIva(importe, idFactura, age, id, name, lastName);
				factura1.ImprimirFactura();	
			} else {
				FacturaSinIva factura1 = new FacturaSinIva(importe, idFactura, age, id, name, lastName);
				factura1.ImprimirFactura();
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.err.println("Debe Ingresar un numero entero");
		}
		catch (Exception f) {
			// TODO: handle exception
			System.err.println("Oops, algio salio mal");
		}
		cs.close();
	}
}
