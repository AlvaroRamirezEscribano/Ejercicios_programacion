/**
 * Tema 3
 * Ejercicio 11
 * 
 * Realiza un conversor de Kb a Mb.
 * @author Alvaro
 *
 */
import java.util.Scanner;
public class Ejercicio11 {
	public static void main(String[] arg) {
		int kb;
		Scanner S = new Scanner(System.in);
		
		System.out.println("Numero de Kb a convertir: ");
		kb = S.nextInt();
		
		int mb = kb/1024;
		
		System.out.printf(kb+" Kb son: "+mb+" Mb");
	}

}
