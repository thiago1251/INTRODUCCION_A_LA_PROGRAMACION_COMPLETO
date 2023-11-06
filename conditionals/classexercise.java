package conditionals;

import javax.swing.JOptionPane;

public class classexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crear menu
		String inputOption = JOptionPane.showInputDialog("Seleccione una opcion: \n"
				                                         + "1. Suma\n"
				                                         + "2. Resta\n"
				                                         + "3. Multiplicacion\n");
		
		int option = Integer.parseInt(inputOption);
		
		switch (option) {
				case 1: 
					JOptionPane.showMessageDialog(null, "Ha seleccionado suma");
				case 2: 
					JOptionPane.showMessageDialog(null, "Ha seleccionado resta");
				case 3: 
					JOptionPane.showMessageDialog(null, "Ha seleccionado multiplicacion");
				
				
				
		}
		
				
	}

}
