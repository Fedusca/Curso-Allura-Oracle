

	public class TestAlcance {

	    public static void main (String [] args) {
	        System.out.println ("pruebas condicionales");

	        int edad = 20;
	        int cantidadPersonas = 3;
	        boolean acompaņado;

	        if (cantidadPersonas >= 2) {
	            acompaņado = true;
	        } else {
	            acompaņado = false;
	        }

	        if (edad >= 18 || acompaņado) {
	            System.out.println ("Bienvenido");
	        } else {
	            System.out.println ("desafortunadamente no puedes ingresar");
	        }
	    }
	}
