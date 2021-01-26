import java.util.Scanner;

public class factura {
	int cant;
	double precio=1,subtotal=0,total,iva;
	Scanner sc = new Scanner(System.in);
	public factura(int cant) {
		this.cant=cant;
	}
	public void facturarProductos() {
		for(int i=1;i<=cant;i++) {
			do {
				System.out.print("Ingrese el precio del producto #"+i+" : ");
				precio=sc.nextDouble();
			} while(precio<=0);
			subtotal=subtotal+precio;
		}
		iva=precio*0.12;
		total=subtotal+iva;
		System.out.println("\nSubtotal: $"+subtotal);
		System.out.println("IVA 12%: $"+iva);
		System.out.println("TOTAL: $"+total);
	}
}
