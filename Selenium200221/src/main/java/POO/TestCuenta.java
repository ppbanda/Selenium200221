package POO;
import java.util.Scanner;

public class TestCuenta {
	
	public void main(String[] args) {
	Scanner teclado= new Scanner(System.in);
	String nombre;
	String numero;
	double tipo;
	double importe;
	//Vamos a crear un objeto de nuestra clase Cuenta usando el constructor sin parametros.
	Cuenta cuenta1= new Cuenta();
	
	//asignar valor a las varaibles por teclado
	System.out.println ("Ingresa Nombre: ");
	nombre= teclado.next();
	System.out.println("Ingresa numero de cuenta: ");
	numero= teclado.next();
	System.out.println("Tipo de interes: ");
	tipo= teclado.nextDouble();
	System.out.println ("Saldo");
	importe = teclado.nextDouble();
	teclado.close();
	
	//Asignar valores con nuestros metodos set
	cuenta1.setNombre (nombre);
	cuenta1.setnumeroCuenta(numero);
	cuenta1.setsaldo(importe);
	cuenta1.settipoInteres(tipo);
	System.out.println(cuenta1.getNombre());
	
	
	
	}

} // cierra class
