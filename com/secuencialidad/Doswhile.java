package com.secuencialidad;
import javax.swing.JOptionPane;

public class Doswhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		int suma = 0;
		
		do {
            if(num%2==0){
                System.out.println(num);
                suma += num;
            }
             num++;
        }while (num<=100 && num>=2);
		JOptionPane.showMessageDialog(null,"La suma de los numeros es: " + suma);
		
	}

}
