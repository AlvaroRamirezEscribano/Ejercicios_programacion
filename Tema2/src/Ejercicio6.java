/**
 * Tema 2
 * Ejercicio 6
 * 
 * Escribe un programa que calcule el total de una factura a partir de la base
	imponible (precio sin IVA). La base imponible estará almacenada en una
	variable.
 * @author Alvaro
 *
 */
public class Ejercicio6 {
	public static void main(String[] arg) {
		double precioSinIva = 540;
		double iva = precioSinIva * 0.21;
		double total = precioSinIva + iva;
		
		System.out.printf("El precio sin IVA es: %.2f€%n", precioSinIva);
		System.out.printf("El IVA del producto es: %.2f€%n", iva);
		System.out.printf("--------------------------------------%n");
		System.out.printf("EL precio final a pagar es: %.2f€%n", total);
		
	}

}
