
public abstract class Figura {
	int id,color;
	//constructor
	public Figura(int id, int color) {
		this.id = id;
		this.color = color;
	}
	//getters setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
	//metodos abstractos
	public abstract void Dibujar();
	public abstract void Borrar();
	public abstract void CambiarColor();
}
