package conditionals;

import javax.swing.JOptionPane;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = JOptionPane.showInputDialog(null, "Digite un numero: ");
		int xint = Integer.parseInt(x);
		
		if (xint>0) {
			JOptionPane.showMessageDialog( null, xint + " es positivo");
		}
		else if (xint<0) {
			JOptionPane.showMessageDialog(null,xint + " es negativo");
		}
		
		else { 
			JOptionPane.showMessageDialog(null,xint + " es 0");
		}
			
			
			
			
			
			
			
			
			
			
	}}