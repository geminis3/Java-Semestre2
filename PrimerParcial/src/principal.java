import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op,n,cant;
		double base,h;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n==================================================");
			System.out.println("\t\tMenú");
			System.out.println("==================================================");
			System.out.print("1) Calcular factorial\n2) Calcular área del triángulo\n3) Factura\n0) Salir del sistema\nIngrese una de las opciones: ");
			op = sc.nextInt();
			switch(op) {
			case 1:
				System.out.print("\nIngrese un número entero: ");
				n = sc.nextInt();
				factorial fact1 = new factorial(n);
				System.out.println("\n>>> El factorial de "+n+" es: "+fact1.calcularFactorial());
				break;
			case 2:
				System.out.print("\nIngrese la base del triángulo: ");
				base = sc.nextDouble();
				System.out.print("\nIngrese la altura del triángulo: ");
				h = sc.nextDouble();
				triangulo tri1 = new triangulo(base, h);
				System.out.println("\n>>> El área del triángulo con base "+base+" y altura "+h+" es: "+tri1.calcularArea());
				break;
			case 3:
				System.out.print("\nIngrese la cantidad de producto: ");
				cant = sc.nextInt();
				factura f1 = new factura(cant);
				f1.facturarProductos();
				break;
			default:
				System.out.println("\nERROR: Opción no válida, intente nuevamente");
				break;
			}
		} while (op!=0);
		sc.close();
	}

}
