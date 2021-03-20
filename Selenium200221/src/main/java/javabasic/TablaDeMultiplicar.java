package javabasic;

import java.util.Scanner;

public class TablaDeMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int tabla = 0;
		int resultado = 0;
		int temporal=0;
		
		System.out.println("Ingresa el número que se va a multiplicar");
		temporal =teclado.nextInt();
		
		while (temporal<=0) {
			
			System.out.println("El número debe ser mayor a 0, ingresa nuevamente");
			temporal =teclado.nextInt();
		}
		
		for (int indice =1; indice<=10; indice++) {
		
			resultado = indice * temporal;
			System.out.println("La multiplicación "+temporal+ " por " +indice +" el resultado es " +resultado);
			
			
		}
		
		
	} // cierra main

} //cierra clase
