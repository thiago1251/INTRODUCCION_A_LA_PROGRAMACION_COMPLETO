package quiz1;

import javax.swing.JOptionPane;

public class punto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String option = JOptionPane.showInputDialog("Seleccione una opcion: \n"
                + "1. CELCIUS\n"
                + "2. FARENHEIT\n");
		

	

		switch (option.toLowerCase()) {
		case "C":
			String optionn = JOptionPane.showInputDialog(" Escribe grados celcius: ");
			double optionx = Double.parseDouble(optionn);
			double farenheit = 9*(optionx/5)+32;
			JOptionPane.showMessageDialog(null,"Grados Farenheit es igual a:" + farenheit);
			
		case "c":
			
			String optionnn = JOptionPane.showInputDialog(" Escribe grados celcius: ");
			double optionxX = Double.parseDouble(optionnn);
			double farenheitx = 9*(optionxX/5)+32;
			JOptionPane.showMessageDialog(null,"Grados Farenheit es igual a:" + farenheitx);break;
		case "F":
			String optionny = JOptionPane.showInputDialog(" Escribe grados celcius: ");
			double optiony = Double.parseDouble(optionny);
			double celcius = 9*(optiony/5)+32;
			JOptionPane.showMessageDialog(null,"Grados Farenheit es igual a:" + celcius);break;
			
		case "f":
			String optionny2 = JOptionPane.showInputDialog(" Escribe grados farenheit: ");
			double optiony1 = Double.parseDouble(optionny2);
			double celcius2 = 5*(optiony1-32)/9;
			JOptionPane.showMessageDialog(null,"Grados Farenheit es igual a:" + celcius2);break;
			

		default:
			JOptionPane.showMessageDialog(null,"ERROR");break;
			
		}
		
	
		
		}

					
	}


