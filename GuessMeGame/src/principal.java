import java.util.Random;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		System.out.println("Bienvenido");
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int number=random.nextInt(20)+1,entrada,i=1;
		System.out.println(number);
		do {
			System.out.println("Intento #"+i+" >> Ingrese el numero: ");
			entrada = sc.nextInt();
			if(entrada>number) {
				System.out.println("muy alto");
			}
			else if (entrada<number) {
				System.out.println("muy bajo");
			}
			else {
				System.out.println("ganaste");
			}
			i++;
		} while (entrada!=number && i<=5);
		if(entrada!=number) {
			System.out.println("perdiste");
		}
	}

}
