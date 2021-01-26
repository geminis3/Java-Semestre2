import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		Scanner sc = new Scanner(System.in);
		empleados empleado1 = new empleados("marco", 200, 18, 16, 3000);
		empleado1.calcularComision();
		empleado1.mostrarEmpleado();
		empleado1.setNombre("Victor");
		empleado1.setEdad(12);
		empleado1.mostrarEmpleado();
	}

}
