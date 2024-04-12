package br.com.alura;

import java.util.ArrayList;

public class Ejemplo1 {

	public static void main(String[] args) {
		String variable1 = "ejemplo 1";
		String variable2 = "ejemplo 2";
		String variable3 = "ejemplo 3";
		String variable4 = "ejemplo 4";
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add(variable1);//add sirve para agregar a la lista
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);
		
		System.out.println(lista);
		
		// esto sirve para remover de la lista. lista.remove(2);
		//lista.set(2, "Ejemplo alterado"); //set sirve para modificar/alterar la lista.
		// sirve para adicionar otra lista dentro de la lista. lista.addAll(c)
		
		System.out.println(lista.size());
	}
}
