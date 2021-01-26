/*
 * programa para transformar KM/h a m/s
 * se usa tres formas diferentes para limitar el número
 * de decimales
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TransformarVelocidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v=0.0;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00000");
		System.out.println("Programa para km/h a m/s");
		System.out.print("Ingrese velocidad en km/h: ");
		v = sc.nextDouble();
		sc.close();
		v = v*1000/3600;
		//con decimal
		System.out.println("DecimalFormat: La velcoidad en m/s es: "+df.format(v));
		//con string format
		System.out.println("StringFormat: La velcoidad en m/s es: "+String.format("%.3f", v));
		//con big decimal
		BigDecimal formatoNumero = new BigDecimal(v);
		formatoNumero = formatoNumero.setScale(2, RoundingMode.DOWN);
		System.out.println("BigDecimal: La velcoidad en m/s es: "+formatoNumero);
	}

}
