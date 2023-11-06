package forbucle;

import javax.swing.JOptionPane;

public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma= 0;
		int n, x =0;
		String n1= JOptionPane.showInputDialog(null, "Digite numero inicial: ");
		n = Integer.parseInt(n1);
		String x1= JOptionPane.showInputDialog(null, "Digite numero inicial: ");
		x = Integer.parseInt(x1);
		
		for(int i = n;n<=x; n++) {
			System.out.println(n);
			suma+=n;
	
		}
		System.out.print("La suma es:" + suma);
		
		
	}

	}


