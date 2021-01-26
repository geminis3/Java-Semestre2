
public class empleados {
	//definimos los atributos privados de nuestros empleados
	private String id,nombre,cargo;
	private int edad;
	private double sueldo;
	
	//constructor boilerplate
	public empleados() {
		id="No especificado";
		nombre="No especificado";
		cargo="No especificado";
		edad=0;
		sueldo=0.00;
	}
	
	//constructor con todos los argumentos
	public empleados(String id, String nombre, String cargo, int edad, double sueldo) {
		this.id=id;
		this.nombre=nombre;
		this.cargo=cargo;
		this.edad=edad;
		this.sueldo=sueldo;
	}
	
	//getters
	public String getId() {
		return this.id;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getCargo() {
		return this.cargo;
	}
	public int getEdad() {
		return this.edad;
	}
	public double getSueldo() {
		return this.sueldo;
	}
	
	//setters
	public void setId(String newId) {
		this.id = newId;
	}
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}
	public void setCargo(String newCargo) {
		this.cargo = newCargo;
	}
	public void setEdad(int newEdad) {
		this.edad = newEdad;
	}
	public void setSueldo(double newSueldo) {
		//validamos que solo se pueda cambiar si es mayor al valor actual
		if (newSueldo <= this.sueldo) {
			System.out.println("ERROR: el sueldo ingresado debe ser mayor al actual");
		}
		else {
			this.sueldo = newSueldo;
		}
	}
	
	//metodo que muestra atributos
	public void mostrarEmpleado() {
		System.out.println("ID: "+this.getId());
		System.out.println("Nombre: "+this.getNombre());
		System.out.println("Cargo: "+this.getCargo());
		System.out.println("Edad: "+this.getEdad());
		System.out.println("Sueldo: "+this.getSueldo());
	}
}
