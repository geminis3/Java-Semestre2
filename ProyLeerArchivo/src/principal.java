/*
 * leer archivo solo si existe
 */
import java.io.*;
public class principal {

	public static void main(String[] args) {
		// variable archivo
		File f1;
		// buffer temporal
		BufferedReader br1 = null;
		// guardar las líneas leidas
		String texto;
		int contador=0;
		// doy archivo al objeto
		f1 = new File("ejemplo.txt");
		if (f1.exists()) {
			//try para manejar errores
			try {
				br1 = new BufferedReader(new FileReader(f1));
				while((texto = br1.readLine())!=null) {
					System.out.println(texto);
					contador++;
				}
				br1.close();
				System.out.println(contador+" líneas leidas");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("el archivo no existe");
		}
		
	}

}
