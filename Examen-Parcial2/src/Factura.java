/*
 * developed by Victor Bayas @ Arch Linux
 */
public abstract class Factura {
	//atributos solicitados
	int idFactura,idCliente,edad;
	double Importe;
	String nombre,apellido;
	final double IVA=0.12;//hacemos estático el valor de iva
	//constructor padre
	public Factura(int idFactura, int idCliente, int edad, String nombre, String apellido) {
		this.idFactura = idFactura;
		this.idCliente = idCliente;
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	//getters & setters
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getImporte() {
		return Importe;
	}
	public void setImporte(double importe) {
		Importe = importe;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	//métodos abstractos
	public abstract void ImprimirFactura();
	public abstract double CalcularTotal();
}
