

package com.mycompany.tarea_1_samantha;


import java.util.Scanner;

public class Tarea_1_Samantha {

    public static void main(String[] args) {
      
     Scanner input = new Scanner(System.in);
      
      System.out.print("Ingrese el primer número: ");
      double num1 = input.nextDouble();
      
      System.out.print("Ingrese el segundo número: ");
      double num2 = input.nextDouble();
      
      System.out.println("Operaciones disponibles:");
      System.out.println("1. Suma");
      System.out.println("2. Resta");
      System.out.println("3. Multiplicación");
      System.out.println("4. División");
      
      System.out.print("Seleccione una operación (1/2/3/4): ");
      int opcion = input.nextInt();
      
      double resultado = 0;
      
      switch (opcion) {
        case 1:
         resultado = num1 + num2;
         System.out.println("La suma es: " + resultado);
         break;
        case 2:
          resultado = num1 - num2;
          System.out.println("La resta es: " + resultado);
          break;
        case 3:
          resultado = num1 * num2;
          System.out.println("La multiplicación es: " + resultado);
          break;
        case 4:
          if (num2 == 0){
            System.out.println("Error: no se puede dividir por cero.");
          } else {
            resultado = num1 / num2;
            System.out.println("La división es: " + resultado);   
      }
      break;
        default:
          System.out.println("Opción no válida.");
          break;  
    }
      input.close();
  }
}
