/**
 * Tema 4
 * Ejercicio 5
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+
	b = 0).
 * @author Alvaro
 *
 */

import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] arg) {
		double a,b;
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Introduce un número para 'a' y 'b': ");
		a = S.nextDouble();
		b = S.nextDouble();
		
		if (a == 0) {
			System.out.println("____________________________________");
			System.out.println("El número 'a' no puede ser 0");
		}
		if (b < 0) {
			System.out.println("____________________________________");
			System.out.println("El número 'b' no puede ser negativo");
		} else {
			System.out.println("____________________________________");
			System.out.println("x = "+ (-b/a));
			
		}
	}

}
