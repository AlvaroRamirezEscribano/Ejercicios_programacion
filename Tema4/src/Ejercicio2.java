/**
 * Tema 4
 * Ejercicio 2
 * 
 * Realiza un programa que pida una hora por teclado y que muestre luego
	buenos d�as, buenas tardes o buenas noches seg�n la hora. Se utilizar�n los
	tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. S�lo se tienen en
	cuenta las horas, los minutos no se deben introducir por teclado.
 * @author Alvaro
 *
 */

import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] arg) {
		int hora;
				
		Scanner S = new Scanner(System.in);
		
		System.out.print("Introduce una hora del dia: ");
		hora = S.nextInt();
		
		if(hora >= 6 && hora <=12) {
			System.out.println("Buenos dias.");
			
		}
		else if(hora >= 13 && hora <= 20) {
			System.out.println("Buenas tardes.");
		}
		else if(hora >= 21 && hora <= 24) {
			System.out.println("Buenas noches.");
		}
		else if(hora >= 0 && hora <= 5) {
			System.out.println("Buenas noches.");
		}
	}
}
