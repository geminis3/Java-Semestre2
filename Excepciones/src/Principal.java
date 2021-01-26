import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese entero: ");
		try {
			n = sc.nextInt();
			System.out.println("n = "+n);
		} catch (Exception e) {
			System.out.println("Error sólo entero: "+e);
			//e.printStackTrace();
		} finally {
			System.out.println("FIN");
		}
	}

}
