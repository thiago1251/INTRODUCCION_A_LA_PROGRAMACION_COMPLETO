package taller4;

import javax.swing.JOptionPane;

public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String opcionUsuario = JOptionPane.showInputDialog(null, "¿Qué eliges?\nLanzar los dados: 1\nVer puntaje: 2\nBorrar puntaje: 3");
		int opUsuario = Integer.parseInt(opcionUsuario);
		var dado1 = (int)(Math.random()*6+1);
		var dado2 = (int)(Math.random()*6+1);
		System.out.print(dado1);
		System.out.print(dado2);
		int suma = dado1 + dado2;
		int residuo = suma%2;
		
		switch (opUsuario) {
		
		case 1:
			if (dado1 == dado2) {
				int puntajeplayer = 2;}
			if  (dado1 != dado2 && dado1+dado2==residuo && residuo>5 && residuo==0) {
				int puntajeplayer2 = 1;
				
			}
			
		case 2:
			
		}
		
	}

}
