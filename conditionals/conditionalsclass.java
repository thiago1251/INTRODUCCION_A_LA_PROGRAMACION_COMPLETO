package conditionals;

import javax.swing.JOptionPane;

public class conditionalsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//If sencillo
		int x = 3;
		int y = 6;
		
		// preguntar si x es igual a 3
		if(x==3) {
			JOptionPane.showMessageDialog(null, "x es igual a 3");
			if(y==6) {
				JOptionPane.showMessageDialog(null,"y es igual a 6" );
				JOptionPane.showMessageDialog(null, "x es igual a 3");
				
			} else {
				JOptionPane.showMessageDialog(null, "x no es igual a 3");
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}
