/*
 * Developed by Victor Bayas
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		double n1,n2;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("==================================================");
		System.out.println("\t\tBienvenido a Calculadora");
		System.out.println("==================================================\n");
		System.out.print("Ingrese número 1: ");
		n1=sc.nextDouble();
		System.out.print("Ingrese número 2: ");
		n2=sc.nextDouble();
		System.out.println("\nNúmeros ingresados "+df.format(n1)+" y "+df.format(n2));
		System.out.println("\n==================================================\n\t\tSeleccione una operación\n==================================================\n");
		System.out.println("1) Suma\n2) Resta\n3) Multiplicación\n4) División\n5) Resto\n");
		System.out.print("Ingrese una opción: ");
		op=sc.nextInt();
		sc.close();
		System.out.println("\n==================================================\n");
		switch(op) {
		case 1:
			Suma s1 = new Suma(n1, n2);
			System.out.println("La suma es: "+df.format(s1.ejecutarSuma()));
			break;
		case 2:
			Resta r1 = new Resta(n1, n2);
			System.out.println("La resta es: "+df.format(r1.ejecutarResta()));
			break;
		case 3:
			Multiplicacion m1 = new Multiplicacion(n1, n2);
			System.out.println("La multiplicación es: "+df.format(m1.ejecutarMultiplicacion()));
			break;
		case 4:
			Division d1 = new Division(n1, n2);
			System.out.println("La división es: "+df.format(d1.ejecutarDivision()));
			Division2 dd1 = new Division2(n1, n2);
			System.out.println("double "+dd1.EjecutarDiv());
			System.out.println("float "+dd1.EjecutarDiv2());
			break;
		case 5:
			Resto rr1 = new Resto(n1, n2);
			System.out.println("El resto es: "+df.format(rr1.ejecutarResto()));
			break;
		default:
			System.out.println("Opción no válida, saliendo...");
			System.exit(1);
		}
	}

}
