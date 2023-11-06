package conditionals;

import javax.swing.JOptionPane;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = JOptionPane.showInputDialog(null, "Escribe un numero: ");
		int xint = Integer.parseInt(x);
		
		String Y = JOptionPane.showInputDialog("Escribe otro numero entero Y: ");
		int Yint = Integer.parseInt(Y);
		
		if (xint>Yint) { 
			       JOptionPane.showMessageDialog(null, xint + " es mayor que " + Yint);
		}
		else if ( xint<Yint) {
			          JOptionPane.showMessageDialog(null, xint + " es menor que " + Yint);
		}
		else if (xint==Yint) {
			       JOptionPane.showMessageDialog(null, xint + " es igual que " + Yint); 
		}
		
		
	}

}
