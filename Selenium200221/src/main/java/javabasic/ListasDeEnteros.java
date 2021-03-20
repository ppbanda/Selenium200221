package javabasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListasDeEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declarar lista de enteros
		
		List < Integer > listaDeNumeros = new ArrayList<>();
		listaDeNumeros.add(1);
		listaDeNumeros.add(2);
		listaDeNumeros.add(3);
		listaDeNumeros.add(4);
		listaDeNumeros.add(5);
		listaDeNumeros.add(2);
		listaDeNumeros.add(2);
		listaDeNumeros.add(4);
		listaDeNumeros.add(5);
		
		//Imprime todos los elementos de nuestra lista
		System.out.println(listaDeNumeros);
		//Ordenar de mayor a menor
		Collections.sort(listaDeNumeros);
		System.out.println(listaDeNumeros);
		//Ordenamos e invertimos el  orden de nuestra lista
		Collections.sort(listaDeNumeros, Collections.reverseOrder());
		//Imprime todos los elementos de nuestra lista
		System.out.println(listaDeNumeros);
		//
		Collections.sort(listaDeNumeros);
		
		//quitar elementos repetidos
		Object last = null;
		int numCount = 0;
		Iterator<Integer> i= listaDeNumeros.iterator();
		
		while (i.hasNext()) {
			Object temp = i.next();
			if (temp.equals(last)) {
				i.remove();
				numCount++;
				}else {
					last = temp;
				}
		
		}
		
		System.out.println (listaDeNumeros);
		
	} // cierra main

} // cierra clase
