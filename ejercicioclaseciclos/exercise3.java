package ejercicioclaseciclos;

import javax.swing.JOptionPane;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val = JOptionPane.showInputDialog("Ingrese el minimo");
		int x = Integer.parseInt(val);
		String ma = JOptionPane.showInputDialog("Ingrese el maximo");
		int max = Integer.parseInt(ma);

		for (int i = x ; i<= max; i++) {

			if(i%2==1) {
				continue;
			}

			if(i%2==0) {
				System.out.print(i);
				System.out.print(" "); 			
			}
		}


	}

}
