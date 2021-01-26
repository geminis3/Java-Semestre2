
public class Resto {
	double x,y,resul;
	public Resto(double a,double b) {
		this.x=a;
		this.y=b;
	}
	public double ejecutarResto() {
		resul=x%y;
		return resul;
	}
}
