package Arreglos;

import javax.swing.JOptionPane;

public class exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int acumulador = 0;

		String[ ] dulceria= {"Bombones", "Chocolatinas", "Paletas","Chicles","Caramelos", "Gomitas", "Helados","Obleas"};   

		int[ ] precios = {400,600,1000,300,1500,2000,2500 };
		String menu= "1. Productos y sus precios\n2. Vender un producto\n3. Total de ingresos \n4.Cambiar precio del producto ";
		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

		switch (opcion)
		{
		case 1:
			for(int i =0; i<=dulceria.length;i++) {
				for(int p = 0; p<= precios.length;p++) {
					JOptionPane.showMessageDialog(null, dulceria [i] + " a un precio de $ " +precios[p]);i++;

				}
			}
		case 2: 
			
			String venta= " ¿Que deseas vender?\n1.Bombones \n2.chocolatinas\n3.Paletas \n4.Chicles \n5.Caramelos\n6.Gomitas\n7.Helados\n8.Obleas";
			int compra = Integer.parseInt(JOptionPane.showInputDialog(venta));
			
			if (compra==1) {
				acumulador = + precios [0];
				JOptionPane.showMessageDialog(null, "Vendido (bombon)");
			}
			if (compra==2) {
				acumulador = + precios [1];
				JOptionPane.showMessageDialog(null, "vendido (chocolatina)");
			}
			if (compra==3) {
				acumulador = + precios [2];
				JOptionPane.showMessageDialog(null, "vendido (Paleta)");
			}
			if (compra==4) {
				acumulador = + precios [3];
				JOptionPane.showMessageDialog(null, "vendido (Chicles)");
			}
			if (compra==5) {
				acumulador = + precios [4];
				JOptionPane.showMessageDialog(null, "vendido (Caramelo)");
			}
			if (compra==6) {
				acumulador = + precios [5];
				JOptionPane.showMessageDialog(null, "vendido (Gomitas)");
			}
			if (compra==7) {
				acumulador = + precios [6];
				JOptionPane.showMessageDialog(null, "vendido (Helados)");
			}
			if (compra==8) {
				acumulador = + precios [7];
				JOptionPane.showMessageDialog(null, "vendido (Obleas)");
			}
		case 3:
			JOptionPane.showMessageDialog(null, "los ingresos son: " + acumulador);	
			
		case 4:
			String menu2= " ¿Que precio de los productos deseas cambiar?\n 1. Bombones\n2. Chocolatinas\n3. Paletas \n4. Chicles\n5. Caramelos\n6. Gomitas\n7. Gomitas\n8. Obleas";
			int menu4 = Integer.parseInt(JOptionPane.showInputDialog(menu2));
			switch (menu4) {
			case 1:
				precios[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo precio"));
				JOptionPane.showMessageDialog(null, "El nuevo precio es: " + precios [0]);break;
			case 2:
				precios[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo precio"));
				JOptionPane.showMessageDialog(null, "El nuevo precio es: " + precios [1]);break;
			case 3:
				precios[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo precio"));
				JOptionPane.showMessageDialog(null, "El nuevo precio es: " + precios [2]);break;	
			case 4:
				precios[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo precio"));
				JOptionPane.showMessageDialog(null, "El nuevo precio es: " + precios [3]);break;	
			case 5:
				precios[4] = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo precio"));
				JOptionPane.showMessageDialog(null, "El nuevo precio es: " + precios [4]);break;	
			case 6:
				precios[5] = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo precio"));
				JOptionPane.showMessageDialog(null, "El nuevo precio es: " + precios [5]);break;	
			case 7:
				precios[6] = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo precio"));
				JOptionPane.showMessageDialog(null, "El nuevo precio es: " + precios [6]);break;
			case 8:
				precios[7] = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo precio"));
				JOptionPane.showMessageDialog(null, "El nuevo precio es: " + precios [7]);
					
			}
			
			
		}	
	}

}
