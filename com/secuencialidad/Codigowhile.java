package com.secuencialidad;
import java.util.Scanner;


public class Codigowhile {

	private static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int x;
		  int cantn=0;
		  int suma=0;

		  entrada = new Scanner (System.in);

		    System.out.println("Introduzca el primer número");
		    x = entrada.nextInt();
		    

		    while(x != 0){
		      suma += x;
		      cantn ++;
		      System.out.println("Introduzca otro número, si quiere dejar de agregar números, ingrese 0");
		      x = entrada.nextInt();     
		    }
		      
		    if (cantn == 0){
		      System.out.println("No hay números para hallar el promedio");
		    }
		    else {
		    	int promedio = suma / cantn;
			      System.out.println("El total de números son: " + cantn);
			      System.out.println("El promedio es: " + promedio);
		    }
		    
	}

}
