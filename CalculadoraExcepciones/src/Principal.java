import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op,n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n===== Bienvenido a Calculadora ====\n");
		try {
			System.out.print("Ingrese el primer entero: ");
			n1 = sc.nextInt();
			System.out.print("Ingrese el segundo entero: ");
			n2 = sc.nextInt();
			System.out.println("\n===== Operaciones disponibles =====\n");
			System.out.println("1) Suma\n2) Resta\n3) División\n4) Multiplicación");
			System.out.print("Ingrese su opción: ");
			op = sc.nextInt();
			sc.close();
			System.out.println("\n===================================\n");
			switch(op) {
			case 1:
				Suma suma1 = new Suma(n1, n2);
				System.out.println("La suma es: "+suma1.realizarSuma());
				break;
			case 2:
				Resta resta1 = new Resta(n1, n2);
				System.out.println("La resta es: "+resta1.realizarResta());
				break;
			case 3:
				Division divi1 = new Division(n1, n2);
				System.out.println("La división es: "+divi1.realizarDivision());
				break;
			case 4:
				Multiplicacion multi1 = new Multiplicacion(n1, n2);
				System.out.println("La multiplicación es: "+multi1.realizarMultiplicacion());
				break;
			default:
				System.out.println("Opción no válida");
			}
		} catch (InputMismatchException e1) {
			System.out.println("\n>>> Excepción: el dato ingresado no es un entero\nCódigo "+e1+" <<<");
		} catch (ArithmeticException e2) {
			System.out.println(">>> Excepción: no es posible dividir para cero\nCódigo "+e2+" <<<");
		} finally {
			System.out.println("\n===================================");
			System.out.println("Ejecucción Finalizada");
		}
	}

}
