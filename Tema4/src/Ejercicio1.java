/**
 * Tema 4
 * Ejercicio 1
 * 
 * Escribe un programa que pida por teclado un d�a de la semana y que diga qu�
	asignatura toca a primera hora ese d�a.
 * @author Alvaro
 *
 */

import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] arg) {
		
		int dia;
		String nombAsig ="";
		Scanner S = new Scanner(System.in);
		
		System.out.println("Introduce un dia de la semana: ");
		dia = S.nextInt();
		
		switch(dia) {
			case 1:
				nombAsig = "Sistemas";
				break;
			case 2:
				nombAsig = "Programacion";
				break;
			case 3:
				nombAsig = "Sistemas";
				break;
			case 4:
				nombAsig = "Programacion";
				break;
			case 5:
				nombAsig = "Programacion";
				break;
			default:
					System.out.println("Introduce un dia valido.");
					
		}
		
		System.out.println("El dia "+dia+" hay "+nombAsig);
		
			
		
	}

}
