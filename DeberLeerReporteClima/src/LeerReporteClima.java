import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerReporteClima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cabecera,datos,coordenada;
		FileInputStream f1 = null;
		DataInputStream dataIn1 = null;
		//verificar conexion
		try {
			//importante
			//el path deberá ser el mismo del archivo creado anteriormente
			f1 = new FileInputStream("/home/geminis3/reporteClimaQuito.txt");
			dataIn1 = new DataInputStream(f1);
		} catch (IOException e) {
			System.out.println("Se produjo un error al abrir el archivo\n"+e);
		}
		//leer
		try {
			int hora;
			double temp,hum,radiacion;
			cabecera = dataIn1.readUTF();
			System.out.println(cabecera);
			datos = dataIn1.readUTF();
			System.out.println(datos);
			coordenada = dataIn1.readUTF();
			System.out.println(coordenada);
			System.out.println();
			while(dataIn1.available()>0) {
				hora=dataIn1.readInt();
				temp=dataIn1.readDouble();
				hum=dataIn1.readDouble();
				radiacion=dataIn1.readDouble();
				System.out.printf("Hora: %d:00\tTemperatura: %.2f °C\tHumedad: %.2f %%\tRadiación Solar (índice UV): %.0f\n",hora,temp,hum,radiacion);
			}
		} catch (Exception e) {
			System.out.println("Se produjo un error al leer el archivo\n"+e);
		} finally {
			try {
				f1.close();
				dataIn1.close();
			} catch (Exception e2) {
				System.out.println("Se produjo error al cerrar los sockets\n"+e2);
			}
		}
	}

}
