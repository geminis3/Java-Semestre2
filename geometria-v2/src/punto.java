
public class punto {
	private double x,y;
	public punto() {
		this.x=0;
		this.y=0;
	}
	public punto(double x,double y) {
		this.x=x;
		this.y=y;
	}
	//getters
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	//setters
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}
	//metodo
	public void mostrarPunto () {
		System.out.println("Las coordenadas son:" + "\nx : " + x + "\ny : " + y);
	}
}
