import java.util.InputMismatchException;
import java.util.Scanner;

public class BuscarElementoArray {

	public static void main(String[] args) {
		int[] arreglo = {3,6,8,11,7,1,0};
		int buscado,i=0;
		boolean found = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("arreglo = {");
		for (int j : arreglo) {
			System.out.print(j+",");
		}
		System.out.println("}");
		//entrada
		while(true) {//iteramos hasta romper el bucle
			try {
				System.out.print("\nIngrese el elemento a buscar: ");
				buscado = sc.nextInt();
				break;//rompemos el bucle
			} catch (InputMismatchException e) {
				System.out.println("ERROR: El valor ingresado no es un número entero ");
				sc.next();//limpiamos buffer de scanner
			}
		}
		sc.close();
		//busqueda
		while(i<arreglo.length && !found) {
			if(arreglo[i]==buscado) {
				found=true;
			} else {
				i++;
			}
		}
		System.out.println("\n==== BÚSQUEDA FINALIZADA ====");
		if(found==true) {
			System.out.println("Elemento "+buscado+" encontrado en la posición ["+i+"]");
		}
		else {
			System.out.println("Elemento "+buscado+" no encontrado");
		}
	}

}
