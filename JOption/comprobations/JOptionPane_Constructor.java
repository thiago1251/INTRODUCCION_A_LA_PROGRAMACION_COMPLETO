package JOption.comprobations;

import javax.swing.JOptionPane;

public class JOptionPane_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		//default icon, custom title
		int n = JOptionPane.showConfirmDialog(null,
		    "Would you like green eggs and ham?",
		    "An Inane Question",
		    JOptionPane.YES_NO_OPTION);
		
		
		//Personalización del texto del botón
		Object[] options = {"Yes, please",
        "No way!"};
        int n1 = JOptionPane.showOptionDialog(null,
        "Would you like green eggs and ham?",
        "A Silly Question",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,     //do not use a custom Icon
        options,  //the titles of buttons
        options[0]); //default button title
	}

}
