
public class VehiculosTerrestres {
	private String marca,placa;
	private int anio;
	private double impuesto;
	public VehiculosTerrestres() {
		this.marca="no indicado";
		this.placa="no indicado";
		this.anio=0;
	}
	public VehiculosTerrestres(String marca, String placa, int anio) {
		this.marca = marca;
		this.placa = placa;
		this.anio = anio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public void PresentarVehiculo() {
		System.out.println("Datos Vehículo Terrestre");
		System.out.println("Marca: "+getMarca());
		System.out.println("Año: "+getAnio());
		System.out.println("Placa: "+getPlaca());
		System.out.println("Impuesto: "+CalcularImpuesto());
	}
	public double CalcularImpuesto() {
		int antiguedad = 2020-getAnio();
		if(antiguedad>5) {
			impuesto=200;
		}
		else {
			impuesto=120;
		}
		return impuesto;
	}
}
