import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double[] num3 = {4,10,8,2,7};
		double [] num3 = new double[10];
		for(int i=0;i<num3.length;i++) {
			Random random = new Random();
			num3[i]=random.nextInt(50)+1;
			System.out.print(num3[i]+" ");
		}
		double mayor=num3[0],menor=num3[0];
		//System.out.println("mayor: "+mayor);
		//System.out.println("menor: "+menor);
		System.out.println("\n\nbuscar mayor menor");
		for(int i=0;i<num3.length;i++) {
			if(num3[i]>mayor) {
				mayor=num3[i];
			}
			if(num3[i]<menor) {
				menor=num3[i];
			}
		}
		System.out.println("mayor: "+mayor+" menor: "+menor);
	}

}
