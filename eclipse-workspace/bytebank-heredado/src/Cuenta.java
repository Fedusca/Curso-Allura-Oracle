// entidad cuenta:
public abstract class	Cuenta{
	protected double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;
	
public Cuenta() {
	
}
	
	public Cuenta(int agencia, int numero) {
		
			this.agencia = agencia;
			this.numero = numero;
			System.out.println("estoy creando una cuenta" + this.numero);
		
	
		total++;
	}
	
	// Hay metodos que no retorna valor
	//con void no espera retorno, no espera ejecucion.
	public abstract void depositar(double valor);//{
		// Esta Cuenta       Esta Cuenta
		// This account     This account (traducido al ingles)
		// This object      This object  (traducido a la orientacion a objetos)
		//this.  saldo      = this.saldo      + valor; //en saldo no se puede usar this, xq no es un campo del obj cuenta
	//}
	  // Hay metodos que retornan valor
	public void saca(double valor) throws SaldoInsuficienteException{
      if(this.saldo < valor) {   
    	  throw new SaldoInsuficienteException("No tienes saldo");
      }
	   this.saldo -= valor;
  
}
    


	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			try {
				this.saca(valor);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
			cuenta.depositar(valor);
			return true;
		}else { return false;
		}
	}
	

 public	double getSaldo(){
			return this.saldo;
		}
 
	// Métodos Getter y Setter para acceder a nuestros atributos protegidos (encapsulados)	
 	
 public int getAgencia() {
	return agencia;
}
 public void setTitular(Cliente titular) {
	this.titular = titular;
}
 public Cliente getTitular() {
	return titular;
}
 public static int getTotal() {
	 return Cuenta.total;
 }
}