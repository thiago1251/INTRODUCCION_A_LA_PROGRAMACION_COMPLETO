package quiz1;

import javax.swing.JOptionPane;

public class punto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String option = JOptionPane.showInputDialog("CO2 es dióxido de carbono. ¿Estas deacuerdo?"+ "\n"
				+"SI\n  NO");

		boolean x ;

		switch (option.toLowerCase()) {
		case "si":
			x = true;
			
		case "s":
			x = true;
		
		case "no":
			x = false;
			
		
		default:
			
			x = false;
		}
		
		if (x == true) {
			JOptionPane.showMessageDialog(null, "Correcto");
			
		}
		if (x == false) {
			JOptionPane.showMessageDialog(null, "Incorrecto");
		
		}
	}}
