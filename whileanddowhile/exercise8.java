package whileanddowhile;

import javax.swing.JOptionPane;

public class exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Un pozo petrolífero, produce 400 barriles mensuales de petróleo crudo. En la actualidad el precio del petróleo 
		//crudo es de 96 dólares por barril y se espera que aumente a una razón constante de 50 centavos mensuales por 
		//barril. Si el petróleo se vende tan pronto como se extrae del suelo, muestre los siguientes datos: Para los 
		//próximos n años (n debe ser preguntado al usuario), muestre el ingreso mensual, anual , el ingreso total  y el 
		//total de barriles vendidos.  Además debe tener una opción para cambiar la razón constante de  centavos mensuales 
		//por barril.​
		String menu="1. Informe total(mensual y anual)\n2. Cambiar constante de centavos por mes\n3.Salir";
		int opcion=0;
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion)
			{
			case 1:
				String t2 = JOptionPane.showInputDialog(null, "Dijite el tiempo en años");
				double t = Double.parseDouble(t2);
				double ingresoAnual = 6.000414828*t+89.99958717;
				//ingreso mensual
				double conversion = t*12;
				double ingresoMensual = 0.50*conversion+95.50;
				//barriles vendidos
				double barrilesVendidos = 400*t;
				JOptionPane.showMessageDialog(null, "Ingreso anual: "+ ingresoAnual + "dolares\n"
						                          + "Ingreso Mensual: " + ingresoMensual + "dolares\n"
						                          + "Barriles vendidos: " + barrilesVendidos);
			
				break;
			case 2:
				String $c = JOptionPane.showInputDialog(null, "Dijite el cambio para la contante de centavos mensuales");
				double $ = Double.parseDouble($c);
				String t4 = JOptionPane.showInputDialog(null, "Dijite el tiempo en meses");
				double t3 = Double.parseDouble(t4);
				double mesfijo = 96;
				double mesVariable = 96+$;
				double m = mesVariable-mesfijo;
				double b = -m*+96;
				double absoluto = Math.abs(b);
				double funcionmensual = m*t3+absoluto;
				double anual = funcionmensual/12;
				double barriles = 400*t3;
				JOptionPane.showMessageDialog(null, "Ingreso anual: "+ anual + "dolares\n"
                        + "Ingreso Mensual: " + mesVariable + "dolares\n"
                        + "Barriles vendidos: " + barriles);
				
				
				break;
			
			}
		}while(opcion!=3);

		
		
		
	}

}
