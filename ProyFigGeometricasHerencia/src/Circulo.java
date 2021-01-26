
public class Circulo extends Figuras {
	double perimetro,area,radio;
	public Circulo(int id, String cat, double radio) {
		super(id, cat);
		this.radio=radio;
	}
	public double CalcularPerimetro() {
		perimetro=2*Math.PI*radio;
		return perimetro;
	}
	public double CalcularArea() {
		area=Math.PI*Math.pow(radio, 2);
		return area;
	}
	public void mostrarInfo() {
		System.out.println("\n....::::: Círculo :::::....\n");
		System.out.println("ID: "+getIdFig());
		System.out.println("Categoria: "+categoria);
		System.out.println("Radio: "+radio);
		System.out.println("Perimetro: "+CalcularPerimetro());
		System.out.println("Área: "+CalcularArea());
	}
}
