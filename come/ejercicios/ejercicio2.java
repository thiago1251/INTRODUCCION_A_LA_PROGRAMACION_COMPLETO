package come.ejercicios;

import javax.swing.JOptionPane;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pedir el precio de un producto mas el IVA
		
		String precio = JOptionPane.showInputDialog(" ¡HI!" + "\n"
				                                   + " Please, write the price of the product");
        double precioDouble = Double.parseDouble(precio);
        final double iva = 0.21;
        double precioA = iva*precioDouble;
  
        double precioF = precioDouble+precioA;
        
        
        System.out.print(precioF);
        JOptionPane.showMessageDialog(null, "The price including IVA is: $"+ precioF + "\n"
        		                          + "Price: $ " + precio + "\n"
        		                          + "IVA: $ "+ precioA);
        
	}

}
