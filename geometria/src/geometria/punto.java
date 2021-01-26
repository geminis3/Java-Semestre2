package geometria;
 
public class punto {
	private double x,y;
	public punto() {
		this.x=3.00;
		this.y=7.53;
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
		if (this.x < 0) {
			System.out.println("ERROR: sólo valores positivos");
		}
		else {
			this.x = x;
		}
	}
	public void setY(double y) {
		if (this.y < 0) {
			System.out.println("ERROR: sólo valores positivos");
		}
		else {
			this.y = y;
		}
	}
	//metodo
	public void mostrarPunto () {
		
		System.out.println("Las coordenadas son:" + "\nx : " + x + "\ny : " + y);
	}
}
 