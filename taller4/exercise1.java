package taller4;

import javax.swing.JOptionPane;

public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//suma resta multiplicacion y division
		String inputOption = JOptionPane.showInputDialog("Seleccione una opcion: \n"
                + "1. Suma\n"
                + "2. Resta\n"
                + "3. Multiplicacion\n"
                + "4. Division");

int option = Integer.parseInt(inputOption);

switch (option) {
case 1: 
JOptionPane.showMessageDialog(null, "Ha seleccionado suma");
String x = JOptionPane.showInputDialog("Dijite primer termino");
String y = JOptionPane.showInputDialog("Dijite segundo termino");
double x1 = Double.parseDouble(x);
double y1 = Double.parseDouble(y);
double suma = x1+y1;
JOptionPane.showMessageDialog(null, "La suma es igual a: " + suma);break;

case 2: 
JOptionPane.showMessageDialog(null, "Ha seleccionado resta");
String a = JOptionPane.showInputDialog("Dijite primer termino");
String b = JOptionPane.showInputDialog("Dijite segundo termino");
double a1 = Double.parseDouble(a);
double b1 = Double.parseDouble(b);
double resta = a1-b1;
JOptionPane.showMessageDialog(null, "La resta es igual a: " + resta);break;

case 3: 
JOptionPane.showMessageDialog(null, "Ha seleccionado multiplicacion");
String c = JOptionPane.showInputDialog("Dijite primer termino");
String d = JOptionPane.showInputDialog("Dijite segundo termino");
double c1 = Double.parseDouble(c);
double d1 = Double.parseDouble(d);
double producto = c1*d1;
JOptionPane.showMessageDialog(null, "La multiplicacion es igual a: " + producto);break;

case 4:
	JOptionPane.showMessageDialog(null, "Ha seleccionado multiplicacion");
	String e = JOptionPane.showInputDialog("Dijite primer termino");
	String f = JOptionPane.showInputDialog("Dijite segundo termino");
	double e1 = Double.parseDouble(e);
	double f1 = Double.parseDouble(f);
	double cociente = e1/f1;
	JOptionPane.showMessageDialog(null, "La multiplicacion es igual a: " + cociente);break;

}


}




	}


