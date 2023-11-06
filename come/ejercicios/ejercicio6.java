package come.ejercicios;

import javax.swing.JOptionPane;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hallar el area de un circulo 
		JOptionPane.showMessageDialog(null, "¡HOLA!" + "\n"
		                                  + "Te ayudare a encontar el area de un circulo");

		String radio = JOptionPane.showInputDialog("Escribe el radio(cm) del circulo");
		double radioDouble = Double.parseDouble(radio);
		double radiocuadrado = Math.pow(radioDouble, 2);
		 double pi= Math.PI*radiocuadrado;
	
		double area = pi*radiocuadrado;
		System.out.print(area);
		JOptionPane.showMessageDialog(null," el area de circulo es: " + area + " cm");

		//hallar el area de un triangulo
		JOptionPane.showMessageDialog(null, "¡HOLA!" + "\n"
                                          + "Te ayudare a encontar el area de un triangulo");
		String l = JOptionPane.showInputDialog("Escribe la medida(cm) de la altura");
		String a = JOptionPane.showInputDialog("Escribe la medida(cm) de la base");
		double hDouble = Double.parseDouble(l);
		double bDouble = Double.parseDouble(a);
		double areatriangulo = hDouble*bDouble/2;
		JOptionPane.showMessageDialog(null," el area del triagulo es: " + areatriangulo + " cm");
		
		//hallar el area de un cuadrado
		JOptionPane.showMessageDialog(null, "¡HOLA!" + "\n"
                                          + "Te ayudare a encontar el area de un cuadrado");
		String L1 = JOptionPane.showInputDialog("Escribe la medida(cm) de la altura");
		String L2 = JOptionPane.showInputDialog("Escribe la medida(cm) de la base");
		double L1Double = Double.parseDouble(L1);
		double L2Double = Double.parseDouble(L2);
		double areacuadrado = L1Double*L2Double;
		JOptionPane.showMessageDialog(null," el area del cuadrado es: " + areacuadrado + " cm");
		
	}

}
