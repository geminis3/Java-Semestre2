package segundoGrado;

public class ecuacion {
	int a,b,c;
	double x1,x2,discriminante;
	public ecuacion(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void cuadratica() {
		discriminante = b*b - (4 * a * c);
		if (discriminante>=0) {
			x1 = (-b + Math.sqrt(discriminante))/(2 * a);
	        x2 = (-b - Math.sqrt(discriminante))/(2 * a);
	        System.out.println("Las soluciones son x1 = "+x1+" y x2 = "+x2);
		}
		else {
			System.out.println("El determinante es negativo, no hay solución");
		}
	}
}
