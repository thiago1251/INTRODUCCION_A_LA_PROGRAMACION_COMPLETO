package matrices;

public class classexercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArray = new int [5][4];
		//filas
		for (int i=0; i<intArray.length;i++) {
			//columnas
			for (int j=0; j<intArray[i].length;j++) {
				if (intArray[i]==intArray[j]) {
					intArray [i][j]= 1;
				}


			}

		}
		for (int i=0; i<intArray.length;i++) {

			//columnas
			for (int j=0; j<intArray[i].length;j++) {
				System.out.print(intArray[i][j]+" ");

			}
			System.out.println();
		}



	}

}
