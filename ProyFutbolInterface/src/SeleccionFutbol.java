
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {
	protected int id,edad;
	protected String nombre,apellido;
	public SeleccionFutbol(){
	this.id = 0;
	this.nombre = "XX";
	this.apellido = "YY";
	this.edad=0;
	}
	public SeleccionFutbol(int pId, String pNombre, String pApellido, int pEdad){
	this.id = pId;
	this.nombre = pNombre;
	this.apellido = pApellido;
	this.edad=pEdad;
	} 
	public void Concentrarse() {
	System.out.println("Concentrandose en ...... "); 
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
}
