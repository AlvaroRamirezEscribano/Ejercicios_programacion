/**
 * Tema 2
 * Ejercicio 5
 * 
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
	convertir deberá estar almacenada en una variable.

 * @author Alvaro
 *
 */
public class Ejercicio5 {
  public static void main(String[] args) {
    int pesetas = 280;
    double euros = (double)pesetas * 0.006;

		System.out.printf("%d pesetas son %.2f€",pesetas, euros);
	}	
}