package forbucle;

public class clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =5; i>0; i--) {
			System.out.println(i);
		}
		System.out.print("FELIZ AÑO");
		
		//a contar 1 al 4
		for (int n = 1; n <= 4; n++) {
			System.out.println(n);}
		
		//b tres no funciona porque no se cumple la condicion
		
		int n;
		for (n = 1; n > 4; n++) {
			System.out.println(n);}
		//c cuenta de 4 a 1
		for (int j = 4; j > 0; j--) {
			System.out.println(j);}
		
		//d cuenta de 4 a 1, no servia
		for (int x = 4; x > 0; x--) {
		System.out.println(x);}
		//e cuenta desde 0 hasta 2.5
		for (double test = 0; test < 3; test = test +0.5) {
			System.out.println(test);}
		//f cuenta sin llegar hasta de formasecuencial
		for (int count = 0; count <= 3; count++)// cuenta de 0a 3
			for (int count2 = 0; count2 < count; count2++) {
				System.out.println(count2);}
		//g muesta los numeros pares del 2 al 10
		for(int i = 0;i<=10; i+=2) {
			System.out.println(i);
	
		}
			
		
		
		
		
//primer imprimir feliz año, y luego contar del 1 al 5
		
		System.out.println("FELIZ AÑO");
		for(int i =1; i<=5; i++) {
			System.out.println(i);
		}
		
		// dos enteros o mas 
		for(int k = 1, l = 1; k<=5; k++, l++) {
			System.out.print("k es: " + k);
			System.out.print("l es: " + l);
		}
		

	}

}
