
package JOption.comprobations;

import javax.swing.JOptionPane;

public class cuadrodediálogmodalconunbotón {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Muestra un cuadro de diálogo modal con un botón, que está etiquetado como "OK" (o el
		//equivalente localizado). Puede especificar fácilmente el mensaje, el icono y el 
		//título que muestra el cuadro de diálogo
	
		//default title and icon
		JOptionPane.showMessageDialog(null,
		    "Eggs are not supposed to be green.");
	
		//custom title, warning icon
		JOptionPane.showMessageDialog(null,
		    "Eggs are not supposed to be green.",
		    "Inane warning",
		    JOptionPane.WARNING_MESSAGE);
		
		//custom title, error icon
		JOptionPane.showMessageDialog(null,
		    "Eggs are not supposed to be green.",
		    "Inane error",
		    JOptionPane.ERROR_MESSAGE);
	
		//custom title, no icon
		JOptionPane.showMessageDialog(null,
		    "Eggs are not supposed to be green.",
		    "A plain message",
		    JOptionPane.PLAIN_MESSAGE);	
		
		//custom title, custom icon
		JOptionPane.showMessageDialog(null,
		    "Eggs are not supposed to be green.",
		    "Inane custom dialog",
		    JOptionPane.INFORMATION_MESSAGE);
		
	}

}
