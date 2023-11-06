package taller4;

import javax.swing.JOptionPane;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hacer un programa para hallar mediante un menú el área de: círculo, rectángulo, cuadrado, rombo y triángulo. 
		String inputOption = JOptionPane.showInputDialog("Seleccione una opcion: \n"
                + "1. Circulo\n"
                + "2. Rectangulo\n"
                + "3. Cuadrado\n"
                + "4. Rombo\n"
                + "5. triangulo");
		

		int option = Integer.parseInt(inputOption);
		switch (option) {
		
		case 1: 
		JOptionPane.showMessageDialog(null, "Ha seleccionado buscar el area de un circulo");
		String radio = JOptionPane.showInputDialog("Escribe el radio(cm) del circulo");
		double radioDouble = Double.parseDouble(radio);
		double radiocuadrado = Math.pow(radioDouble, 2);
		double pi= Math.PI;
		double area = pi*radiocuadrado;
		JOptionPane.showMessageDialog(null," el area de circulo es: " + area + " cm");break;
		
		case 2:
			
			
			JOptionPane.showMessageDialog(null, "Ha seleccionado buscar el area de un rectancugulo");
			String L1 = JOptionPane.showInputDialog("Escribe la medida(cm) de la altura");
			String L2 = JOptionPane.showInputDialog("Escribe la medida(cm) de la base");
			double L1Double = Double.parseDouble(L1);
			double L2Double = Double.parseDouble(L2);
			double arearectang = L1Double*L2Double;
			JOptionPane.showMessageDialog(null," el area del rectangulo es: " + arearectang + " cm");break;
			
		case 3:

			JOptionPane.showMessageDialog(null, "Ha seleccionado buscar el area de un  cuadrado");
			String Lx = JOptionPane.showInputDialog("Escribe la medida(cm) de la altura");
			String Ly = JOptionPane.showInputDialog("Escribe la medida(cm) de la base");
			double LxDouble = Double.parseDouble(Lx);
			double LyDouble = Double.parseDouble(Ly);
			double areacuadrado = LxDouble*LyDouble;
			JOptionPane.showMessageDialog(null," el area del cuadrado es: " + areacuadrado + " cm");break;
			
		case 4:
			JOptionPane.showMessageDialog(null, "Ha seleccionado buscar el area de un rombo");
			String DM = JOptionPane.showInputDialog("Escribe la medida(cm) de la diagonal mayor");
			String Dm = JOptionPane.showInputDialog("Escribe la medida(cm) de la diagonal menor");
			double Dmayor = Double.parseDouble(DM);
			double Dmenor = Double.parseDouble(Dm);
			double arearombo = Dmayor*Dmenor/2;
			JOptionPane.showMessageDialog(null," el area del cuadrado es: " + arearombo + " cm");break;
		
		case 5:
			JOptionPane.showMessageDialog(null, "¡HOLA!" + "\n"
                    + "Te ayudare a encontar el area de un triangulo");
			String l = JOptionPane.showInputDialog("Escribe la medida(cm) de la altura");
			String a = JOptionPane.showInputDialog("Escribe la medida(cm) de la base");
			double hDouble = Double.parseDouble(l);
			double bDouble = Double.parseDouble(a);
			double areatriangulo = hDouble*bDouble/2;
			JOptionPane.showMessageDialog(null," el area del triagulo es: " + areatriangulo + " cm");

}
		}
		}


		
		
		
		
		
		
	