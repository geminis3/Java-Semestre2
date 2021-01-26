public class FacturaConIva extends Factura{

	double IVA=0.12;
	
	public FacturaConIva(int importe, int idFactura, int edad, 
			int idCliente, String nombre, String apellido) {
		super();
		this.importe = importe;
		this.idFactura = idFactura;
		this.edad = edad;
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public double CalcularIVA() {
		return (importe*IVA);
	}
	
	public void ImprimirFactura() {
		System.out.println("::::::::::::::: FACTURA :::::::::::::");
		System.out.println("Id Factura: " + idFactura);
		System.out.println("Cliente :" + nombre + " " + apellido);
		System.out.println("C.I : "+ idCliente);
		System.out.println("Valor Neto : " + importe);
		System.out.println("I.V.A : " + CalcularIVA());
		System.out.println("El total de la factura es: " + Total());
		System.out.println(":::::::::::::::::::::::::::::::::::::::");
	}
	
	public double Total() {
		return (CalcularIVA() + importe);
	}
	public void CalcularTotal() {
	}
	public void GenerarReporteSRI() {
	}
}
