
public class TestReferencia3 {
	
	public static void main(String[] args) {
		Cuenta cuentaDeDiego = new Cuenta();
		
		
		cuentaDeDiego.titular = new Cliente();
		cuentaDeDiego.titular.nombre = "diego";
	
		System.out.println(cuentaDeDiego.titular.nombre);
	}
}
