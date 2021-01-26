package segundoGrado;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIngrese a: ");
		a = sc.nextInt();
		System.out.print("\nIngrese b: ");
		b = sc.nextInt();
		System.out.print("\nIngrese c: ");
		c = sc.nextInt();
		ecuacion ec1 = new ecuacion(a, b, c);
		ec1.cuadratica();
		sc.close();
	}

}
