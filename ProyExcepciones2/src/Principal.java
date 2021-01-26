import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1,divi;
		System.out.print("n1: ");
		try {
			n1 = sc.nextInt();
			divi=n1/0;
			System.out.println("La división es: "+divi);
		} catch (InputMismatchException e1) {
			System.out.println("ERROR DE CAPA 8: se ingresó un tipo de dato no adecuado");
		} catch (ArithmeticException e2) {
			System.out.println("EXCEPCIÓN: división para cero");
		}
	}

}
