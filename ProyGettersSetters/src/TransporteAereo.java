
public class TransporteAereo {
	private String fabricante,placa,modelo;
	private int anioFabric;
	private double velMax;
	
	public TransporteAereo() {
		this.fabricante="no indicado";
		this.placa="no indicado";
		this.modelo="no indicado";
		this.anioFabric=0;
;		this.velMax=0;
	}
	public TransporteAereo(String fabri, String plac,String model, int anio, double vel) {
		this.fabricante=fabri;
		this.placa=plac;
		this.modelo=model;
		this.anioFabric=anio;
;		this.velMax=vel;
	}
	
	//getters y setters
	public String getFabricante() {
		return this.fabricante;
	}
	public String getPlaca() {
		return this.placa;
	}
	public String getModelo() {
		return this.modelo;
	}
	public int getAnio() {
		return this.anioFabric;
	}
	public double getVel() {
		return this.velMax;
	}
	public void setFabricante(String newFabr) {
		this.fabricante = newFabr;
	}
	public void setPlaca(String newPlaca) {
		this.placa = newPlaca;
	}
	public void setModelo(String newMod) {
		this.modelo = newMod;
	}
	public void  setAnio(int newAnio) {
		if (newAnio <= this.anioFabric) {
			System.out.println("ERROR: el año ingresado es igual o menor al valor actual");
		}
		else {
			this.anioFabric = newAnio;
		}
	}
	public void setVel(double newVel) {
		this.velMax = newVel;
	}
}
