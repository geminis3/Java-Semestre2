package electodomesticos;

public class televisor {
	//variables a usar
	String marca,codigo;
	int tamano,resolucion;
	boolean encendido=false; //inicio en apagado
	//constructor sin parametro
	public televisor() {
		this.marca="Genérico";
		this.tamano=16;
		this.resolucion=72;
		this.codigo="99999999";
	}
	//constructor con todos los parametros
	public televisor(String marca, String cod, int tam, int res) {
		this.marca=marca;
		this.codigo=cod;
		this.tamano=tam;
		this.resolucion=res;
	}
	//constructor con algunos parametros
	public televisor(String marca, int tam) {
		this.marca=marca;
		this.tamano=tam;
		this.resolucion=300;
		this.codigo="NFGH6178-US";
	}
	//metodo que lista datos del objeto
	public void MostrarTelevisor() {
		System.out.println("Marca: "+marca);
		System.out.println("Tamaño: "+tamano+" pulgadas");
		System.out.println("Resolución: "+resolucion+" píxeles");
		System.out.println("Código: "+codigo);
	}
	//metodos a usar
	public void EncenderTelevisor() {
		System.out.println("\n>>> El televisor ha sido ENCENDIDO >>>");
		encendido=true; //cambio de estado
	}
	public void ApagarTelevisor() {
		System.out.println("\n>>> El televisor ha sido APAGADO >>>");
		encendido=false; //cambio de estado
	}
	public void CambiarCanal() {
		System.out.println("\n>>> El canal ha sido cambiado >>>");
	}
	public void CambiarVolumen() {
		System.out.println("\n>>> El volumen ha sido modificado >>>");
	}
}
