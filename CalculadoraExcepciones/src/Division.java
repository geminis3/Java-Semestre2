
public class Division {
	int n1,n2;
	public Division(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	public double realizarDivision() {
		int a=n1/n2;//código basura que causa una excepción
		return (double)n1/n2;
	}
}
