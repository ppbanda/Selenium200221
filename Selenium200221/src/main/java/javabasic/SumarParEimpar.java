package javabasic;

import java.util.Scanner;

public class SumarParEimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		double par=0;
		double impar=0;
		double residuo;
		double numeroTemp;
				
		
		for (int i=1; i<=5; i++) {
			System.out.println("Ingrese el número: [ "+i+" ]");
			numeroTemp = teclado.nextFloat();
			
			while(numeroTemp<0) {
				System.out.println("El número debe ser mayor a cero, por favo ingresa otro número");
				numeroTemp = teclado.nextFloat();
			}
			
			residuo = numeroTemp%2;
			
			if(residuo==0) {
				
				par+=numeroTemp; //par= par + numeroTemp
			}
			
			if(residuo!=0 && residuo>0) {
				
				impar+=numeroTemp; 
			}
		}
		teclado.close();
		System.out.println("La sumatoria de los pares es: ["+par+" ]");
		System.out.println("la sumatoria de los impares es: ["+impar+" ]");		
		
		
		
	}//cierra main

}// cierra clase
