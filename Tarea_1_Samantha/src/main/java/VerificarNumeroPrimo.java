import java.util.Scanner;

public class VerificarNumeroPrimo {
  public static boolean esPrimo(int número) {
    if (número <= 1 ) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(número); i++) {
      if (número % i == 0) {
        return false;
        
      }
    }
    return true;
  }
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número para verificar si es primo: ");
        int numero = input.nextInt();

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        input.close();
  }
  
}
