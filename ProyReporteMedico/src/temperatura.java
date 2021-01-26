
public class temperatura {
	public double generarTemp() {
		final double tempInf = 35;
		final double tempSup = 40;
		//random
		return (Math.random()*(tempSup-tempInf)+tempInf);
	}
}
