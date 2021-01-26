import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double r;
		System.out.print("Ingrese el radio: ");
		r = sc.nextDouble();
		sc.close();
		AreaCirc a1 = new AreaCirc(r);
		System.out.println("El área es: "+a1.CalcularArea());
	}

}
