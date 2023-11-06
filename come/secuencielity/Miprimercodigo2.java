package come.secuencielity;

public class Miprimercodigo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// pido nombre y edad
		String name = "thiago";
		int edad = 18;
		
		//Aqui estoy imprimiendo un nombre
		System.out.println(name);
		
		//Aqui estoy imprimiendo la edad
		System.out.println("tu edad es: " + edad);
		
		System.out.print("Hola " + name + "tu edad es "   + edad + "\n" );
		
		//Aqui estoy imprimiendo mucho gusto
	    System.out.println("mucho gusto ");
	    
	    //suma de dos numeros 
	    int a = 34;
	    int b = 12;
	    		
	    		//inicializar variable resultado en 0
	    		int resultado = 0;
	            resultado = a + b;
	            
	            System.out.print("la suma de dos numeros es " + resultado);
	       
		
		//convertir de String a Int
		String cadena = "123";
				int cadenaentera = Integer.parseInt(cadena);
				int operacion = cadenaentera + 1;
				
		        System.out.println("el estero es: " + operacion);
	
		        //convertir de String a double
		        cadena = "12.3";
		        double cadenaDouble = Double.parseDouble(cadena);
		        System.out.println("el decimal es: " + cadenaDouble);
		        
		        //convertir de String a float
		        cadena = "1.2";
		        float cadenaFloat = Float.parseFloat(cadena);
		        System.out.println("el flotante es: " + cadenaFloat);
		        
		        
		       //definir constante
		        final double pi = 3.1416;
		        System.out.print(pi);
		        
		        
	}

	
	
}
