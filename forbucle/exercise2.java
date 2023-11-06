package forbucle;

import javax.swing.JOptionPane;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma= 0;
		for(int i = 0;i<=100; i+=2) {
			System.out.println(i);
			suma+=i;
	
		}
		JOptionPane.showMessageDialog(null, "La suma de los numeros pares del 1 al 100 es: " + suma);
		
		
		
	}

}
