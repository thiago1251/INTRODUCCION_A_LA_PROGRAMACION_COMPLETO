package com.secuencialidad;
import java.util.Scanner;
public class Whilesiete {

	private static Scanner contraseña;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		contraseña = new Scanner(System.in);
		int contr;
		System.out.print("Porfavor coloque su contraseña: ");
				
		boolean digitado=false;
		contr=contraseña.nextInt();

			while(digitado==false){
			System.out.print("Contraseña incorrecta, porfavor coloque la contraseña nuevamente");
			contr=contraseña.nextInt();
			
			if(contr==1234){
				System.out.print("Contraseña correcta");
				digitado=true;
			}
			else{
				digitado=false;
			}
		}
	}

}
