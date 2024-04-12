
public class TestCuenta {
	
	public static void main(String[] args) throws SaldoInsuficienteException {
		CuentaCorriente cc = new CuentaCorriente(1,1);
		CuentaAhorros ca = new CuentaAhorros(2, 3);
		cc.depositar(2000);
		cc.saca(1000);
		
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}

}
