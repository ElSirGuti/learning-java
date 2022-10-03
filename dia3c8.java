// Tercer Día Clase 8 3-10-22

// Manipulación de cadenas con los métodos length() & substring()

// Método length -> Indica cuantos caracteres posee una cadena de caracteres

//                      Carlos
//                      ^^^^^^
//                      123456

// Método substring -> permite obtener una parte en específico de la cadena de caracteres.
//                     substring(desde, hasta)

//                      0 1 2 3 4 5 6
//                      ^ ^ ^ ^ ^ ^ ^
//                      |C|a|r|l|o|s|

// Obtener
// desde: 0  ----> Carl
// hasta: 4 

// Ejercicio :
// Realizar un programa que solicite desde teclado una cadena de caracteres , posteriormente
// el programa debe indicar a través de un mensaje en pantalla , la cantidad de caracteres que
// posee dicha cadena . Finalmente el programa debe de preguntar al usuario , ¿ que parte de
// la cadena desea obtener ? tal y como se vio en el ejemplo pasado.

import java.util.Scanner;

public class dia3c8 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        int desde = 0, hasta = 0, cantidad_char = 0;

        System.out.println("Introduce una cadena de caracteres: ");
        cadena = entrada.nextLine();

        cantidad_char = cadena.length();

        System.out.println("El texto introducido posee " + cantidad_char + " caracteres");

        System.out.println("¿Qué parte de la cadena desea obtener?");
        System.out.print("Desde: ");
        desde = entrada.nextInt();
        System.out.print("Hasta: ");
        hasta = entrada.nextInt();

        System.out.println(cadena.substring(desde, hasta));

    }
}
