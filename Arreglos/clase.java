package Arreglos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a
		// el output es el valos del arreglo uno por uno
		int[] arreglo= new int[10];
		for (int i = 0; i <arreglo.length; i++){
			arreglo[i] = 2 * i;}
		for (int i: arreglo){
			System.out.print(i+ " ");

		}
		System.out.println("_______________________________");

		System.out.println();
		// b
		//esta imprimiendo las vocales del arreglo una por una
		char[] vocal= {'a', 'e', 'i', 'o', 'u'};
		for (int index = 0; index <vocal.length; index++)
			System.out.println(vocal[index]);
		System.out.println("_______________________________");
		// c
		//esta tomando el valor del indice 1
		// y el valor del indice 2
		double ola[] = {12.2, -7.3, 14.2, 11.3};
		System.out.println("Ola1 es " + ola[1]);
		System.out.println("Ola2 es " + ola[2]);

		System.out.println("_______________________________");
		int[] a = new int[10];
		//el índice sería 9
		System.out.println(a.length);


		System.out.println("_______________________________");

		//3
		int[] b = new int[20];
		for (int i = 1; i <= b.length; i++){
			b[i] = 5 * i;
			//i está fuera del rango

			System.out.println("_______________________________");
			//4
			double[] num = new double[10];
			Scanner keyboard = new Scanner(System.in);
			for(int k=0;k<=10;k++) {
				System.out.println("Ingrese un numero:");
				num[k] = keyboard.nextDouble();
				for(int j = 0;k<=j;j++) {

				}
			}



		}
	}

}
