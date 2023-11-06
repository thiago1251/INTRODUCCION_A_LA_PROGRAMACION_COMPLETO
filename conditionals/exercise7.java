package conditionals;

import javax.swing.JOptionPane;

public class exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = JOptionPane.showInputDialog("Escribe el año actual: ");
		int xInt = Integer.parseInt(x);
		
		String y = JOptionPane.showInputDialog("Escribe cualquier año: ");
		int yInt = Integer.parseInt(y);
		int diferen = xInt - yInt;
		if (yInt>xInt || yInt<xInt) { JOptionPane.showMessageDialog(null, "Han pasado o faltan : " + Math.abs(diferen) +" año(s)"+ " desde el " + x);	
		}
		else {
			JOptionPane.showMessageDialog(null, "Han pasado o faltan 0 año(s)" + " desde el " + x);
			
		}
		
		
	}

}
