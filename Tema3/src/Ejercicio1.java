/**
  Tema 3
 * Ejercicio 1
 * 
 * Realiza un programa que pida dos números y que luego muestre el resultado
	de su multiplicación.
 * @author Alvaro
 *
 */

import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] arg) {
		int a,b;
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero: ");
		a = S.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		b = S.nextInt();
		
		System.out.println("La multiplicacion de "+a+" y "+b+" es: "+a*b);
		
	}

}
