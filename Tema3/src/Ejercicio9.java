/**
 * Tema 3
 * Ejercicio 9
 * 
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =
	1/3πr2h

 * @author Alvaro
 *
 */

import java.util.Scanner;
public class Ejercicio9 {
	public static void main(String[] arg) {
		int r,h;
		Scanner S = new Scanner(System.in);
		
		System.out.println("Radio del cono: ");
		r = S.nextInt();
		
		System.out.println("Altura del cono: ");
		h = S.nextInt();
		
		double pi = 3.1416;
		double vol = (1.0/3.0)*pi*r*r*h;
		
		System.out.println("El volumen del cono es: "+vol+"cm3");
	}

}
