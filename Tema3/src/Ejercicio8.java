/**
 * Tema 3
 * Ejercicio 8
 * 
 * Escribe un programa que calcule el salario semanal de un empleado en base
	a las horas trabajadas, a razón de 12 euros la hora.
 * @author Alvaro
 *
 */

import java.util.Scanner;
public class Ejercicio8 {
	public static void main(String[] arg) {
		int horas;
		Scanner S = new Scanner(System.in);
		
		System.out.println("Horas trabajadas esta semana: ");
		horas = S.nextInt();
		
		int sueldo = horas*12;
		
		System.out.println("Has ganado "+sueldo+"€.");
	}

}
