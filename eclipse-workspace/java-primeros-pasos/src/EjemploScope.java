
public class EjemploScope {

	public static void main(String[] args) {
		System.out.println("Hello world");
//atajo para no escribir el comando es sisout + ctrl + espacio

		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja;
		if (cantidadPersonas >1) {
			esPareja = true;
		}else {
			esPareja = false;
		}
		boolean puedeEntrar = edad >= 18 && esPareja;
		//System.out.println("el valor de la condicion es: " + esPareja);
		if (puedeEntrar) {
			System.out.println("Sea bienvenido");
		} else {
			System.out.println("Usted no está permitido a" + " entrar");
		}

	}
}


