/*
PROBLEMA: 
Crear un reporte médico en el que se registren diariamente los signos vitales de un paciente alojado en una sala de hospital. 

Los signos vitales a registrarse son: la temperatura y la frecuencia cardiaca. El reporte debe mostrar un encabezado en el que se muestre la fecha, el nombre del paciente y su edad. 

DESARROLLO:
- Para dar mayor realismo al reporte crearemos métodos que generen aleatoriamente los datos de temperatura y frecuencia cardiaca.
- Los datos informativos del paciente pueden estar predefinidos (Como ejercicio adicional usted puede modificar el código para que el usuario ingrese esta informaciónpor teclado o se lean de un archivo externo). 
- Se usará métodos diferentes para escribir los datos en el archivo según su tipo. 
 */
import java.io.*;
public class GenerarReporte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dia="12 de enero 2021 -- Registro Diario de Signos Vitales", paciente="Paciente: Bruno Diaz -- Edad: 40 años";
		double frecuencia,temperatura;
		//usar un DataOuputStream xq escribiremos datos de diferente tipo
		DataOutputStream dataOut1 = null;
		frecCardiaca frec = new frecCardiaca();
		temperatura temp = new temperatura();
		try {
			dataOut1 = new DataOutputStream(new FileOutputStream("registro.txt"));
			//escribir datos informativos
			dataOut1.writeUTF(dia);
			dataOut1.writeUTF(paciente);
			for(int i=0;i<24;i++) {
				dataOut1.writeInt(i);
				frecuencia = frec.generarFrec();
				temperatura = temp.generarTemp();
				dataOut1.writeDouble(frecuencia);
				dataOut1.writeDouble(temperatura);
			}
			System.out.println("Generado");
		} catch (IOException e) {
			System.out.println("Se produjo error E/S");
		} finally {
			try {
				dataOut1.close();
			} catch (IOException e2) {
				System.out.println("Se produjo error E/S");
			}
		}
	}

}
