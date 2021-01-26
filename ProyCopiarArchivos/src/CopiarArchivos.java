/*
 * copiar el contenido de un archivo en otro
 */
import java.io.*;
public class CopiarArchivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("ejemplo1.txt");
		File f2 = new File("ejemplo2.txt");
		FileInputStream origen = null;
		FileOutputStream destino = null;
		try {
			origen = new FileInputStream(f1);
			destino = new FileOutputStream(f2);
			int c;
			while((c = origen.read()) != -1) {
				destino.write((byte)c);
			}
			System.out.println("Archivo copiado");
		} catch (IOException e) {
			System.out.println("Excepción E/S"+e);
		} finally {
			try {
				origen.close();
				destino.close();
			} catch (IOException e2) {
				System.out.println("Excepción E/S"+e2);
			}
		}
	}

}
