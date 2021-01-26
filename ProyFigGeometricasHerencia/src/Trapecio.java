
public class Trapecio extends Figuras {
	double perimetro,area,b,B,l;
	public Trapecio(int id, String cat, double b, double B, double l) {
		super(id, cat);
		this.b=b;
		this.B=B;
		this.l=l;
	}
	public double CalcularAltura() {
		//imaginamos a la altura como el otro cateto de un triangulo rectangulo con hipotenusa l y base x
		double x=(B-b)/2;//x es la distancia que nos falta
		double h = Math.sqrt(Math.pow(l, 2)-Math.pow(x, 2));
		return h;
	}
	public double CalcularPerimetro() {
		perimetro=b+B+l+l;
		return perimetro;
	}
	public double CalcularArea() {
		area=((B+b)*CalcularAltura())/2;
		return area;
	}
	public void mostrarInfo() {
		System.out.println("\n....::::: Trapecio Isósceles :::::....\n");
		System.out.println("ID: "+getIdFig());
		System.out.println("Categoria: "+categoria);
		System.out.println("Lado mayor (B): "+B);
		System.out.println("Lado menor (b): "+b);
		System.out.println("Lado (l): "+l);
		System.out.println("Altura calculada (h): "+CalcularAltura());
		System.out.println("Perimetro: "+CalcularPerimetro());
		System.out.println("Área: "+CalcularArea());
	}
}
