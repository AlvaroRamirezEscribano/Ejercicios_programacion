import java.util.Scanner;
public class S05Ejercicio19 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = s.nextLine();
    
    int planta = 1;
    int caracteres = 1;
    int espacios = alturaIntroducida-1;

    
    while (planta <= alturaIntroducida) {
      
      // inserta espacios
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      } 
	  
		if (planta == 1) {
      System.out.print(relleno);
    } else if (planta > 1 && planta < alturaIntroducida) {
      System.out.print(relleno);
		  for (int i = 0; i < caracteres - 2; i++) {
			  System.out.print(" ");
		  }
		  System.out.print(relleno);
	  } else {
      for (int i = 0; i < caracteres; i++) {
        System.out.print(relleno);
      }
    }
      
  
	  

      System.out.println();

      planta++;
      espacios--;
      caracteres += 2;
  }
    }
  }

