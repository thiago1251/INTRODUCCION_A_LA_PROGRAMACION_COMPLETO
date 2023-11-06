package tallerCiclos;

import javax.swing.JOptionPane;

public class exerciseAb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x1 = JOptionPane.showInputDialog("Ingrese un valor");
		int x = Integer.parseInt(x1);

		for (int i = 0; i <= x*2; i++) {
			for ( int s = 0; s <= i; s++) {
				if(i%2==0) {
					System.out.print(i);
					s++;
				}

			}
			if(i%2==0) {
				System.out.println(""); 	
			}


		}

	}}