
public class Cuadrado extends Figuras {
	double perimetro,area,lado;
	
	public Cuadrado(int id, String cat, double lado) {
		super(id, cat);
		this.lado = lado;
	}
	public double CalcularPerimetro() {
		perimetro=lado*4;
		return perimetro;
	}
	public double CalcularArea() {
		area=Math.pow(lado, 2);
		return area;
	}
	public void mostrarInfo() {
		System.out.println("\n....::::: Cuadrado :::::....\n");
		System.out.println("ID: "+getIdFig());
		System.out.println("Categoria: "+categoria);
		System.out.println("Lado: "+lado);
		System.out.println("Perimetro: "+CalcularPerimetro());
		System.out.println("Área: "+CalcularArea());
	}

}
