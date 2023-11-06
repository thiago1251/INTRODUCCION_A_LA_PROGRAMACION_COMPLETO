package matrices;

import javax.swing.JOptionPane;

public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 40;
		int[] numeros = new int[20];

		String x = JOptionPane.showInputDialog(null, "Ingrese un numero");
		int y = Integer.parseInt(x);
		


		for(int i = 0; i<numeros.length;i++) {
			numeros[i] = (int) (Math.floor(Math.random() * (max - min + 1) ) + min);
			System.out.print(numeros[i]+ " ");
		}
		System.out.print("____________");
		for(int i = 0; i<numeros.length;i++) {
			if( i == y) {
				System.out.print(numeros[i]);
				JOptionPane.showMessageDialog(null, "si existe");

				JOptionPane.showMessageDialog(null, "no existe");
			}
			else {
				JOptionPane.showMessageDialog(null, "no existe");break;
		}
		


		}



	}

}
