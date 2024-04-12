package br.com.alura;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import model.Curso;
import model.Aula;

public class Clase6 {
	public static void main(String[] args) {
		Curso curso1 = new Curso("PHP",30);
		curso1.addAula(new Aula("ArrayList"));
		curso1.addAula(new Aula("List"));
		curso1.addAula(new Aula("LinkedList"));
		
		
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		
		

		
		
		System.out.println(cursos.get(0).getAulaList());
	}
}
