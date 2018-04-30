import java.util.Scanner;
public class numero {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
    int altura = 0;
    int espacios = 0;
    
    while (altura < 5 && espacios < 1) {
    
    System.out.print("Sosio colocame la altura maki, minimo 5:");
    altura = Integer.parseInt(s.nextLine());
    System.out.print("Introduzca el número de espacios, minimo 1:");
    espacios = Integer.parseInt(s.nextLine());
  }
    int contadorEspacio = 0;
  
  for (int i = 0; i < altura; i++) {
    System.out.print("*");
    
    //espacio
    for (int z = 0; z < espacios; z++) {
      System.out.print(" ");
    }
    if ( i < 3 || i == altura-1) {
      
      if ( i == 0 || i == 2 || i == altura-1) {
        System.out.print("****");
        while (contadorEspacio < espacios) {
          System.out.print(" ");
          contadorEspacio++;
        }
        contadorEspacio = 0;
        System.out.print("****");
      }
      
      if ( i == 1) {
        
        System.out.print("*");
        System.out.print("   ");
        
        while (contadorEspacio < espacios) {
          System.out.print(" ");
          contadorEspacio++;
        }
        contadorEspacio = 0;
        System.out.print("*");
      }

        
    } else if ( i > 2 && i < altura - 1) {
      
       System.out.print("   *");
       while (contadorEspacio < espacios) {
          System.out.print(" ");
          contadorEspacio++;
        }
        contadorEspacio = 0;
       System.out.print("   *");
    }
      
    System.out.println();
	}
	
}
}

