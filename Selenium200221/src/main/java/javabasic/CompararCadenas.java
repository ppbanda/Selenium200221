package javabasic;
import java.util.Scanner;
public class CompararCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear scanner para leer palabras
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Escribe la primera palabra");
		
		String palabra1= leer.next();

		System.out.println("Escribe la segunda palabra");
		
		String palabra2= leer.next();
		leer.close();
		
		if(palabra1.equals(palabra2)) {
			System.out.println("Las palabras son iguales");
		} else {
			System.out.println ("Las palabras no son iguales");
		}
		if(palabra1.equalsIgnoreCase(palabra2)) {
			System.out.println("Las palabras son iguales");
		} else {
			System.out.println("Las palabras no son iguales");
		}
		
		String texto="Un 45 texto";
		String textoSinespacios = texto.replace(" ", "");

		System.out.println(textoSinespacios);

		System.out.println("El texto tiene [ "+texto.length()+" ]");
		
	}//Fin del main

}//fin de la clase
