package PARCIAL2;

import javax.swing.JOptionPane;

public class punto6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 3;
		int j = 0;
		int i;
		int contadorMaiz = 0;
		int contadorYuca = 0;
		int contadorPapa = 0;
		int acumuladorMaiz = 0;
		int acumuladorYuca = 0;
		int acumuladorPapa = 0;

		int[][] numeros = new int[5][4];

		for( i = 0; i<numeros.length;i++) {
			for ( j = 0; j <numeros[i].length;j++) {
				numeros[i][j]= (int) (Math.floor(Math.random() * (max - min + 1) ) + min);

			}
		}
		for ( i=0; i<numeros.length;i++) {
			for ( j=0; j<numeros[i].length;j++) {
				System.out.print(numeros[i][j]+" ");

			}
			System.out.println();
		}
		String menu="1. ver y cuales son las parcelas sembradas con maiz\n2.ver y cales son las parcelas sembradas con papa \n"
				+ "3. ver y cales son las parcelas sembradas con yuca\n4. Volver a sembrar una parcela\n5. Cosechar una parcela\n6. Salir";
		int opcion=0;
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcion)
			{
			case 1:
				for( i = 0; i<numeros.length;i++) {
					for ( j = 0; j <numeros[i].length;j++) {

					}
				}
				for ( i=0; i<numeros.length;i++) {
					for ( j=0; j<numeros[i].length;j++) {
						if(numeros[i][j]==1 ) {
							contadorMaiz++;
						}

					}

				}
				JOptionPane.showMessageDialog(null,"hay " + contadorMaiz + " parcelas sembradas de maiz");break;
			case 2:
				for( i = 0; i<numeros.length;i++) {
					for ( j = 0; j <numeros[i].length;j++) {

					}
				}
				for ( i=0; i<numeros.length;i++) {
					for ( j=0; j<numeros[i].length;j++) {
						if(numeros[i][j]==2 ) {
							contadorPapa++;
						}

					}

				}
				JOptionPane.showMessageDialog(null, "hay" + contadorPapa+ " parcelas sembradas de papa");break;

			case 3:

				for( i = 0; i<numeros.length;i++) {
					for ( j = 0; j <numeros[i].length;j++) {

					}
				}
				for ( i=0; i<numeros.length;i++) {
					for ( j=0; j<numeros[i].length;j++) {
						if(numeros[i][j]==2 ) {
							contadorYuca++;
						}

					}

				}
				JOptionPane.showMessageDialog(null,"hay" + contadorYuca+ " parcelas sembradas de yuca");break;

			case 4:
				
				System.out.print("__________________________________________________");
				for( i = 0; i<numeros.length;i++) {
					for ( j = 0; j <numeros[i].length;j++) {
						numeros[i][j]= (int) (Math.floor(Math.random() * (max - min + 1) ) + min);

					}
				}
				for ( i=0; i<numeros.length;i++) {
					for ( j=0; j<numeros[i].length;j++) {
						System.out.print(numeros[i][j]+" ");

					}
					System.out.println();
				}
				
			case 5:
				for( i = 0; i<numeros.length;i++) {
					for ( j = 0; j <numeros[i].length;j++) {

					}
				}
				for ( i=0; i<numeros.length;i++) {
					for ( j=0; j<numeros[i].length;j++) {
						if(numeros[i][j]==1 ) {
							acumuladorMaiz+=acumuladorMaiz ;	
						}
						else if(numeros[i][j]==2 ) {
							acumuladorPapa+=acumuladorPapa ;	
						}
						else if (numeros[i][j]==3 ) {
							acumuladorYuca+=acumuladorYuca ;	}
					}

				}
				JOptionPane.showMessageDialog(null,"la cocecha es : " + acumuladorMaiz + " Maiz"+ acumuladorPapa + "  papas" + acumuladorYuca + " yucas");break;
				
			}
		
				
		}while(opcion!=6);

		System.exit(0);
	}}
