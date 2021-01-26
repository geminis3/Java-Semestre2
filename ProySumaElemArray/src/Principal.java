
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] Array1 = {3,6,9,12,15};
		double suma=0;
		//Sumando elemento a elemento
		for(double x:Array1) {
			suma+=x;
		}
		//imprimir elementos
		for(double x:Array1) {
			System.out.println(x);
		}
		System.out.println("La suma es: "+suma);
	}

}
