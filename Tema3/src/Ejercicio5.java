/**
 * Tema 3
 * Ejercicio 5
 * 
 * Escribe un programa que calcule el área de un rectángulo
 * @author Alvaro
 *
 */
import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] arg) {
		int a,b;
		Scanner S = new Scanner(System.in);
		
		System.out.println("Introduce la altura del rectangulo: ");
		a = S.nextInt();
		
		System.out.println("Introduce la altura del rectangulo: ");
		b = S.nextInt();
		
		int area = a*b;
		
		System.out.println("El area del rectangulo es: "+area);
	}

}
