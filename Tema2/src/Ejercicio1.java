/**
 * Tema2
 * Ejercicio1
 * 
 * Escribe un programa en el que se declaren las variables enteras x e y. Asignales
	los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
	el valor de cada variable, la suma, la resta, la división y la multiplicación.
 * @author Alvaro
 *
 */
public class Ejercicio1 {
		public static void main(String[] arg) {
		
		int x=144;
		int y=999;
		int suma,resta,mult,div;
		
		suma = x+y;
		resta = x-y;
		mult = x*y;
		div = x/y;
		
		System.out.println("El valor de x e y es: "+x+", "+y);
		System.out.println("La suma es: "+suma);
		System.out.println("La resta es: "+resta);
		System.out.println("La multiplicacion es: "+mult);
		System.out.println("La division es: "+div);
	}
}
