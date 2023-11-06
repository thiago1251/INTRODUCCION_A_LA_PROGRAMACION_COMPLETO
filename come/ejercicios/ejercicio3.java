package come.ejercicios;

import javax.swing.JOptionPane;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Hallar el indice de masa coroporal (IMC)
		
		String masa =  JOptionPane.showInputDialog(" ¡HI!" + "\n"
		        + " Let's calculate your Body Mass Index (BMI)" +"\n"
                + " Please, write your weight in Kg" + "\n");
		double masaDouble = Double.parseDouble(masa);
		String altura = JOptionPane.showInputDialog("let's continue with your height in m");
		double alturaDouble = Double.parseDouble(altura);
		double elevado = Math.pow(alturaDouble, 2);
		double IMC = masaDouble/elevado;
		System.out.print(IMC);
	    JOptionPane.showMessageDialog(null,"Your Body Mass Index (BMI) is:" + IMC);
	
	    
	}

}
