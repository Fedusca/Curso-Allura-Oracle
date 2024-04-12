
public class AutenticacionUtil {

	private String clave;
	
	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}
	public boolean setClave(String clave) {
		this.clave = clave;
		return true;
	}
}
