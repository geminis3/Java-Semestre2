
public class Triangulo extends Figuras {
	double perimetro,area,base,altura;
	public Triangulo(int id, String cat, double base, double h) {
		super(id, cat);
		this.base=base;
		this.altura=h;
	}
	public double CalcularHipotenusa() {
		double hipotenusa = Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
		return hipotenusa;
	}
	public double CalcularPerimetro() {
		perimetro=base+altura+CalcularHipotenusa();
		return perimetro;
	}
	public double CalcularArea() {
		area=(base*altura)/2;
		return area;
	}
	public void mostrarInfo() {
		System.out.println("\n....::::: Triángulo Rectángulo :::::....\n");
		System.out.println("ID: "+getIdFig());
		System.out.println("Categoria: "+categoria);
		System.out.println("Base: "+base);
		System.out.println("Altura: "+altura);
		System.out.println("Hipotenusa calculada: "+CalcularHipotenusa());
		System.out.println("Perimetro: "+CalcularPerimetro());
		System.out.println("Área: "+CalcularArea());
	}
}
