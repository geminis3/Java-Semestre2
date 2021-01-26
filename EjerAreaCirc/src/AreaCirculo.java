
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi=3.14;
		double r,a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el radio: ");
		r = sc.nextDouble();
		sc.close();
		a = pi*Math.pow(r, 2);
		System.out.println("El área del círculo es: "+a);
	}

}
