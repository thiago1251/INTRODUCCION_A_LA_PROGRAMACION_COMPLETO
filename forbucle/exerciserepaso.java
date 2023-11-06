package forbucle;

import javax.swing.JOptionPane;

public class exerciserepaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma1 = 0,suma2=0,suma3=0;
		int j1=0,j2=0,j3=0;
		
		for(int i=1;i<=5;i++) {
			JOptionPane.showMessageDialog(null, "Estas en el turno " + i);
       
		String Juno = JOptionPane.showInputDialog(null, "ingrese su primer puntaje");
		j1 = Integer.parseInt(Juno);
		suma1 = suma1+j1;
		String Jdos = JOptionPane.showInputDialog(null, "ingrese su segundo puntaje");
		 j2 = Integer.parseInt(Jdos);
		suma2 = suma1+j2;
		String Jtres = JOptionPane.showInputDialog(null, "ingrese su tercer puntaje");
		 j3 = Integer.parseInt(Jtres);
		suma3 = suma3+j3;
		}
		System.out.print("Tu puntaje es: " + suma1);
		System.out.print("Tu puntaje es: " + suma2);
		System.out.print("Tu puntaje es: " + suma3);
		JOptionPane.showMessageDialog(null, "Fin del turno");
	     
		
		if(j1>j2 && j1>j3) {
        
        JOptionPane.showMessageDialog(null,"El jugador ganador es el 1:" );
	}
		if(j2>j1 && j2>j3) {
	        
	        JOptionPane.showMessageDialog(null,"El jugador ganador es el 2:" );
		}	
		if(j3>j2 && j3>j1) {
	        
	        JOptionPane.showMessageDialog(null,"El jugador ganador es el 1:" );
		}
		
}}


