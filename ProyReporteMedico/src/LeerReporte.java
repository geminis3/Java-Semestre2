import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerReporte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dia, paciente;
		FileInputStream f1;
		DataInputStream dataIn1 = null;
		//verificar conexion
		try {
			f1 = new FileInputStream("registro.txt");
			dataIn1 = new DataInputStream(f1);
		} catch (IOException e) {
			System.out.println("archivo no existe");
		}
		//proceso lectura flujo
		try {
			int hora;
			double frec,temp;
			dia = dataIn1.readUTF();
			System.out.println(dia);
			paciente = dataIn1.readUTF();
			System.out.println(paciente);
			while(dataIn1.available()>0) {//mientras la disponibilidad del stream sea >0 seguimos leyendo
				hora = dataIn1.readInt();
				frec = dataIn1.readDouble();
				temp = dataIn1.readDouble();
				System.out.println("Hora: "+hora+"\t\tFrec: "+frec+"\t\tTemp: "+temp);
			}
			
		} catch (IOException e2) {
			System.out.println("error "+e2);
		}
	}

}
