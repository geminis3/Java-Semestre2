
public class Gato {
	String nombre,raza;
	double peso;
	int edad;
	boolean dormido=false;
	//constructor sin parametros
	public Gato() {
		this.nombre="";
		this.raza="";
		this.peso=0;
		this.edad=0;
	}
	
	//constructor algunos parametros
		public Gato(String nom, String raza) {
			this.nombre=nom;
			this.raza=raza;
			this.peso=0;
			this.edad=0;
		}
	
	//constructor con parametros
	public Gato(String nom, String raza, double peso, int edad) {
		this.nombre=nom;
		this.raza=raza;
		this.peso=peso;
		this.edad=edad;
	}
	
	public void PresentarGato() {
		System.out.println("Nombre "+nombre);
		System.out.println("raza: "+raza);
		System.out.println("peso: "+peso+" kg");
		System.out.println("edad: "+edad);
	}
	
	public void Dormir() {
		System.out.println("Hora de mimir");
		dormido = true;
	}
	
	public void Despertar() {
		System.out.println("Miaaau");
		dormido = false;
	}
}
