package conditionals;

import javax.swing.JOptionPane;

public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Calcula tu salario");
		
		String x = JOptionPane.showInputDialog("Dijite horas trabajadas: ");
		double xdou = Double.parseDouble(x);
		double Y = 16*xdou;

		
		if (xdou<=40) {
			JOptionPane.showMessageDialog(null,"Horas trabajadas: " + xdou +"\n"
					                          +"Tu pago es de $:"+ Y );	
		}
		else if(xdou>40) {
			double n = xdou-40;
			double m = 20 * n;
			double y2 = 16*40;
			double pagoadd = y2+m;
			JOptionPane.showMessageDialog(null,"Horas trabajadas: " + xdou +"\n"
					                     +"Tu pago es de $:"+ pagoadd );	
			
		}
	
		
	}

}
