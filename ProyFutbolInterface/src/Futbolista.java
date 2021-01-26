
public class Futbolista extends SeleccionFutbol {
	private int dorsal;
	private String demarcacion;

	//Constructor

	public Futbolista(int pId, String pNombre, String pApellido, int pEdad, int pDorsal, String pDemar) {
	super(pId, pNombre, pApellido, pEdad);
	this.dorsal = pDorsal;
	this.demarcacion = pDemar;
	}
	
	//getters setters

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	// Implementar métodos abstractos
	public void Concentrarse() {
	System.out.println( nombre + " " +apellido + " Concentrandose en ...... "); 
	}

	public void Viajar() {
	System.out.println("Estamos viajando a ......");
	}

	public void Entrenar() {
	System.out.println("Estamos entrenando para ....");
	}

	public void Jugar() {
	System.out.println("Estamos jugando contra.....");
	}
	//metodo propio
	public void Entrevista() {
		System.out.println(nombre + " " +apellido + " está dando una entrevista.");
	}
}
