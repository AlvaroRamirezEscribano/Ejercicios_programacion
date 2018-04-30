/**
 * Tema 4
 * Ejercicio 4
 * 
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
	las horas extras. Escribe un programa que calcule el salario semanal de un
	trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
	trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
	euros la hora.
 * @author Alvaro
 *
 */

import java.util.Scanner;
public class Ejercicio4 {
	public static void main(String[] arg) {
		int horas;
		int aux;
		int total;
		Scanner S = new Scanner(System.in);
		
		System.out.print("Introduce horas trabajadas: ");
		horas = S.nextInt();
		
		if(horas <= 40) {
			System.out.println("Has ganado: "+horas*12);
		}
		else if(horas >= 41) {
			aux = horas-40;
			total = aux*16 + 40*12;
			
			System.out.println("Has ganado: "+total);
		}
	}

}
