
public class Perro {
	String nombre, raza;
	float peso,altura;
	int edad;
	public Perro(String nombre, String raza, float pe, float alt, int edad) {
		this.nombre=nombre;
		this.raza=raza;
		this.peso=pe;
		this.altura=alt;
		this.edad=edad;
	}
	public void mostrarPerro() {
		System.out.println("Nombre del perro: "+nombre);
		System.out.println("Raza del perro: "+raza);
		System.out.println("Peso del perro: "+peso+" kg");
		System.out.println("Altura del perro: "+altura+" cm");
		System.out.println("Edad del perro: "+edad+" años");
	}
}
