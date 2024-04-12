package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.alura.model.Alumno;

public class Curso{ 

	private String nombre;
	private int tiempo;
	private List<Aula> claseList = new LinkedList<>();
	private List<Aula> aulaList;
	
	
	public Curso(String nombre, int tiempo) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	public Curso(String nombre, int tiempo, List<Aula> claseList) {
		super();
		this.nombre = nombre;
		this.tiempo = tiempo;
		this.claseList = claseList;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	
	public List<Aula> getAulaList() {
		return claseList;
	}
	public void setAulaList(List<Aula> aulaList) {
		this.aulaList = aulaList;
	}
	
	public  void addAula(Aula aula) {
		this.claseList.add(aula);

	}
	//se utiliza el Override, para que imprima el toString del obj, por defecto
	//todos los traen, peor si no lo coloco, me va a imprimir el lugar donde
	//se encuentra almacenado el objeto.
	@Override
	public String toString() {
		return this.nombre;
	}
	//@Override
	//public int compareTo(Curso o) {
	public void addAlumno(Alumno alumno1) {
		// TODO Auto-generated method stub
		
	}
	public Object getAlumnos() {
		// TODO Auto-generated method stub
		return null;
	}
		
		//return this.nombre.compareTo(o.getNombre());
	}
	
	
	

