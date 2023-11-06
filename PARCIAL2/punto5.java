package PARCIAL2;

import javax.swing.JOptionPane;

public class punto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String entrada = JOptionPane.showInputDialog("escribe una palabra");

		
		JOptionPane.showMessageDialog(null, "La palabra ingresada tiene "+ entrada.length()+ " letras");
		
	}

}
