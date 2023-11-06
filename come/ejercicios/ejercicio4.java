package come.ejercicios;

import javax.swing.JOptionPane;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  //declarar dos variables tipo int y sus operaciones
		String X = JOptionPane.showInputDialog("Escribe un numero entero X =");
		int Xint = Integer.parseInt(X);
		
		String Y = JOptionPane.showInputDialog("Escribe otro numero entero Y =");
		int Yint = Integer.parseInt(Y);
		
		// conversiones para las operaciones entre enteros y decimales
		double Xdouble = Double.parseDouble(X);
		double Ydouble = Double.parseDouble(Y);
		
		//operaciones
		int suma = Xint+Yint;
		int resta = Xint-Yint;
		int producto = Xint*Yint;
	    double cociente = Xdouble/Ydouble;
	    int residuo = Xint%Yint;
		
		
		//declarar dos variables tipo double y sus operaciones
		String N = JOptionPane.showInputDialog("Escribe un numero decimal N =");
		double Ndouble = Double.parseDouble(N);
		String M = JOptionPane.showInputDialog("Escribe otro numero decimal M =");
		double Mdouble = Double.parseDouble(M);
		
		//operaciones
		double sumaDouble = Ndouble+Mdouble;
		double diferenciaDouble = Ndouble-Mdouble;
		double productoDouble = Ndouble*Mdouble;
		double cocienteDouble = Ndouble/Mdouble;
		double residuoDouble = Ndouble%Mdouble;
		
	
		
		//operaciones entre enteros y decimales
		double sumaXN = Xdouble+Ndouble;
		double cocienteYM= Ydouble/Mdouble;
		double residuoYM = Ydouble%Mdouble;
		
		//el doble de cada variable 
		double dobleX = 2*Xdouble;
		double dobleY = 2*Ydouble;
		double dobleN = 2*Ndouble;
		double dobleM = 2*Mdouble;
		
		//la suma de todas las variables
		double allSuma = Xdouble+Ydouble+Ndouble+Mdouble;
		
		//el producto de todas las variables 
		double allProducto = Xdouble*Ydouble*Ndouble*Mdouble;	
		
		//imprimir y mostrar message en pantalla
		 
		System.out.print("X = " + X +  "; "  + "Y = " + Y + "\n" 
				 + "N = " + N + "; " + "M = " + M +  "\n"
				 + ".La suma de X e Y es = " + suma + "\n" 
		         + ".La diferencia de X e Y es = " + resta + "\n"
				 + ".El producto de X e Y es = " + producto + "\n"
				 + ".El cociente de X entre Y es = " + cociente + "\n"
				 + ".El residuo de X e Y es = " + residuo + "\n"
				 + "\n"
				 + ".La suma de N y M es = " + sumaDouble + "\n"
				 + ".La diferencia de N y M es = " + diferenciaDouble + "\n"
				 + ".El producto de N y M es = " + productoDouble + "\n"
				 + ".El cociente de N entre M es = " + cocienteDouble + "\n"
				 + ".El residuo de N y M es = " + residuoDouble + "\n"
				 + "\n"
				 + ". La suma de X y N = " + sumaXN + "\n"
				 + ".El cociente entre Y y M= " + cocienteYM + "\n"
				 + ".El residuo entre Y y M = " + residuoYM + "\n"
				 + "\n"
				 + ".El doble de X = " + dobleX + "\n"
				 + ".El doble de Y = " + dobleY + "\n"
				 + ".El doble de N = " + dobleN + "\n"
				 + ".El doble de M = " + dobleM + "\n"
				 + "\n"
				 + ".La suma de todas las variables es = " + allSuma + "\n"
				 + "\n"
				 + ".El producto de todas las variables es = " + allProducto);
		
		JOptionPane.showMessageDialog(null, "X = " + X +  "; "  + "Y = " + Y + "\n" 
				 + "N = " + N + "; " + "M = " + M +  "\n"
				 + ".La suma de X e Y es = " + suma + "\n" 
		         + ".La diferencia de X e Y es = " + resta + "\n"
				 + ".El producto de X e Y es = " + producto + "\n"
				 + ".El cociente de X entre Y es = " + cociente + "\n"
				 + ".El residuo de X e Y es = " + residuo + "\n"
				 + "\n"
				 + ".La suma de N y M es = " + sumaDouble + "\n"
				 + ".La diferencia de N y M es = " + diferenciaDouble + "\n"
				 + ".El producto de N y M es = " + productoDouble + "\n"
				 + ".El cociente de N entre M es = " + cocienteDouble + "\n"
				 + ".El residuo de N y M es = " + residuoDouble + "\n"
				 + "\n"
				 + ". La suma de X y N = " + sumaXN + "\n"
				 + ".El residuo entre Y y M = " + residuoYM + "\n"
				 + "\n"
				 + ".El doble de X = " + dobleX + "\n"
				 + ".El doble de Y = " + dobleY + "\n"
				 + ".El doble de N = " + dobleN + "\n"
				 + ".El doble de M = " + dobleM + "\n"
				 + "\n"
				 + ".La suma de todas las variables es = " + allSuma + "\n"
				 + "\n"
				 + ".El producto de todas las variables es = " + allProducto);
		
	
		
	}

}
