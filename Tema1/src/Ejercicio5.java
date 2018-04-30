/**
 * Tema1
 * Ejercicio5
 * 
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura
	de un color diferente.
	
 * @author Alvaro
 *
 */
public class Ejercicio5 {
	public static void main(String[] arg) {
		String rojo = "\033[31m"; 
		String azul = "\033[34m"; 
		String morado = "\033[35m"; 
		
		System.out.println("Lunes   Martes   Miercoles   Jueves   Viernes");
		System.out.println("-------------------------------------------");
		System.out.println(rojo+"\tS.I"+morado+     "\tPRO"+azul+     "\tS.I"+morado+          "\tPRO"+azul+       "\tPRO");
		System.out.println("S.I     PRO     S.I          PRO       PRO");
		System.out.println("S.I     PRO     S.I          PRO       ENTR");
		System.out.println("R      E       C      R      E         O");
		System.out.println("FOL     BBDD    LM           BBDD      LM");
		System.out.println("FOL     BBDD    ENTR         BBDD      LM");
		System.out.println("FOL     BBDD    ENTR         BBDD      LM");
	}


}
