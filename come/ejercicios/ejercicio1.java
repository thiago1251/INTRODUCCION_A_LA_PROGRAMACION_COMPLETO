package come.ejercicios;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//convertir de grados a radianes
		
		String grados = JOptionPane.showInputDialog("HI" + "\n" 
				                                    + " Please, write the angle in degrees");
		double gradosDouble = Double.parseDouble(grados);
		
		final double pi= 3.1416;
		double radianes = gradosDouble*pi/180;
		
		System.out.print(radianes);
				
		
		
		
		JOptionPane.showMessageDialog(null, "In radians is: " + radianes);
		
	}

}
