package quiz1;

import javax.swing.JOptionPane;

public class punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String option = JOptionPane.showInputDialog("Seleccione una opcion: \n"
                + "1. Para 4 ingrese E\n"
                + "2. Para 3 ingrese S\n"
                + "2. Para 2 ingrese A\n"
				+ "2. Para 1 ingrese I\n"
				+ "2. Para 0.0 ingrese D\n");
	

		switch (option.toLowerCase()) {
		
		case "e":
			JOptionPane.showMessageDialog(null, "La nota es 4");break;
		case "s":
			JOptionPane.showMessageDialog(null, "La nota es 3");break;
		case "a":
			JOptionPane.showMessageDialog(null, "La nota es 2");break;
		case"i":
			JOptionPane.showMessageDialog(null, "La nota es 1");break;
		case"d":
			JOptionPane.showMessageDialog(null, "La nota es 0.0");break;
		default:
			JOptionPane.showMessageDialog(null, "ERROR");
			
			}
		
			
		}
	}


