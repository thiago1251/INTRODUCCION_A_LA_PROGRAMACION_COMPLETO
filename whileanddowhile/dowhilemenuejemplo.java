package whileanddowhile;

import javax.swing.JOptionPane;

public class dowhilemenuejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu="1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir";
		int opcion=0;
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion)
			{
			case 1:
				
				JOptionPane.showMessageDialog(null, "Sumando ...");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Restando ...");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Multiplicando...");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Dividiendo ...");
				break;

			}
		}while(opcion!=5);

		System.exit(0);
	}
		
		
	}


