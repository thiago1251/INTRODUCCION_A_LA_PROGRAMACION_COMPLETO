package Arreglos;

import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] num = new double[4];
		Scanner keyboard = new Scanner(System.in);
		for(int k=0;k<=3;k++) {
			System.out.println("Ingrese un numero:"+ (k+1));
			num[k] = keyboard.nextDouble();	
		}
		double elderly,minor;
		elderly = num[0];
		minor = num[0];
		for (int k = 0; k < num.length; k++) {
			if(num[k]> elderly) {
				elderly = num[k];
			}
			if(num[k]< minor) {
				minor = num[k];
				}
		}
		System.out.print(" El numero mayor es:" + elderly);
		System.out.print(" El numero menor es:" + minor);

	}
}
