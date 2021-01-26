
public class Camiones extends VehiculosTerrestres {
	private int Categoria;
	private String tipoRuedas;
	public Camiones() {
		this.Categoria=0;
		this.tipoRuedas="N/A";
	}
	public Camiones(String marca, String placa, int anio, int cat, String tip) {
		super(marca, placa, anio);
		this.Categoria=cat;
		this.tipoRuedas=tip;
	}
	
	public int getCategoria() {
		return Categoria;
	}
	public void setCategoria(int categoria) {
		Categoria = categoria;
	}
	public String getTipoRuedas() {
		return tipoRuedas;
	}
	public void setTipoRuedas(String tipoRuedas) {
		this.tipoRuedas = tipoRuedas;
	}
	
	public void PresentarVehiculo() {
		System.out.println("\nDatos Camión");
		System.out.println("Marca: "+getMarca());
		System.out.println("Año: "+getAnio());
		System.out.println("Placa: "+getPlaca());
		System.out.println("Categoria: "+getCategoria());
		System.out.println("Tipo Ruedas: "+getTipoRuedas());
		System.out.println("Impuesto: "+CalcularImpuesto());
	}
	
}
