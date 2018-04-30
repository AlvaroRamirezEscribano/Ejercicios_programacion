/**
 * Tema 3
 * Ejercicio 4
 * 
 * Escribe un programa que sume, reste, multiplique y divida dos números
	introducidos por teclado.

 * @author Alvaro
 *
 */
import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String[] arg) {
		int a,b;
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero: ");
		a = S.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		b = S.nextInt();
		
		int suma = a+b;
		int resta = a-b;
		int mult = a*b;
		int div = a/b;
		
		System.out.println("La suma de los numeros es: "+suma);
		System.out.println("La resta de los numeros es: "+resta);
		System.out.println("La multiplicacion de los numeros es: "+mult);
		System.out.println("La division de los numeros es: "+div);
		
		
		
		
	}

}
