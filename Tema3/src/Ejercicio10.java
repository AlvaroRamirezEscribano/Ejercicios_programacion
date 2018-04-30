/**
 * Tema 3
 * Ejercicio 10
 * 
 * Realiza un conversor de Mb a Kb
 * @author Alvaro
 *
 */
import java.util.Scanner;
public class Ejercicio10 {
	public static void main(String[] arg) {
		int mb;
		Scanner S = new Scanner(System.in);
		
		System.out.println("Numero de Mb a convertir: ");
		mb = S.nextInt();
		
		int kb = mb*1024;
		
		System.out.printf(mb+" Mb son: "+kb+" Kb");
	}

}
