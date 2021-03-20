package POO;

public class Cuenta {

	private String nombre ;
	private String numeroCuenta ;
	private double tipoInteres;
	private double saldo;
	
	/***
	 * @author jbanda
	 * @date 06/03/2021
	 * @param N/A 
	 * **/
	public Cuenta() {
		
	}
	/***
	 * @author jbanda
	 * @date 06/03/2021
	 * @param String String double double 
	 * **/
	public Cuenta (String nombre, String numeroCuenta, double tipoInteres, double saldo) {
		this.nombre=nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}
	/***
	 * @author jbanda
	 * @date 06/03/2021
	 * @param Object
	 * **/
	public Cuenta(Cuenta c) {
		nombre = c.nombre;
		numeroCuenta = c.numeroCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo;
	}
	
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}
	
	public void setnumeroCuenta (String numeroCuenta) {
		this.numeroCuenta= numeroCuenta;
	}
	
	public void settipoInteres (double tipoInteres) {
		this.tipoInteres=tipoInteres;
		
	}
	
	public void setsaldo (double saldo) {
		this.saldo=saldo;
	}
	
	
	public String getNombre () {
		return this.nombre;
		
	}
	
	public String getnumeroCuenta () {
		return this.numeroCuenta;
		
	}
	
	public double gettipoInteres () {
		return this.tipoInteres;
	}
	
	public double getSaldo () {
		return this.saldo;
		
	}
	
	public boolean ingreso(double n) {
		boolean ingresoCorrecto = true;

		if (n < 0) {
			ingresoCorrecto = false;
		} else {
			saldo = saldo + n;
		}

		return ingresoCorrecto;
	}
	
	/**
	 * @author Sergio Ramones
	 * @date 06/03/2021
	 * @param N/A
	 * @return double
	 **/
	public boolean reintegro(double n) {
		boolean reintregroCorrecto = true;
		if (n < 0) {
			reintregroCorrecto = false;
		} else if (saldo >= n) {
			// saldo=saldo-n;
			saldo -= n;
		} else {
			reintregroCorrecto = false;
		}

		return reintregroCorrecto;
	}
	
	/**
	 * @author Sergio Ramones
	 * @date 06/03/2021
	 * @param N/A
	 * @return Object double
	 **/
		
	public boolean transferencia(Cuenta c, double n)  {
		boolean correcto = true;
		if (n<0 ) {
			correcto = false;
		} else if (saldo >= n) {
			reintegro (n);
			c.ingreso(n);
		} else {
			correcto = false;
		}
		return correcto;
		}
	
}//cierra clase

