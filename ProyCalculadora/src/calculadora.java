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
		System.out.print("Ingrese n�mero 1: ");
		num1=entrada.nextDouble();
		System.out.print("Ingrese n�mero 2: ");
		num2=entrada.nextDouble();
		System.out.println("\nN�meros ingresados "+num1+" y "+num2);
		System.out.println("==================================================\n\t\tOperaciones disponibles\n==================================================\n");
		System.out.println("1) Suma\n2) Resta\n3) Multiplicaci�n\n4) Divisi�n\n5) Resto\n");
		System.out.print("Ingrese una opci�n: ");
		op=entrada.nextInt();
		System.out.println("\n==================================================\n");
		entrada.close();
		switch(op) {
		case 1:
			resul=num1+num2;
			System.out.println("Seleccion� suma");
			break;
		case 2:
			resul=num1-num2;
			System.out.println("Seleccion� resta");
			break;
		case 3:
			resul=num1*num2;
			System.out.println("Seleccion� multiplicaci�n");
			break;
		case 4:
			resul=num1/num2;
			System.out.println("Seleccion� divisi�n");
			break;
		case 5:
			resul=num1%num2;
			System.out.println("Seleccion� resto");
			break;
		default:
			System.out.println("Opci�n no v�lida, saliendo...");
			System.exit(1);
		}
		System.out.println("\n>>>> El resultado de la operaci�n es: "+resul);
	}

}
