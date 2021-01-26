
public class Division2 {
	double x,y,division;
	float divi;
	public Division2(double a,double b) {
		this.x=a;
		this.y=b;
	}
	public double EjecutarDiv() {
		division=x/y;
		return division;
	}
	public float EjecutarDiv2() {
		divi = (float)(x/y);
		return divi;
	}
}
