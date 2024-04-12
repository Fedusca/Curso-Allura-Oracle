// entidad cuenta:
class	Cuenta{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;
	
	public Cuenta(int agencia) {
		if(agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		}else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se van creando : " + total + " cuentas");
	}
	
	// Hay metodos que no retorna valor
	//con void no espera retorno, no espera ejecucion.
	public void depositar(double valor){
		// Esta Cuenta       Esta Cuenta
		// This account     This account (traducido al ingles)
		// This object      This object  (traducido a la orientacion a objetos)
		this.  saldo      = this.saldo      + valor; //en saldo no se puede usar this, xq no es un campo del obj cuenta
	}
	  // Hay metodos que retornan valor
	public boolean retirar(double valor) {
    	if (this.saldo >= valor ) {
    		this.saldo -= valor;
    		return true;
    	} return false;
}
    


	public boolean transferir(double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			cuenta.depositar(valor);
			return true;
		} return false;
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