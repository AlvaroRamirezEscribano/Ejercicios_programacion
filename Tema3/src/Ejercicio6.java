/**
 * Tema 3
 * Ejercicio 6
 * 
 * Escribe un programa que calcule el �rea de un tri�ngulo.
 * @author Alvaro
 *
 */
import java.util.Scanner;
public class Ejercicio6 {
	public static void main(String[] args) {
		int b,h;
		Scanner S = new Scanner(System.in);
		
	    System.out.print("Base del triangulo: ");
	    b = S.nextInt();
	    
	    System.out.print("Altura del triangulo: ");
	    h = S.nextInt();
	    
	    int area = (b*h)/2;
	    
	    System.out.println("El �rea del tri�ngulo es: "+area);
	  }

}
