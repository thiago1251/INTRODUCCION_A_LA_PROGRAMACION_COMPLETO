package Arreglos;

import java.util.Arrays;

public class codigosensayo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int [] a  = {7,2,4,8,3,9,1,5,10,6};
		    int temporal = 0;

		    for (int i = 0; i < a.length; i++) {
		        for (int j = 1; j < (a.length - i); j++) {
		            if (a[j - 1] > a[j]) {
		                temporal = a[j - 1];
		                a[j - 1] = a[j];
		                a[j] = temporal;
		            }
		        }
		    }
		    System.out.println(Arrays.toString(a));
		    System.out.println("----------------------------------------");
		    String[] cars ={"Volvo","BMW","Ford","Mazda"};for(String i : cars){System.out.println(i);}
		}
	}


