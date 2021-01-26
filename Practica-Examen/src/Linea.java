import java.util.Scanner;

public class Linea extends Figura {
	int x1,y1,x2,y2;
	Scanner sc = new Scanner(System.in);
	public Linea(int id, int color, int x1, int y1, int x2, int y2) {
		super(id, color);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public void Dibujar() {
		System.out.println("\n..:: Imprimiendo datos de la línea "+id+" ::..");
		System.out.println("Coordenadas iniciales");
		System.out.println("X1: "+x1);
		System.out.println("Y1: "+y1);
		System.out.println("Coordenadas finales");
		System.out.println("X2: "+x2);
		System.out.println("Y2: "+y2);
		System.out.println("Color actual de la línea "+id+": "+color);
	}
	public void Borrar() {
		x1=0;
		y1=0;
		x2=0;
		y2=0;
		System.out.println("\n..:: Borrando datos de la línea "+id+" ::..");
		Dibujar();
	}
	public void CambiarColor() {
		int temp;
		System.out.println("\n..:: Cambiando color de la línea "+id+" ::..");
		System.out.println("Color actual de la línea "+id+": "+color);
		System.out.print("Ingrese un color para la línea (1-3): ");
		temp=sc.nextInt();
		if(temp>=1 && temp<=3) {
			this.color=temp;
			System.out.println("\n>>> Color cambiado a: "+color);
		}
		else {
			System.out.println("\n>>> Color no válido");
		}
	}
	public double CalculaLongitud() {
		return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
	}
}
