
public class CrearCuenta {
public static void main(String[] args) {
	// Variable          = valor
	// Variable ->       = 123FFD (Identificacion y memoria de esta nueva cuenta)
	Cuenta primeraCuenta = new Cuenta();
	primeraCuenta.saldo = 400;
	// PrimeraCuenta.pais = "peru"; No compila, por que no tiene atributo asignado en cuenta.
	System.out.println(primeraCuenta.saldo);
	
	Cuenta segundaCuenta = new Cuenta();
	segundaCuenta.saldo = 400;
	System.out.println(segundaCuenta.saldo);
	System.out.println(primeraCuenta.agencia);
	
	System.out.println(primeraCuenta);
	System.out.println(segundaCuenta);
	if(primeraCuenta.saldo == segundaCuenta.saldo) {
		System.out.println("son el mismo objeto");
	}else {
		System.out.println("son Diferentes");
	}
	
}
}
