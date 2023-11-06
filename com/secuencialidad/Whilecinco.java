package com.secuencialidad;

import java.util.Scanner;

public class Whilecinco {

	private static Scanner valx;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int x;
		  int factor=1;
		  
		  valx = new Scanner (System.in);
		  
		  System.out.println("Introduzca el número el cuál se va a hallar el factorial:");
		    x = valx.nextInt();
		    
		    while ( x!=0) {
		    	 factor=factor*x; x--;
		    	}
		    
		    System.out.println("El valor del factorial es: " + factor);
	}

}
