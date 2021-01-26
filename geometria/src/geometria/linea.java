package geometria;
 
public class linea {
 
  private double x1,
  y1,
  x2,
  y2,
  resul;
 
  public linea(double xs1, double xs2, double ys1, double ys2) {
    this.x1 = xs2;
    this.x2 = xs2;
    this.y1 = ys1;
    this.y2 = ys2;
  }
  public linea() {
 
    this.x1 = 0;
    this.x2 = 0;
    this.y1 = 0;
    this.y2 = 0;
 
  }
 
  public double getX1() {
 
    return x1;
  }
 
  public void setX1(double x1) {
 
    if (this.x1 >= 0) {
      this.x1 = x1;
    } else {
 
      System.out.println("El valor es negativo ");
 
    }
 
  }
 
  public double getY1() {
    return y1;
  }
 
  public void setY1(double y1) {
 
    if (this.y1 >= 0) {
      this.y1 = y1;
    } else {
 
      System.out.println("El valor es negativo ");
 
    }
 
  }
 
  public double getX2() {
    return x2;
  }
 
  public void setX2(double x2) {
 
    if (this.x2 >= 0) {
      this.x2 = x2;
    } else {
 
      System.out.println("El valor es negativo ");
 
    }
 
  }
 
  public double getY2() {
    return y2;
  }
 
  public void setY2(double y2) {
 
    if (this.y2 >= 0) {
      this.y2 = y2;
    } else {
 
      System.out.println("El valor es negativo ");
 
    }
  }
 
public double  pendienteLinea() {
    resul = (this.y2 - this.y1) / (this.x2 - this.x1);
    return resul;
 
  }
  public double longitudRecta() {
    resul = Math.sqrt(Math.pow((this.x2 - this.x1), 2) + Math.pow((this.y2 - this.y1), 2));
    return resul;
  }
  public double medioX() {
    resul = (this.x1 + this.x2) / 2;
    return resul;
  }
  
  public void mostrarLinea() {
		System.out.println("Las coordenadas de la línea son:" + "\nx1 : " + x1 + "\nx2 : " + x2
				+ "\ny1 : " + y1 + "\ny2 : " + y2 );
	}
  }