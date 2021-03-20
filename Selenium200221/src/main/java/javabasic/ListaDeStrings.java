package javabasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListaDeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lista de strings  remover iguales e invertir orden
		
		List<String> listaDeNombres = new ArrayList<>();
		listaDeNombres.add("Persona1");
		listaDeNombres.add("Persona2");
		listaDeNombres.add("Persona4");
		listaDeNombres.add("Persona4");
		listaDeNombres.add("Persona5");
		listaDeNombres.add("Persona6");
		//Imprime lista
		System.out.println (listaDeNombres);
		
		Collections.sort(listaDeNombres, Collections.reverseOrder());
		System.out.println (listaDeNombres);
		
		List<String> nombresSinRepetir = listaDeNombres.stream().distinct().collect(Collectors.toList());
		System.out.println (nombresSinRepetir);
		
		
		
		
		
		
		
		
		
	} // cierra main

} //cierra clase
