package conditionals;

import javax.swing.JOptionPane;

public class exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valorAleatorio = (int)(Math.random()*60);
		System.out.print(valorAleatorio);
		
		if (valorAleatorio<10) {
			JOptionPane.showMessageDialog(null,"Valor aleatorio: " + valorAleatorio + "\n" 
					+ "El tipo de clima es Frio");
		}
		if (valorAleatorio > 10 && valorAleatorio <20) {
		JOptionPane.showMessageDialog(null, "Valor aleatorio: " + valorAleatorio + "\n" +
		                                    "El tipo de clima es Nublado");
		}
		if (valorAleatorio > 21 && valorAleatorio <30) {
			JOptionPane.showMessageDialog(null, "Valor aleatorio: " + valorAleatorio + "\n" +
                                                "El tipo de clima es Caluroso");
		}
		if (valorAleatorio > 30) {
			JOptionPane.showMessageDialog(null, "Valor aleatorio: " + valorAleatorio + "\n" +
                                                "El tipo de clima es Tropical");
		}
	}
	
	
	}
	



