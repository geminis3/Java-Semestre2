
public abstract class Figuras {
	private int idFig;
	String categoria;
	public Figuras() {
		this.idFig=111;
		this.categoria="N/A";
	}
	public Figuras(int id, String cat) {
		this.idFig=id;
		this.categoria=cat;
	}
	public int getIdFig() {
		return idFig;
	}
	public void setIdFig(int idFig) {
		this.idFig = idFig;
	}
	//metodos abstractors (no tiene implementacion)
	public abstract double CalcularPerimetro();
	public abstract double CalcularArea();
}
