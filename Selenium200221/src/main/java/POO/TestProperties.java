package POO;
import comun.LeerProperties;

public class TestProperties {

	public static void main (String [] args) {
		LeerProperties prop = new LeerProperties();
		prop.getSystemProperties();
		
		String mensaje1 = System.out.getProperty("MENSAJE1");
		System.out.println();
		System.out.println(mensaje1);
		prop.setSystemPropFileName (System.getProperty("user.dir") + "\\scr\\resources\\dataFiles\\data.properties");
		prop.getSystemProperties ();
		String archivo = System.getProperty(("MENSAJE");
		
		System.out.println (archivo);
		
	}
}
