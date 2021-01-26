
public class humedad {
	public double generarHumedad(){
		double min=70;
		double max=95;
		return (Math.random()*(max-min)+min);
	}
}
