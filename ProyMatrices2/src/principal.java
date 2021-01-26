
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matriz2 = new int[3][4];
		int filas = matriz2.length;
		int columnas = matriz2[0].length;
		System.out.println("filas "+filas);
		System.out.println("columnas "+columnas);
		//llenando randomicamente
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				matriz2[i][j]=(int)(Math.random()*50);
				System.out.print(matriz2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
