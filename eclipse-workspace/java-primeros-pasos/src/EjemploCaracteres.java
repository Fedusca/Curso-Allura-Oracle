
public class EjemploCaracteres {

	public static void main(String[] args) {
		
		char caracter = 'a' ; //soporta 1 solo catacter a la vez
	
		System.out.println(caracter);
		
		caracter = 65;
		System.out.println(caracter);

		caracter = 65 + 1;
		char segundoCaracter = (char) (caracter + 1);
		
		System.out.println(segundoCaracter);
		
		String palabra ="Alura cursos online";
		System.out.println(palabra);
		
		palabra = palabra + " 2020";
		System.out.println(palabra);
	}
	
}
