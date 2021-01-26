
public class frecCardiaca {
	public double generarFrec() {
		final double frecInf = 40;
		final double frecSup = 100;
		//random
		return (Math.random()*(frecSup-frecInf)+frecInf);
	}
}
