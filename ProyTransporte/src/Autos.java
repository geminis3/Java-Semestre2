
public class Autos extends VehiculosTerrestres {
	private int numAsientos;
	private boolean segNinios;
	public Autos() {
		this.numAsientos=0;
		this.segNinios=false;
	}
	public Autos(String marca, String placa, int anio, int asientos, boolean ninios) {
		//enviamos parametros al constructor padre
		super(marca, placa, anio);
		this.numAsientos=asientos;
		this.segNinios=ninios;
	}
	public int getNumAsientos() {
		return numAsientos;
	}
	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}
	public boolean isSegNinios() {
		return segNinios;
	}
	public void setSegNinios(boolean segNinios) {
		this.segNinios = segNinios;
	}
	public void PresentarVehiculo() {
		System.out.println("\n\nDatos Auto");
		System.out.println("Marca: "+getMarca());
		System.out.println("Año: "+getAnio());
		System.out.println("Placa: "+getPlaca());
		System.out.println("Seguro niños: "+isSegNinios());
		System.out.println("Asientos: "+getNumAsientos());
		System.out.println("Impuesto: "+CalcularImpuesto());
	}
}
