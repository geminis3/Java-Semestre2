
public class factorial {
	int n,fact=1;
	public factorial(int n) {
		this.n=n;
	}
	public int calcularFactorial() {
		while (n!=0) {
			fact=fact*n;
			n--;
		}
		return fact;
	}
}
