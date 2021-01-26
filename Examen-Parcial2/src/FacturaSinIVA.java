/*
 * developed by Victor Bayas @ Arch Linux
 */
import java.util.Scanner;

public class FacturaSinIVA extends Factura {
	int cantItems;//variable para controlar el bucle de items
	Scanner sc = new Scanner(System.in);
	public FacturaSinIVA(int idFactura, int idCliente, int edad, String nombre, String apellido, int cantItems) {
		super(idFactura, idCliente, edad, nombre, apellido);
		this.cantItems = cantItems;
	}
	//devolvemos Importe que es el subtotal de los productos ingresados
	public double CalcularTotal() {
		Importe=0;
		double precio;
		System.out.println("\n..:: Venta de Productos ::..\n");
		for(int i=1;i<=cantItems;i++) {
			System.out.print("Ingrese precio del item #"+i+": ");
			precio=sc.nextDouble();
			Importe=Importe+precio;
		}
		return Importe;
	}
	public void ImprimirFactura() {
		RegistrarDatos();
		double subtotal = CalcularTotal();
		System.out.println("\n..:: Grupo Bayas Cia. Ltda. ::..");
		System.out.println("\t\t\t\t\tFactura #"+getIdFactura());
		System.out.println("======================================================");
		System.out.println("(INFO) Cliente mayor de 65 años, su compra no paga IVA");
		System.out.println("======================================================");
		System.out.println("\nNombre: "+getNombre()+" "+getApellido());
		System.out.println("CI: "+getIdCliente());
		System.out.println("Valor Neto: $"+subtotal);
		System.out.println("IVA: $0.00");
		System.out.println("Total a pagar: $"+subtotal);
	}
	//metodo no funcional
	public void RegistrarDatos() {
		System.out.println("\n(INFO) Cliente registrado en Base de Datos");
	}
}
