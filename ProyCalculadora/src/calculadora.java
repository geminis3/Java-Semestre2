//dev Victor Bayas
import java.util.Scanner;
public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		double num1,num2,resul=0;
		Scanner entrada= new Scanner(System.in);
		System.out.println("==================================================");
		System.out.println("\t\tBienvenido a Calculadora");
		System.out.println("==================================================");
		System.out.print("Ingrese número 1: ");
		num1=entrada.nextDouble();
		System.out.print("Ingrese número 2: ");
		num2=entrada.nextDouble();
		System.out.println("\nNúmeros ingresados "+num1+" y "+num2);
		System.out.println("==================================================\n\t\tOperaciones disponibles\n==================================================\n");
		System.out.println("1) Suma\n2) Resta\n3) Multiplicación\n4) División\n5) Resto\n");
		System.out.print("Ingrese una opción: ");
		op=entrada.nextInt();
		System.out.println("\n==================================================\n");
		entrada.close();
		switch(op) {
		case 1:
			resul=num1+num2;
			System.out.println("Seleccionó suma");
			break;
		case 2:
			resul=num1-num2;
			System.out.println("Seleccionó resta");
			break;
		case 3:
			resul=num1*num2;
			System.out.println("Seleccionó multiplicación");
			break;
		case 4:
			resul=num1/num2;
			System.out.println("Seleccionó división");
			break;
		case 5:
			resul=num1%num2;
			System.out.println("Seleccionó resto");
			break;
		default:
			System.out.println("Opción no válida, saliendo...");
			System.exit(1);
		}
		System.out.println("\n>>>> El resultado de la operación es: "+resul);
	}

}
