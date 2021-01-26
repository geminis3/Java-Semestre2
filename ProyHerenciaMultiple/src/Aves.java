
public class Aves {
	private String NComun, NCientifico;
	private float peso;
	
	public Aves(String nComun, String nCientifico, float peso) {
		this.NComun = nComun;
		this.NCientifico = nCientifico;
		this.peso = peso;
	}

	public String getNComun() {
		return NComun;
	}

	public void setNComun(String nComun) {
		NComun = nComun;
	}

	public String getNCientifico() {
		return NCientifico;
	}

	public void setNCientifico(String nCientifico) {
		NCientifico = nCientifico;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void MostrarInfo() {
		System.out.println("Nombre común: "+getNComun());
		System.out.println("Nombre científico: "+getNCientifico());
	}
}
