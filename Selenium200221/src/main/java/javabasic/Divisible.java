package javabasic;

import javax.swing.JOptionPane;

public class Divisible {

	/**
	 * Lee un numero por teclado e indica si es divisible entre dos(resto=0)
	 * indicar si no lo es
	 * **/
	
	public static void main(String[] args) {
		int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
		
		if (numero % 2==0) {
			System.out.println ("El numero ingresado [ "+ numero + " ] es divisible entre 2");
					}
		else {
			System.out.println ("El numero ingresado [ "+ numero + " ] no es divisible entre 2");
		}
	}
	
}
