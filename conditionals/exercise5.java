package conditionals;

import javax.swing.JOptionPane;

public class exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      JOptionPane.showMessageDialog(null, "Calcula el gasto de agua de tu hogar");
		
		String x = JOptionPane.showInputDialog("Dijite el numero de litros usados: ");
		double xduo = Double.parseDouble(x);
		double cuotafija = 60.00;
		double opcion2 = 30.00;
		double opcion3 = 50.00;
		
		double xmore1 = xduo-50;
		double pago = opcion2*xmore1;
		double pago2 = cuotafija+pago;
		
		if (xduo<=50) {
			JOptionPane.showMessageDialog(null,"litros usados: " + xduo + "\n" + 
											   "Tu consumo no tiene ningun costo adicional" + "\n"
											 + "Total a Pagar: $" + cuotafija);
		}
		if  (xduo > 50 && xduo <=200){
		
			
			JOptionPane.showMessageDialog(null,"litros usados: " + xduo + "\n" + 
		                                       "Tu consumo tiene un costo adicional de : $" + pago + "\n"
					                          +"Total a Pagar: $" + pago2);
		}
		if (xduo > 200) {
			double xmore = xduo-200;
			double pagoo = (opcion3*xmore+pago2)-90;
			double pago3 = pagoo+cuotafija;
			JOptionPane.showMessageDialog(null,"litros usados: " + xduo + "\n" + 
                    "Tu consumo tiene un costo adicional de : $" + pagoo + "\n"
                   +"Total a Pagar: $" + pago3);
		}

		
	}

}
