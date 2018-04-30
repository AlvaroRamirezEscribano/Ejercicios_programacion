/**
 * Tema 3
 * Ejercicio 12
 * 
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
	examen de la asignatura Programación para obtener la media deseada. Hay
	que tener en cuenta que la nota del primer examen cuenta el 40% y la del
	segundo examen un 60%.

 * @author Alvaro
 *
 */
import java.util.Scanner;
public class Ejercicio12 {
	public static void main(String[] arg) {
		
		double notauno;
		double notados;
		double nota;
		Scanner S = new Scanner(System.in);
		
		System.out.println("Nota del primer examen: ");
		notauno = S.nextDouble();
		
		System.out.println("Nota deseada del trimestre: ");
		nota = S.nextDouble();
		
		notados = ((nota * 100) - (notauno * 40))/60;
		
		System.out.println("Si quieres un "+nota+" en el trimestre debes sacar un "+notados);
	}

}
