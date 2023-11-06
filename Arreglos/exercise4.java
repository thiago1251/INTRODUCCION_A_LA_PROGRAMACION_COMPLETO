 package Arreglos;

import java.util.Arrays;

public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int min = 1;
		int max = 9;
		int secuencial = 0;
		int[] numerosAleatorios = new int[10];
		for(int a=0;a<numerosAleatorios.length;a++) {
			int valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
			numerosAleatorios[a]=valorAleatorio;
			System.out.print(numerosAleatorios[a]);
		}
		for(int i = 0; i < numerosAleatorios.length; i++) {
			for( int s = 1; s < (numerosAleatorios.length - i); s++ ) 

				if (numerosAleatorios[s - 1] > numerosAleatorios[s]) {
					secuencial = numerosAleatorios[s - 1];
					numerosAleatorios[s - 1] = numerosAleatorios[s];
					numerosAleatorios[s] = secuencial;
				}
		}
		System.out.println("       "  + Arrays.toString(numerosAleatorios));

	}
}
