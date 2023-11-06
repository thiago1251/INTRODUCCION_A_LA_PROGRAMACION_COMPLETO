package com.secuencialidad;

public class Whileonce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
        int number = 1;
        int num = 1;
        int lim = 4;
        
        for (int i = 0; i < lim; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print(number + counter);
                counter++;
            }
            counter = 0;
            System.out.println();
        }
        
        num = 4;
        if (num == lim) {
            for (int i = 0; i < lim; i++) {
                for (int j = 4; j > (i + 1); j--) {
                    System.out.print(number + counter);
                    counter++;
                }
                counter = 0;
                System.out.println();
            }
            
        }
}
}
