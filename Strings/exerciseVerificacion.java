package Strings;

import javax.swing.JOptionPane;

public class exerciseVerificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String greeting = "How do you do";
		System.out.println(greeting + "Seven of Nine.");

		System.out.println("--------------------------");

		String name = "Thiago";
		System.out.println("mi nombre es " + name);

		System.out.println("--------------------------");
		// .length devuelve el numero de caracteres
		System.out.println("mi nombre tiene " + name.length()+ " letras");

		System.out.println("--------------------------");

		System.out.println("la primera letra de mi nombre es" + " " + name.charAt(0));
		System.out.println("--------------------------");
		int ultimaLetra = name.length();// int toma 6 com el numero de caracteres
		System.out.println("la ultima letra de mi nombre es" + " " + name.charAt(ultimaLetra-1));
		System.out.println("--------------------------");
		String frase = "hoy es un estupendo dia para aprender a programar en java";
		String fraseResumen = frase.substring(29, 57);
		System.out.println(fraseResumen);

		System.out.println("--------------------------");
		// .equals compara dos cadenas de caracteres  true si son iguales y false sison diferentes
		String alumno1, alumno2;
		alumno1 = "david";
		alumno2 = "david";
		System.out.println(alumno1.equals(alumno2));

		System.out.println("--------------------------");
		String greeting1 = "How do you do";

		System.out.println(greeting1 + "Seven of Nine.");

		System.out.println("--------------------------");

		String test = "abcdefg";

		System.out.println(test.length());

		System.out.println(test.charAt(1));

		System.out.println("--------------------------");

		String test2 = "abcdefg";

		System.out.println(test2.substring(2));

		System.out.println("--------------------------");

		System.out.println("abc\ndef");

		System.out.println("--------------------------");

		System.out.println("abc\\ndef");
		System.out.println("--------------------------");


		String test3 = "Hello John";

		test = test3.toUpperCase();

		System.out.println(test);

		System.out.println("--------------------------");
		//3.
		String entrada = JOptionPane.showInputDialog("escribe una palabra");
		String indice = JOptionPane.showInputDialog("escribe el indice de la letra buscada");
		int indice2 = Integer.parseInt(indice);
		JOptionPane.showMessageDialog(null, entrada.charAt(indice2));
		System.out.println("--------------------------");
		//4.
		String word = "Este es el ejercicio 1";
		String word2 ="Este es el ejercicio 2";
		System.out.println(word.compareTo(word2));
		System.out.println("--------------------------");
		String word1 = "Este es el ejercicio 1";
		String Word2 ="Este es el ejercicio 2";
		System.out.println(word1.compareToIgnoreCase(Word2));

	}

}
