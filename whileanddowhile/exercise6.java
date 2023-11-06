package whileanddowhile;

import javax.swing.JOptionPane;

public class exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
	
		int numero,valido;
		valido = 20;
		
		while(valido==20) {
			String inputNumero = JOptionPane.showInputDialog("Ingrese un número");
			 numero = Integer.parseInt(inputNumero);
			if (numero==20) {
				JOptionPane.showInternalMessageDialog(null,"El numero es valido");break;
			}
			else {
				JOptionPane.showInternalMessageDialog(null,"El numero ingresado no es valido"  + "\n"
						                                 + "vuelva a intentarlo");
			}
		};
			
		
		
		System.exit(0);
	
		
	}

}
