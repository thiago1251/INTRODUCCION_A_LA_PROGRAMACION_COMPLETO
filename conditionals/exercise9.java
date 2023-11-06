package conditionals;

import javax.swing.JOptionPane;

public class exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var valorAleatorio = (int)(Math.random()*3+1);
		System.out.print(valorAleatorio);
		if (valorAleatorio==1) {
			String juegopc="Piedra";
			System.out.print(juegopc);
		}
		if (valorAleatorio==2) {
			String juegopc2="Papel";
					System.out.print(juegopc2);
		}
		if (valorAleatorio==3) {
			String juegopc3="Tijera";
			System.out.print(juegopc3);
		}
		
		String opcionUsuario = JOptionPane.showInputDialog(null, "¿Qué eliges?\nPiedra: 1\nPapel: 2\nTijera: 3");
		int opUsuario = Integer.parseInt(opcionUsuario);
		System.out.print(opcionUsuario);
		
		if (valorAleatorio==opUsuario) {
			JOptionPane.showMessageDialog(null, "es Empate"); 
			
		}
		if (valorAleatorio== 2 && opUsuario == 3 ) {
			JOptionPane.showMessageDialog(null, "La jugada de la PC fue: Papel" + "\n"
					                          + "!Ganaste!"); 	
		}
		if (valorAleatorio== 1 && opUsuario == 2 ) {
			JOptionPane.showMessageDialog(null,"La jugada de la PC fue: Piedra" + 
		                                       "\n" + "!Ganaste!"); 	
		}
		if (valorAleatorio== 3 && opUsuario == 1 ) {
			JOptionPane.showMessageDialog(null, "La jugada de la PC fue: Tijera" 
		                                      + "\n" + "¡Ganaste!"); 	
		}
		if (valorAleatorio== 3 && opUsuario == 2 ) {
			JOptionPane.showMessageDialog(null,"La jugada de la PC fue: Tijera" + "\n"
		                                     + "¡Perdiste!"); 	
		}
		if (valorAleatorio== 1 && opUsuario == 3 ) {
			JOptionPane.showMessageDialog(null, "La jugada de la PC fue: Piedra" + "\n" 
		                                      + "¡Perdiste!"); 	
		}
		if (valorAleatorio== 2 && opUsuario == 1 ) {
			JOptionPane.showMessageDialog(null,"La jugada de la PC fue: Papel" + "\n" 
		                                     + "¡Perdiste!"); 	
		}
		
	}
}	

