package Arreglos;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min = 0;
		int max = 20;


		int[] numerosAleatorios = new int[6];


		for(int i=0;i<6;i++) {
			int valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
			numerosAleatorios[i]=valorAleatorio;

			if(numerosAleatorios[i]%3==0) {
				System.out.println("El numero "+numerosAleatorios[i]+" es multiplo de 3");
			}
		}

		for(int valor : numerosAleatorios) {
			System.out.println("Numero: "+valor);
		}


	}






}


