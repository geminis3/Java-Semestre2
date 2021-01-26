
public class MediosTransporte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransporteAereo avion1 = new TransporteAereo();
		TransporteAereo avion2 = new TransporteAereo("Boeing", "ABC123", "A700", 2010, 300);
		System.out.println("\n\nLISTANDO AVIONES");
		System.out.println("\nAvión 1");
		System.out.println("Fabricante: "+avion1.getFabricante());
		System.out.println("Placa: "+avion1.getPlaca());
		System.out.println("Modelo: "+avion1.getModelo());
		System.out.println("Año de fabricación: "+avion1.getAnio());
		System.out.println("Velocidad máxima: "+avion1.getVel());
		System.out.println("\nAvión 2");
		System.out.println("Fabricante: "+avion2.getFabricante());
		System.out.println("Placa: "+avion2.getPlaca());
		System.out.println("Modelo: "+avion2.getModelo());
		System.out.println("Año de fabricación: "+avion2.getAnio());
		System.out.println("Velocidad máxima: "+avion2.getVel());
		System.out.println("\nCAMBIO DATOS AVIÓN 2\n");
		System.out.println("Cambiando año...");
		avion2.setAnio(2011);
		System.out.println("Cambiando fabricante...");
		avion2.setFabricante("Airbus");
		System.out.println("Cambiando velocidad...");
		avion2.setVel(900);
		System.out.println("\nAvión 2");
		System.out.println("Fabricante: "+avion2.getFabricante());
		System.out.println("Placa: "+avion2.getPlaca());
		System.out.println("Modelo: "+avion2.getModelo());
		System.out.println("Año de fabricación: "+avion2.getAnio());
		System.out.println("Velocidad máxima: "+avion2.getVel());
	}

}
