
public class Autos {
	//definiendo atributos
	String color="rojo";
	int cilindraje,numPuertas,anio;
	//metodo constructor
	public Autos(String pcolor, int pcilindraje, int pnumPuertas, int panio) {
		this.color=pcolor;
		this.cilindraje=pcilindraje;
		this.numPuertas=pnumPuertas;
		this.anio=panio;
	}
	//Definiendo m�todo
	public void Encender() {
		System.out.println("El auto est� encendido");
	}
	public void Apagar() {
		System.out.println("El auto est� apagado");
	}
	
}
