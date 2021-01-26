//dev Victor Bayas
import java.util.Scanner;
public class ClaseSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int aux=100;
		System.out.println("==================================================");
		System.out.println("\t\tSelecciona un día");
		System.out.println("==================================================\n");
		System.out.println("1) Lunes");
		System.out.println("2) Martes");
		System.out.println("3) Miércoles");
		System.out.println("4) Jueves");
		System.out.println("5) Viernes");
		System.out.println("6) Sábado");
		System.out.println("7) Domingo");
		do {
			System.out.print("\n> Ingrese su selección: ");
			aux=sc.nextInt();
			if (aux>7 || aux<=0) {
				System.out.println("\n>>>> ERROR >>>> Selección no válida");
				aux=100;
			}
		} while (aux==100);
		sc.close();
		System.out.print("\n>>>> Hoy es ");
		switch(aux) {
		case 1:
			System.out.print("Lunes");
			break;
		case 2:
			System.out.print("Martes");
			break;
		case 3:
			System.out.print("Miércoles");
			break;
		case 4:
			System.out.print("Jueves");
			break;
		case 5:
			System.out.print("Viernes");
			break;
		case 6:
			System.out.print("Sábado");
			break;
		case 7:
			System.out.print("Domingo");
			break;
		}
		System.out.println(" >>>> tenga un buen día :D");
	}

}
