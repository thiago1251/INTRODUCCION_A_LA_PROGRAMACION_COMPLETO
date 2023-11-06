package conditionals;

import javax.swing.JOptionPane;

public class exercise12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dados
		var dado1 = (int)(Math.random()*6+1);
		System.out.print(dado1);
		var dado2 = (int)(Math.random()*6+1);
		System.out.print(dado2);
		var dado3 = (int)(Math.random()*6+1);
		System.out.print(dado3);
		
		//mostrar puntaje si
		if (dado1 == 6 && dado2 == 6 && dado3 == 6) {
			JOptionPane.showMessageDialog(null, "EXCELENTE");
		}
		if(dado1 == 6 && dado2 == 6 && dado3 != 6) {
			JOptionPane.showMessageDialog(null, "MUY BIEN");
		}
		if (dado1 == 6 && dado2 != 6 && dado3 == 6) {
			JOptionPane.showMessageDialog(null, "MUY BIEN");
		}
		if (dado1 != 6 && dado2 == 6 && dado3 == 6) {
			JOptionPane.showMessageDialog(null, "MUY BIEN");
		}
		if (dado1 != 6 && dado2 != 6 && dado3 == 6) {
			JOptionPane.showMessageDialog(null, "REGULAR");
		}
		if (dado1 != 6 && dado2 == 6 && dado3 != 6) {
			JOptionPane.showMessageDialog(null, "REGULAR");
		}
		if (dado1 == 6 && dado2 != 6 && dado3 != 6) {
			JOptionPane.showMessageDialog(null, "REGULAR");
		}
		if (dado1 != 6 && dado2 != 6 && dado3 != 6) {
			JOptionPane.showMessageDialog(null, "PESIMO");
		}
		
	}

}
