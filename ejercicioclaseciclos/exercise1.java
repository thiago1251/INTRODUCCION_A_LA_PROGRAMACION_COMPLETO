package ejercicioclaseciclos;

import javax.swing.JOptionPane;

public class exercise1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu="1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir";
		int opcion=0;
		int suma= 0;
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));

			int resta = 0;
			int producto = 0;
			int cociente = 0;
			switch (opcion)
			{
			case 1:
				double[] n = new double [2];
				for ( int i = 0; i<n.length;i++) {
					n [i] = Double.parseDouble(JOptionPane.showInputDialog(" Ingrese el numero que desea sumar"));
					suma = (int) (n [0] + n [1]);
				}
				JOptionPane.showMessageDialog(null, "Suma es igual a: " + suma);
				break;
			case 2:
				double[] d = new double [2];
				for ( int o = 0; o<=1;o++) {
					 d [o] = Double.parseDouble(JOptionPane.showInputDialog(" Ingrese el numero que desea restar"));
					resta = (int) (d [0] - d [1]);
				}
				JOptionPane.showMessageDialog(null, "Resta es igual a: " + resta);
				break;
			case 3:
				double[] r = new double [2];
				for ( int m = 0; m<=1;m++) {
					 r [m] = Double.parseDouble(JOptionPane.showInputDialog(" Ingrese el numero que desea multiplicar"));
					producto = (int) (r [0] * r [1]);
				}
				
				JOptionPane.showMessageDialog(null, "Producto es igual a: " + producto);
				break;
			case 4:
				double[] l = new double [2];
				for ( int s = 0; s<=1;s++) {
					 l [s] = Double.parseDouble(JOptionPane.showInputDialog(" Ingrese el numero que desea dividir"));
					cociente = (int) (l [0] / l [1]);
				}
				JOptionPane.showMessageDialog(null, "Cociente es igual a: " + cociente);
				break;

			}
		}while(opcion!=5);

		System.exit(0);
	}


}






