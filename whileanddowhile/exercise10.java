package whileanddowhile;

import javax.swing.JOptionPane;

public class exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10. Pida al usuario un número. Elabore un programa que muestre por consola un árbol de números según la siguiente secuencia:​
		//1​
		//22​
		//333​
		//4444​
		//55555
		String x = JOptionPane.showInputDialog(null, "Con el numero ingresado se hara una lista de su respectiva secuencia numerica\n Ingrese el nuemro: "); 

		int i = Integer.parseInt(x);

		do {
			int j=0; int s = 0;
			do {
				System.out.println(i);
				j++;
			}while (j <= 5);
			
			
			
		}while (i < 5);}	
	}


		

