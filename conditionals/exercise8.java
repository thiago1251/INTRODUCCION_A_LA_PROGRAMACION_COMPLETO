package conditionals;

import javax.swing.JOptionPane;

public class exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valorAleatorio = (int)(Math.random()*10+1);
		
		double residuo = valorAleatorio%2;
		
		if (residuo == 0) {
			JOptionPane.showMessageDialog(null, valorAleatorio + " es par");
		}
		else { 
			JOptionPane.showMessageDialog(null, valorAleatorio + " es impar");
		}
		
	}

}
