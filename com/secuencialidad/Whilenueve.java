package com.secuencialidad;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Whilenueve {

	private static Scanner temp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
int x = 2;
int selec;
int tiemp = 0;
int mins = 0;
temp = new Scanner (System.in);
System.out.println("Introduzca la temperatura a la que se espera llegar:");
selec = temp.nextInt();
		
		while (x<selec) {
            x+=2;
            tiemp ++;
            if (tiemp==60) {
            	mins ++;
            	tiemp = 0;
            }
        }
		JOptionPane.showMessageDialog(null,"El tiempo que se espera es: " + mins + " mins " + tiemp + " sec ");
	}
}