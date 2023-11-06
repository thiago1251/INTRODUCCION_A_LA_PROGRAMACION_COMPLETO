package tallerCiclos;

import javax.swing.JOptionPane;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// el bucle while, siempre se va cumplir si la condicion lo permite, 
		//si la condicion no es cierta no se va ejecutar
		int contador = 1;
		String inputNumero = JOptionPane.showInputDialog("Ingrese un número");
		int numero = Integer.parseInt(inputNumero);

		while (contador <= numero) {
		  System.out.print(contador + ", ");
		  contador++;
		}
		
		System.exit(0);
		// si ingresas un numero positivo mayor que el contador siempre se va ejecutar el programa
		// si ingresas uno menor que el iterador no se va ejecutar nunca.
		
		
		// el bucle do while, siempre va ejecutarse al menos una vez, 
				//si la condicion no es cierta se va cumolir minimo una vez
		
		int i = 1;
		String inputNumero1 = JOptionPane.showInputDialog("Ingrese un número");
		int number = Integer.parseInt(inputNumero1);
		
		do {
			System.out.print(i + ", ");
			i++;

		} while (i <= number);
		
		System.exit(0);
		// si ingresas un numero positivo mayor que el contador = i, siempre se va ejecutar el programa
				// si ingresas uno menor que el iterador se va ejecutar almenos una vez.*/
				
		
		
		
		
		
	}

}
