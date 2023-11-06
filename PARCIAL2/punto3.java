package PARCIAL2;

import javax.swing.JOptionPane;

public class punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ma = JOptionPane.showInputDialog("Ingrese el maximo");
		int max = Integer.parseInt(ma);

		for (int i = 1 ; i<= max; i++) {

			if(i%2==1) {
				continue;
			}

			if(i%2==0) {
				System.out.print(i);
				System.out.print(" "); 		
	}

		}}}
