package whileanddowhile;

import javax.swing.JOptionPane;

public class ejemplowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 1;
		String inputNumero = JOptionPane.showInputDialog("Ingrese un número");
		int numero = Integer.parseInt(inputNumero);

		while (contador <= numero) {
		  System.out.print(contador + ", ");
		  contador++;
		}
		
		System.exit(0);
	}
	}


