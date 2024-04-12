package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class clase3 {

	public static void main(String[] args) {
		String curso1 = "Geometria";
		String curso2 = "Fisica";
		String curso3 = "Quimica";
		String curso4 = "Historia";
		
		ArrayList<String> cursos = new ArrayList<String>();
		cursos.add(curso1);//add sirve para agregar a la lista
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		//esto es utilizando "collections"
		//System.out.println(cursos);
		
      //Collections.sort(cursos); //esto es para ordenar de mayor a menor
      
      //System.out.println(cursos);
      
     // Collections.sort(cursos, Collections.reverseOrder()); //esto es de menor a mayor
     // System.out.println(cursos);
      //Esto es utilizando el obj
	//cursos.sort(Comparator.reverseOrder()); //esto es de menor a mayor
		//cursos.sort(Comparator.naturalOrder()); //esto es de mayor a menor.
		
		//A partir de java 8, se utiliza Stream, al utilizar "collect" crea
		//una lista nueva, para que esto no suceda, se utiliza List<String>
		List<String> cursoslist = cursos.stream().sorted().collect(Collectors.toList());
		System.out.println(cursoslist);

	}
}

