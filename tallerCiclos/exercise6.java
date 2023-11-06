package tallerCiclos;

import javax.swing.JOptionPane;

public class exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String x1 = JOptionPane.showInputDialog("Ingrese un valor");
		int x = Integer.parseInt(x1);
		
			for (int i = x; i >= 1; i--) {
				for ( int s= 1; s <=i;s++) {
					 System.out.print(i);
				}
				System.out.println(""); 
	        }
			
			
		}
		
		
		
		

	}
