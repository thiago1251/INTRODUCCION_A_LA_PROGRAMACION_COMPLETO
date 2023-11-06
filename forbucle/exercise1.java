package forbucle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double n,suma=0,x;
	        double promedio;
	        
	        String input= JOptionPane.showInputDialog("Ingresar cantidad de elementos:");
	        n = Double.parseDouble(input);
	   
	        for(int i=1;i<=n;i++)
	        { 
	        String termino = JOptionPane.showInputDialog("Ingrese el numero:");
	        x = Integer.parseInt(termino);
	       
	         suma=suma+x;                
	        }   
	        promedio=suma/n;
	        
	         JOptionPane.showMessageDialog(null,"El Promedio es:" +promedio);                               
	    }   
		}
		
		
		



