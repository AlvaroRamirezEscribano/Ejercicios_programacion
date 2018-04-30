/**
 * Tema 3
 * Ejercicio 2
 * 
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
	convertir debe ser introducida por teclado.
 * @author Alvaro
 *
 */
import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] arg) {
		double euros;
		
		Scanner S = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de euros: ");
		euros = S.nextDouble();
		
		int pesetas = (int)(euros * 166.386);
		
		System.out.printf("%.2f€ son: %d pesetas",euros, pesetas);
		
	}

}
