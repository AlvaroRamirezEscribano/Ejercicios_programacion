/**
 * Tema 4
 * Ejercicio 6
 * 
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
	una altura h. Aplica la fórmula t =√2h/g siendo g = 9.81m/s2
 * @author Alvaro
 *
 */
import java.util.Scanner;
public class Ejercicio6 {
	public static void main(String[] arg) {
		int h;
		double g=9.81;
		
		Scanner S = new Scanner(System.in);
		System.out.println("Introduzca la altura: ");
		h = S.nextInt();
		
		double seg= Math.sqrt(2*h/g);
		
		System.out.printf("El objeto tardará %.2f segundos en caer",seg);
	}

}
