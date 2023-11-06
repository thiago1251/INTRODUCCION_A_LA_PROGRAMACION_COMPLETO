package ejercicioclaseciclos;
import javax.swing.JOptionPane;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String contraseña = null;
		String n = JOptionPane.showInputDialog("Ingrese su contraseña " + contraseña);
		String x = JOptionPane.showInputDialog("Reingrese su contraseña");
		while ( !n.equals(x)) {
			JOptionPane.showMessageDialog(null, "Contraseña incorrecta, porfavor coloque la contraseña nuevamente");
			x = JOptionPane.showInputDialog("Reingrese su contraseña");
		}
		JOptionPane.showMessageDialog(null, " Su contraseña es correcta");
	}
}


