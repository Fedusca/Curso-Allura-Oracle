
public class TestConexion {

	public static void main(String[] args) throws Exception {
		try(Conexion con = new Conexion()){
			con.leerDatos();
		}catch(IllegalStateException ex) {
			System.out.println("Ejecutando catch");
			ex.printStackTrace();
		}
		
		//el codigo de arriba remplaza todo el codigo de abajo, con el AutoCloseable
		//siempre que la clase se convierta en recurso, ya que sea "desechable", 
		//una base de datos, una conexion, algo temporal. sino se utiliza el cod sig.
		/*Conexion con = null;
		try {
			con = new Conexion();
			con.leerDatos();
		}catch (IllegalStateException ex) {
			ex.printStackTrace();
		} finally {
			System.out.println("Ejecutando finally");
			if(con != null) {
			con.cerrar();
			}
		}
	*/
	}
	
	

}
