package taller4;

import javax.swing.JOptionPane;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// encuesta
		JOptionPane.showMessageDialog(null, "Bienvenido a una encuesta de operaciones basicas, \n"
				                          + "Si tienes una respuesta incorrecta se cerrara el cuestionario\n"
				                          + "¡VAMOS!");
		//pregunta 1
		String inputOption = JOptionPane.showInputDialog("CO2 es dióxido de carbono. ¿Estas deacuerdo?"+ "\n"
				                                        +" 1. SI\n 2. NO");
		
            int option = Integer.parseInt(inputOption);
            switch (option) {
            case 1:
            	JOptionPane.showMessageDialog(null, "Correcto, podemos avanzar");break;
            
            case 2:
            	JOptionPane.showMessageDialog(null, "Incorrecto,  No puedes continuar");
            	System. exit(option);
            	
            }
            
        //pregunta2
            String inputOption2 = JOptionPane.showInputDialog("Los relámpagos se ven antes de escucharse porque la luz viaja más rápido que el sonido. ¿Estas deacuerdo?"+ "\n"
                                  +" 1. SI\n 2. NO");
            int option2 = Integer.parseInt(inputOption2);
        	switch (option2) {
        	case 1:
        	JOptionPane.showMessageDialog(null, "Correcto, podemos avanzar");break;
        
        	case 2:
        	JOptionPane.showMessageDialog(null, "Incorrecto,  No puedes continuar");
        	System. exit(option2);
        	}
        	
        //pregunta3
        	String inputOption3 = JOptionPane.showInputDialog("Google inicialmente se llamaba BackRub. ¿Estas deacuerdo?"+ "\n"
                                   +" 1. SI\n 2. NO");
        	int option3 = Integer.parseInt(inputOption3);
        	switch (option3) {
        	case 1:
        		JOptionPane.showMessageDialog(null, "Correcto, podemos avanzar");break;

        	case 2:
        		JOptionPane.showMessageDialog(null, "Incorrecto, no podemos continuar");
        		System.exit(option3);
        	}
        	//pregunta4
        	String inputOption4 = JOptionPane.showInputDialog("Las jirafas dicen \"mu\". ¿Estas deacuerdo?"+ "\n"
                    +" 1. SI\n 2. NO");
        	int option4 = Integer.parseInt(inputOption4);
        	switch (option4) {
        	case 1:
        		JOptionPane.showMessageDialog(null, "Correcto, podemos avanzar");break;

        	case 2:
        		JOptionPane.showMessageDialog(null, "Incorrecto,  No puedes continuar");
        		System. exit(option4);

        	}
        	//pregunta5
        	String inputOption5 = JOptionPane.showInputDialog("Francia es el segundo país más grande de Europa. ¿Estas deacuerdo?"+ "\n"
                    +" 1. SI\n 2. NO");
        	int option5 = Integer.parseInt(inputOption5);
        	switch (option5) {
        	case 1:
        		JOptionPane.showMessageDialog(null, "Correcto, ¡Estupendo! las respondiste todas sin fallar");
        		System. exit(option5);

        	case 2:
        		
        		JOptionPane.showMessageDialog(null, "Incorrecto,  No puedes continuar");
        		System. exit(option5);

        	}
       

           
	}
}


