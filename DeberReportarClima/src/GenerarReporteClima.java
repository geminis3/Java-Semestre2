import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

public class GenerarReporteClima {

	public static void main(String[] args) {
		double temp,hum,radiacion;
		LocalDate fechaActual = LocalDate.now();//obtenemos la fecha actual del sistema
		//cabeceras
		String cabecera="/// REPORTE DIARIO DEL CLIMA ///";
		String datos="Fecha: "+fechaActual+" Ciudad: Quito";
		String coordenadas="Latitud: -0.21975 Longitud: 78.51256";
		//instanciamos objetos clases generadoras
		temperatura t1 = new temperatura();
		humedad h1 = new humedad();
		radiacionSolar rs1 = new radiacionSolar();
		//inicializamos
		DataOutputStream dataOut1 = null;
		try {
			//cambiar el path según corresponda
			File f1 = new File("/home/geminis3/reporteClimaQuito.txt");
			if(f1.createNewFile()) {
				System.out.println("Archivo nuevo creado");
			}
			else {
				System.out.println("El archivo ya existe, omitiendo creación...");
			}
			dataOut1 = new DataOutputStream(new FileOutputStream(f1));
			dataOut1.writeUTF(cabecera);
			dataOut1.writeUTF(datos);
			dataOut1.writeUTF(coordenadas);
			for(int i=0;i<24;i++) {
				dataOut1.writeInt(i);
				temp=t1.generarTemp();
				dataOut1.writeDouble(temp);
				hum=h1.generarHumedad();
				dataOut1.writeDouble(hum);
				radiacion=rs1.generarRadiacionSolar();
				dataOut1.writeDouble(radiacion);
			}
			System.out.println("Reporte escrito a archivo");
		} catch (IOException e1) {
			System.out.println("Se produjo un error de E/S\n"+e1);
		} finally {
			try {
				dataOut1.close();
			} catch (Exception e2) {
				System.out.println("Se produjo error al cerrar los sockets\n"+e2);
			}
		}
	}

}
