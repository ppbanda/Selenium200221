package javabasic;

public class Cadenas {
public static void main (String[] args) {
	String cadena= "Hola Curso Selenium";
	String subcadena = cadena.substring(0,4);
	System.out.println(subcadena);
	
	if(cadena.equals("Hola Curso Selenium")) {
		System.out.println("Las cadenas son iguales");
			} else
			{ System.out.println ("Las cadenas no son iguales");
						}
	if(cadena.contains("Curso")) {
		System.out.println("Si esta elemento");
			} else {
				System.out.println("No esta elemento");
			}
}
}
