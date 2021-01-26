
public class Factura implements Constantes, MetodosComunes {
	private double totalSinIVA, descuento;
	public Factura(double totalSinIVA, double descuento) {
		this.totalSinIVA = totalSinIVA;
		this.descuento = descuento;
	}
	//metodo que calcula el IVA
	public double conIVA() {
		return (this.totalSinIVA*IVA)+this.totalSinIVA;
	}
	//metodo generico para calcular descuento a cualquier cosa
	public double calcularDescuento(double base,double desc) {
		return base-(base*(desc/100));
	}
	//metodo rebaja sin IVA
	public void Rebaja() {
		System.out.println("============= INFO =============");
		System.out.println("Premiamos tu fidelidad al NO cobrar el IVA en tu compra");
		System.out.println("============= TOTAL =============");
		System.out.println("TOTAL rebajado sin IVA: "+calcularDescuento(totalSinIVA, descuento));
	}
	//rebaja con IVA
	public void RebajaIVA() {
		System.out.println("Subtotal + IVA: "+conIVA());
		System.out.println("TOTAL rebajado con IVA: "+calcularDescuento(conIVA(), descuento));
	}
	//meotodo principal donde validamos y mostramos
	public void valorPagar() {
		System.out.println("\n");
		if(this.totalSinIVA>valorMin && this.totalSinIVA<valorMax) {
			System.out.println("============= INFO =============");
			System.out.println("Su compra aplica descuento del "+this.descuento+"%");
			System.out.println("============= FACTURA =============");
			System.out.println("Subtotal: "+this.totalSinIVA);
			RebajaIVA();
			Rebaja();
		}
		else {
			System.out.println("============= INFO =============");
			System.out.println("Su compra no aplica descuento\nEl valor de compra deberá ser superior a $5 y menor a $10000 para obtener descuento");
			System.out.println("============= FACTURA =============");
			System.out.println("Subtotal: "+this.totalSinIVA);
			System.out.println("Total con IVA: "+conIVA());
		}
		System.out.println("====== GRACIAS X SU COMPRA ======");
	}
	
}
