import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String[] students = new String[5];
		students[1]="Juan";
		students[0]="Juancho";
		System.out.println(students[1]);
		int[] numbers = {1,2,3,4,5,6,7};
		for (int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		*/
		String[] names = {"juan","marco","sara"};
		int[] numbers = {12,13,14,15};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("ingrese nombre");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		for(int i=0;i<names.length;i++) {
			if(name.equals(names[i])) {
				System.out.println(numbers[i]);
			}
		}
	}

}
