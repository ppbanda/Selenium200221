package javabasic;

public class SumaArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear nuestro arreglo de 100 indices
		int [] numeros= new int[100];
		int suma = 0;
		
		// Recorrer el arreglo asignar numero y sumar
		
		for (int i=0; i<numeros.length; i++) {
			numeros [i] = i+1;
			suma+=numeros [i]; // suma = suma + numeros [i];
					}
		//Mostrar resultadod e la suma
		System.out.println(suma);
		
		
		
		
		
		
	} //cierra main

}// cierra clase
