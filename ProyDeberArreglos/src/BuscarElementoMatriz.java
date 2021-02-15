import java.util.InputMismatchException;
import java.util.Scanner;

public class BuscarElementoMatriz {

	public static void main(String[] args) {
		int[][] matriz1 = new int[20][20];
		int filas=matriz1.length, columnas=matriz1[0].length, buscado,x=0,y=0;
		boolean found = false;
		Scanner sc = new Scanner(System.in);
		//llenando randomicamente
		System.out.println("Matriz generada:\n");
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				matriz1[i][j]=(int)(Math.random()*50);
				System.out.print(matriz1[i][j]+"\t");
			}
			System.out.println();
		}
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
		for(int i=0;i<filas && !found;i++) {
			for (int j=0;j<columnas;j++) {
				if(matriz1[i][j] == buscado) {
					found=true;
					x=i;
					y=j;
				}
			}
		}
		System.out.println("\n==== BÚSQUEDA FINALIZADA ====");
		if(found==true) {
			System.out.println("Elemento "+buscado+" encontrado en la posición ["+x+"]["+y+"]");
		}
		else {
			System.out.println("Elemento "+buscado+" no encontrado");
		}
	}

}
