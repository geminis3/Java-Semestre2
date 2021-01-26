
public class ClasePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autos auto1 = new Autos("naranja",1500,3,2017);
		Autos auto2 = new Autos("blanco",1500,3,2017);
		auto1.Encender();
		auto1.Apagar();
		System.out.println(auto1.color);
		auto2.Encender();
		auto2.Apagar();
		System.out.println(auto2.color);
	}

}
