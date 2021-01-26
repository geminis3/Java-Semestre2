public class FacturaSinIva extends Factura{
	
	public FacturaSinIva (int importe, int idFactura, int edad, 
			int idCliente, String nombre, String apellido) {
		super();
		this.importe = importe;
		this.idFactura = idFactura;
		this.edad = edad;
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public void ImprimirFactura() {
		System.out.println("::::::::::::::: FACTURA :::::::::::::");
		System.out.println("Id Factura: " + idFactura);
		System.out.println("Cliente :" + nombre + " " + apellido);
		System.out.println("C.I : "+ idCliente);
		System.out.println("Valor Neto : " + importe);
		System.out.println("I.V.A : Usted ha sido beneficiado sin IVA ");
		System.out.println("El total de la factura es: " + importe);
		System.out.println(":::::::::::::::::::::::::::::::::::::::");
	}
	public void CalcularTotal() {
		
	}
	public void RegistrarDatos() {
	}
	
}
