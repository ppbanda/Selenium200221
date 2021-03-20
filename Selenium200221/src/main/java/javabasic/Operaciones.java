package javabasic;

import javax.swing.JOptionPane;

public class Operaciones {
/**
 * 1) Declarar dos variables numericas ingresndo el valor por elteclado, 
 * muestra por consola la suma, resta, multilicacion, division
 * 
 * **/
	
	
	
public static void main(String[] args) {
	double numero1 =Double.parseDouble( JOptionPane.showInputDialog("Ingresa el numero 1:"));
	
//	String numero2 = JOptionPane.showInputDialog("Ingresa el numero 2:");
	
	double numero2 =Double.parseDouble( JOptionPane.showInputDialog("Ingresa el numero 2:"));
	
//	System.out.println (numero1 + Double.parseDouble(numero2));
	
	System.out.println (numero1 + numero2);
	
	JOptionPane.showMessageDialog(null, "La suma es: "+(numero1 + numero2));
	
	JOptionPane.showConfirmDialog(null, "La resta es: "+( numero1 - numero2));
	
	JOptionPane.showConfirmDialog(null, "La division es: "+ (numero1 / numero2));
	
	JOptionPane.showConfirmDialog(null, "La multiplicación es: "+ (numero1 * numero2));
	
}	
	

	
}//cierra class
