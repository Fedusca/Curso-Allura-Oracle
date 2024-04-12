
public class TestControlBonificacion {

	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setSalario(2000);
		
		Gerente Jimena = new Gerente();
		Jimena.setSalario(10000);
		
		Contador alexis = new Contador();
		alexis.setSalario(5000);
		ControlBonificacion controlbonificacion = new ControlBonificacion();
		
		controlbonificacion.registrarSalario(diego);
		controlbonificacion.registrarSalario(Jimena);
		controlbonificacion.registrarSalario(alexis);
	}
	
}
