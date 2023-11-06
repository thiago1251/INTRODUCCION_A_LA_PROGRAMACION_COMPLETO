package Arreglos;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 0;
		int max = 1;
		int contador=0;
		int[] numerosAleatorios = new int[20];


		for(int i=0 ;i<20 ; i++) {
			int valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
			numerosAleatorios[i]=valorAleatorio;
			System.out.print(numerosAleatorios[i]);

			if (numerosAleatorios[i]==0){
				contador++;	
			}

		}
		System.out.println("\nEl numero de ceros es:" + contador);


	}
}





