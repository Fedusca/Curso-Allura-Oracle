
public class TestReferencias {

	public static void main(String[] args) {
		
		// Elemento mas generico "Funcionario" puede ser adaptado al 
		//elemento mas especifico "Gerente"
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		gerente.iniciarSesion("123");
		
	}	
	
}
