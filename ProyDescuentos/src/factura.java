/*
 * dev by Victor Bayas
 */
import java.util.Scanner;
public class factura {

	public static void main(String[] args) {
		int cant,desc_show;
		double precio,suma=0,descuento,total;
		Scanner entrada = new Scanner(System.in);
		System.out.println(">>>> Facturación");
		System.out.println("==================================================");
		System.out.print("Ingrese la cantidad de productos: ");
		cant=entrada.nextInt();
		System.out.println("==================================================");
		for (int i = 1; i <= cant; i++) {
			System.out.print("Ingrese el precio del producto #"+i+": $");
			precio=entrada.nextDouble();
			suma=suma+precio;
		}
		entrada.close();
		if(suma<=150) {
			descuento=suma*0.1;
			desc_show=10;
		}
		else if(suma>150&&suma<=200) {
			descuento=suma*0.15;
			desc_show=15;
		}
		else {
			descuento=suma*0.2;
			desc_show=20;
		}
		total=suma-descuento;
		System.out.println("==================================================");
		System.out.printf("Subtotal: $%.2f\n",suma);
		System.out.printf("Descuento (%d%%): $%.2f\n",desc_show,descuento);
		System.out.println("==================================================");
		System.out.printf("TOTAL a pagar: $%.2f\n",total);
	}

}
