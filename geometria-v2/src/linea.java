
public class linea {
	private double x1,y1,x2,y2,m,longitud,medioX,medioY;
	//constructores
	public linea() {
		this.x1=0;
		this.y1=0;
		this.x1=0;
		this.x2=0;
	}
	public linea(double x1,double y1,double x2,double y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	//getters
	public double getX1() {
		return this.x1;
	}
	public double getY1() {
		return this.y1;
	}
	public double getX2() {
		return this.x2;
	}
	public double getY2() {
		return this.y2;
	}
	//setters
	public void setX1(double x) {
		this.x1=x;
	}
	public void setY1(double y) {
		this.y1=y;
	}
	public void setX2(double x) {
		this.x2=x;
	}
	public void setY2(double y) {
		this.y2=y;
	}
	//metodos
	public void mostrarLinea() {
		System.out.println("Las coordenadas son:" + "\nX1 : " + this.x1 + "\nY1 : " + this.y1+"\nX2: "+this.x2+"\nY2: "+this.y2);
	}
	public void pendiente() {
		this.m = (this.y2-this.y1)/(this.x2-this.x1);
	}
	public void logitud() {
		this.longitud = Math.sqrt(Math.pow(this.x2-this.x1, 2)+Math.pow(this.y2-this.y1, 2));
	}
	public void puntoMedio() {
		this.medioX = (this.x1+this.x2)/2;
		this.medioY = (this.y1+this.y2)/2;
	}
	public void mostrarResultados() {
		System.out.println("pendiente: "+this.m+"\nlongitud entre puntos: "+this.longitud+"\npunto medio X: "+this.medioX+"\npunto medio Y: "+this.medioY);
	}
}
