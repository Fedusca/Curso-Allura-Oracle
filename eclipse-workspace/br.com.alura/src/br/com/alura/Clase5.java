package br.com.alura;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;

import model.Curso;

public class Clase5 {

	public static void main(String[] args) {
		Curso curso1 = new Curso("PHP",30);
		Curso curso2 = new Curso("Ruby",10);
		Curso curso3 = new Curso("JavaScript",20);
		Curso curso4 = new Curso("Java",50);
		
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		
		
		
		
		System.out.println(cursos);
		
		//Collections.sort(cursos, Collections.reverseOrder());
		//para poder utilizar Collections, debemos generar el implemento "compareTO"
		//En caso que no quisieramos utilizarlo, lo podemos hacer de la sig manera.
		
		//cursos.sort(Comparator.comparing(Curso::getNombre));
		//De la mimsa manera si queremos utilizar Collections como mas arriba
		//se genera el codigo asi: 
		//Collections.sort(cursos,Comparator.comparing(Curso::getNombre));
		//y va dar el mismo resultado.
		
		System.out.println(cursos);
	}
}
