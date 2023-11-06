package conditionals;

import javax.swing.JOptionPane;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = JOptionPane.showInputDialog(null, "Digite el precio de tu compra: ");
		int xint = Integer.parseInt(x);
		double Y = xint*0.2;
		
		if (xint>300) {
			double result = xint - Y;
			       JOptionPane.showMessageDialog(null, "Su descuento es de: " + Y + "\n " 
			    		                             + " Total a pagar: " + result );	
		}
		else {
			JOptionPane.showMessageDialog(null, "No tienes descuento" + "\n"
					                           +" Total a pagar: " + xint);	
		}
		
		
		
		
		
		
		
		
		
	}

}
