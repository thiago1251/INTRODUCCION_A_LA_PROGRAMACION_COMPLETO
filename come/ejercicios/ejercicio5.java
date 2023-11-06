package come.ejercicios;

import javax.swing.JOptionPane;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//pasar velocidad de Km/h a m/s
		JOptionPane.showMessageDialog(null, "¡HI!" + "\n"
                + "I'll help you find the speed in m/s");
		
		String velocity = JOptionPane.showInputDialog("write speed(Km/h)");
		double velocityDouble = Double.parseDouble(velocity);
		double transformedSpeed = velocityDouble * 1000/3600;
		System.out.print(transformedSpeed);
		JOptionPane.showMessageDialog(null,  " Speed's conversion (Km/h to m/s):" + "\n" 
		                                   + velocity + " Km/h " + "= " + transformedSpeed + " m/s");
		
		
	}

}
