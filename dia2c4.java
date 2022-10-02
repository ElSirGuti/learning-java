// Segundo Día Clase 4 2-10-22

// Como introducir datos desde teclado con Scanner

import java.util.Scanner;

public class dia2c4 {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String nombre = "";
        int num1 = 0, num2 = 0, resultado = 0;

        System.out.println("¿Cuál es tu nombre?");
        // Siempre que sea texto tiene que ir <objeto>.nextLine si es un valor numerico <objeto>.nextInt
        nombre = in.nextLine();

        System.out.println("Introduce el primer valor: ");
        num1 = in.nextInt();

        System.out.println("Introduce el segundo valor: ");
        num2 = in.nextInt();

        resultado = num1 + num2;

        System.out.println("Hola " + nombre + " el resultado de la suma es: " + resultado);

    }
}
