package JOption.comprobations;

import javax.swing.JOptionPane;

public class opstionslist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Object[] possibilities = {"ham", "spam", "yam"};
		String s = (String)JOptionPane.showInputDialog(
		                    null,
		                    "Complete the sentence:\n"
		                    + "\"Green eggs and...\"",
		                    "Customized Dialog",
		                    JOptionPane.PLAIN_MESSAGE,
		                   
		                    null, possibilities,
		                    "ham");

		
		//If a string was returned, say so.
		if ((s != null) && (s.length() > 0)) {
		    setLabel("Green eggs and... " + s + "!");
		    return;
		}

		//If you're here, the return value was null/empty.
		setLabel("Come on, finish the sentence!");
		
		
		
	}

	private static void setLabel(String string) {
		// TODO Auto-generated method stub
		
	}

	
	}

