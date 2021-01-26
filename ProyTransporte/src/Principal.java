
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehiculosTerrestres vehiculo1 = new VehiculosTerrestres("Kia", "XYZ2020", 2019);
		vehiculo1.PresentarVehiculo();
		Autos a1 = new Autos("BMW", "LINUX20", 2019, 4, true);
		a1.PresentarVehiculo();
		Camiones c1 = new Camiones("JAC", "PCX1900", 2000, 2, "Campana");
		c1.PresentarVehiculo();
	}

}
