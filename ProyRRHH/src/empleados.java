
public class empleados {
	private String nombre;
	private int id,edad,antiguedad;
	private double sueldo,comi;
	public empleados(String nombre, int id, int edad, int antiguedad, double sueldo) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
		this.antiguedad = antiguedad;
		this.sueldo = sueldo;
	}
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		System.out.println("Empleado ID "+id+" nombre modificado: "+nombre);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if(edad<18) {
			System.out.println("ERROR: no puede ser menor de 18");
		}
		else {
			this.edad = edad;
			System.out.println("Empleado ID "+id+" edad modificado: "+edad);
		}
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	//metodos
	public double calcularComision() {
		if(antiguedad>10&&antiguedad<=20) {
			comi=sueldo*0.1;
		}
		else if (antiguedad>20) {
			comi=sueldo*0.2;
		}
		else {
			comi=0;
		}
		return comi;
	}
	public void mostrarEmpleado() {
		System.out.println("\nNombre: "+nombre+"\nID: "+id+"\nEdad: "+edad+"\nAntiguedad: "+antiguedad+"\nSueldo base: "+sueldo+"\nComision: "+comi+"\nTotal: "+(sueldo+comi));
	}
	
}
