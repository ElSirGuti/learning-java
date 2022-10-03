// Tercer Día Clase 1 3-10-22

// Estructuras de control (Switch - Case)
import java.util.Scanner;

public class dia3c1 {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        int num_1 = 0, num_2 = 0, resultado = 0;
        int parametro = 0;

        System.out.println("Escoja una opción: \n 1 Para suma \n 2 Para resta \n 3 Para multiplicación \n 4 Para división");
        parametro = entrada.nextInt();
        System.out.println("");

        System.out.print("Introduce el primer valor: ");
        num_1 = entrada.nextInt();
        System.out.println("");

        System.out.print("Introduce el segundo valor: ");
        num_2 = entrada.nextInt();
        System.out.println("");

        // dentro del parentesis va un parametro, este puede ser char(caracter UNO SOLO) o int(numero)
        switch(parametro){
            // Instrucciones a realizar (cada case va con break, esto indica que ya se terminó de ejecutar, si no se pone el break sigue hasta que haya un break o finalice con una })
            case 1: resultado = num_1 + num_2;
                System.out.println("El resultado es: " + resultado);
                break;

            case 2: resultado = num_1 - num_2;
                System.out.println("El resultado es: " + resultado);
                break;

            case 3: resultado = num_1 * num_2;
                System.out.println("El resultado es: " + resultado);
                break;

            case 4: resultado = num_1 / num_2;
                System.out.println("El resultado es: " + resultado);
                break;

            // default es para cuando el usuario introduce un valor que no esta en los casos
            default: System.out.println("Error: La opción no existe: " + parametro);
                break;
        }
    }
}

// Codigo original del video
/*
public class Operaciones{
  public static void main(String args[]){

  int num_uno = 5, num_dos = 3, resultado = 0;
  int parametro = 10;

  switch(parametro){
   
   case 1: resultado = num_uno + num_dos;
           System.out.println("El resultado de la suma es: " + resultado);
           break;

   case 2: resultado = num_uno - num_dos;
           System.out.println("El resultado de la resta es: " + resultado);
           break;

   case 3: resultado = num_uno * num_dos;
           System.out.println("El resultado de la multiplicación es: " + resultado);
           break;

   case 4: resultado = num_uno / num_dos;
           System.out.println("El resultado de la división es: " + resultado);
           break;

   default: System.out.println("Error, la opción no existe");
            break;
  }
 }
}
 */