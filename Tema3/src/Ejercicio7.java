/**
 * Tema 3
 * Ejercicio 7
 * 
 * Escribe un programa que calcule el total de una factura a partir de la base
	imponible.
 * @author Alvaro
 *
 */
import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] arg) {
		double euros;
		Scanner S = new Scanner(System.in);
		
		System.out.println("Introduce factura para calcular IVA: ");
		euros = S.nextDouble();
		
		double iva = euros * 0.21 + euros;
		
		System.out.printf("La factura total es: %.2f€",iva);
	}


}
