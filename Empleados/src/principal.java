/*
 * Developed by Victor Bayas
 */
public class principal {

	public static void main(String[] args) {//main
		// TODO Auto-generated method stub
		//instaciamos nuestros empleados
		empleados empleado1 = new empleados();//objeto boilerplate
		empleados empleado2 = new empleados("20987", "Bruno Diaz", "Gerente comercial", 39, 5000.99);
		//a continuación mostramos los dos objetos creados
		System.out.println("\n==== MOSTRANDO EMPLEADOS ====");
		System.out.println("\nEmpleado #1");
		empleado1.mostrarEmpleado();
		System.out.println("\nEmpleado #2");
		empleado2.mostrarEmpleado();
		//realizamos el cambio de datos del objeto empleado2 mediante los setters
		System.out.println("\n==== CAMBIANDO DATOS EMPLEADO #2 ====\n");
		System.out.println("Cambiando ID...");
		empleado2.setId("987");
		System.out.println("Cambiando nombre...");
		empleado2.setNombre("Roberto Zapata");
		System.out.println("Cambiando cargo...");
		empleado2.setCargo("Desarrollador Senior");
		System.out.println("Cambiando edad...");
		empleado2.setEdad(42);
		System.out.println("Cambiando sueldo...");
		empleado2.setSueldo(1256.78);//nos debería arrojar error en este punto
		//empleado2.setSueldo(6000);
		//mostramos cambios por terminal
		System.out.println("\n==== EMPLEADO #2 DESPUÉS DEL CAMBIO ====\n");
		empleado2.mostrarEmpleado();
	}

}
