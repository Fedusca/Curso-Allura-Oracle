package br.com.alura;

import java.util.ArrayList;

public class Clase2 {

	public static void main(String[] args) {
		String variable1 = "clase 1";
		String variable2 = "clase 2";
		String variable3 = "clase 3";
		String variable4 = "clase 4";
		
		ArrayList<String> listaString = new ArrayList<String>();
		listaString.add(variable1);//add sirve para agregar a la lista
		listaString.add(variable2);
		listaString.add(variable3);
		listaString.add(variable4);
		
		System.out.println(listaString);
		
		// esto sirve para remover de la lista. lista.remove(2);
		//lista.set(2, "Ejemplo alterado"); //set sirve para modificar/alterar la lista.
		// sirve para adicionar otra lista dentro de la lista. lista.addAll(c)
		
		System.out.println(listaString.size());
		
		//Esta es una forma de leer una lista for(int i = 0; i < listaString.size(); i++) {
		//	System.out.println(listaString.get(i));
		//}
		
		
		//Esta es otra forma, utilizando "forEach"for (String clase : listaString) {
		//	System.out.println(clase);
		//}
		
		//Utilizando forEach recurso de lambidas listaString.forEach(clase ->{
		//	System.out.println(clase);
		//});
		
	}
}
