/**
 * Tema 2
 * Ejercicio 4
 * 
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
	convertir deberá estar almacenada en una variable.
 * @author Alvaro
 *
 */
public class Ejercicio4 {
	public static void main(String[] arg) {

		double euros = 15.50;
		
		int pesetas = (int)(euros * 166.386);
		
		System.out.println(euros+" euros = "+pesetas+" pesetas");
		
	}

}
