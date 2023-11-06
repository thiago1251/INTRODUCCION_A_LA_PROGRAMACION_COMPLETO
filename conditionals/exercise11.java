package conditionals;

import javax.swing.JOptionPane;

public class exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Vamos a imprimir tu recibo de pago ¡LISTO!");
		String X = JOptionPane.showInputDialog("Ingresa el ultimo semestre cursado");
		String Y = JOptionPane.showInputDialog("Ingresa tu promedio");
		String A = JOptionPane.showInputDialog("Ingresa tu carrera:" +
				                               "\nActuacion: 1\nArquitectura: 2\nVeterinaria: 3\nDiseño: 4");
		//conversiones
		int semestre = Integer.parseInt(X);
		double promedio = Double.parseDouble(Y);
		int carrera = Integer.parseInt(A);
		
		//condiciones para imprimir el recibo
		if (carrera == 1 &&semestre>6 && promedio>=3.9) {
			JOptionPane.showMessageDialog(null, "Tu recibo ha sido impreso");
		}
		else if (carrera == 2 &&semestre>=6 && promedio>4.0) {
			JOptionPane.showMessageDialog(null, "Tu recibo ha sido impreso");	
		}
		else if (carrera == 3 &&semestre>5 && promedio>=3.7) {
			JOptionPane.showMessageDialog(null, "Tu recibo ha sido impreso");	
		}
		else if (carrera == 4 &&semestre>=3 && promedio>=3.5) {
			JOptionPane.showMessageDialog(null, "Tu recibo ha sido impreso");	
		}
		else {
			JOptionPane.showMessageDialog(null, "No cumples con los requisitos\nTu recibo no ha sido impreso");	
		}
	}

}
