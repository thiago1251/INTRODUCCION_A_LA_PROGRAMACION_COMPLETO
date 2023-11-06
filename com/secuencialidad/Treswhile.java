package com.secuencialidad;


public class Treswhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 15;
		
		do {
            if(num%3 == 0 ){
                System.out.println(num);
            }
            num++;
        }while (num<=30 && num>=15);
	}

}
