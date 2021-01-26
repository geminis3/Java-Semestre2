
public class triangulo {
	double base,h,area;
	public triangulo(double base, double h) {
		this.base=base;
		this.h=h;
	}
	public double calcularArea() {
		area = (base*h)/2;
		return area;
	}
}
