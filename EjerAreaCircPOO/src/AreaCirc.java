
public class AreaCirc {
	double radio,area;
	final double pi=3.14;
	public AreaCirc(double x) {
		this.radio=x;
	}
	public double CalcularArea() {
		area = pi*Math.pow(radio, 2);
		return area;
	}
}
