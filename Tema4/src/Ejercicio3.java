/**
 * Tema 4
 * Ejercicio 3
 * 
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
	nombre del día de la semana.
 * @author Alvaro
 *
 */

import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] arg) {
		int dia;
		String nombDia = "";
		
		Scanner S = new Scanner(System.in);
		System.out.print("Introduce un numero de la semana: ");
		dia = S.nextInt();
		
		switch(dia) {
		case 1:
			nombDia = "Lunes";
			break;
		case 2:
			nombDia = "Martes";
			break;
		case 3:
			nombDia = "Miercoles";
			break;
		case 4:
			nombDia = "Jueves";
			break;
		case 5:
			nombDia = "Viernes";
			break;
		case 6:
			nombDia = "Sabado";
			break;
		case 7:
			nombDia = "Domingo";
			break;
		default:
				System.out.println("Introduce un dia valido.");
					}
		System.out.println("Hoy es: "+nombDia);
	}

}
