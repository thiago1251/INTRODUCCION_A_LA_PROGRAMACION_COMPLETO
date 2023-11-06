package JOption.comprobations;

import javax.swing.JOptionPane;

public class cuadrodediálogomodalconlosbotones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Muestra un cuadro de diálogo modal con los botones, iconos, mensaje, título, etc. 
		//especificados. Con este método, puede cambiar el texto que aparece en los botones de los 
		//cuadros de diálogo estándar. También puede realizar muchos otros tipos de personalización.
	
		//Custom button text
		Object[] options = {"Yes, please",
		                    "No, thanks",
		                    "No eggs, no ham!"};
		int n = JOptionPane.showOptionDialog(null,
		    "Would you like some green eggs to go "
		    + "with that ham?",
		    "A Silly Question",
		    JOptionPane.YES_NO_CANCEL_OPTION,
		    JOptionPane.QUESTION_MESSAGE,
		    null,
		    options,
		    options[2]);
	
	
	
	}

}
