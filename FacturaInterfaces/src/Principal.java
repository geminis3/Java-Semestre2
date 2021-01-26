/*
 * desarrollado por Victor Bayas
 */
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor,desc;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n============= BIENVENIDO =============\n");
		System.out.print("Ingrese el valor de la compra: ");
		valor=sc.nextDouble();
		System.out.print("Ingrese el valor del descuento: ");
		desc=sc.nextDouble();
		sc.close();
		Factura factura1 = new Factura(valor, desc);//creacion de nuevo objeto segun la entrada
		factura1.valorPagar();//lamada al metodo principal
	}

}
