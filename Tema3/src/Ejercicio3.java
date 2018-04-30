/**
 * Tema 3
 * Ejercicio 3
 * 
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
	convertir debe ser introducida por teclado.

 * @author Alvaro
 *
 */
import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] arg) {
		int pesetas;
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de pesetas: ");
		pesetas = S.nextInt();
		
		double euros = (double)(pesetas / 166.386);
		
		System.out.printf("%d pesetas son: %.2f€",pesetas, euros);
	}

}
