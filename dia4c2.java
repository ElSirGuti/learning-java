// Cuarto Día Clase 2 4-10-22

// Arreglos bidimensionales (Matrices dinámicas)

// Filas = 3
// Columnas = 3
// Contador = 1

// int numeros[][] = new int[filas][columnas];

// for (int = j; j < filas; j++) {
//    for(int i = 0; i < columnas; i++){
//        numeros[j][i] = contador;
//        contador += 1;
//        System.out.pritn("[" + numeros[j][i] + "j");
//    }
//    System.out.println("");
// }
import java.util.Scanner;

public class dia4c2 {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        int filas = 0, columnas = 0, contador = 1;

        System.out.print("Filas: ");
        filas = entrada.nextInt();
        System.out.print("Columnas: ");
        columnas = entrada.nextInt();


        int numeros[][] = new int[filas][columnas];

        for (int j = 0; j < filas; j++) {
            for(int i = 0; i < columnas; i++){
                numeros[j][i] = contador;
                contador += 1;
                System.out.print("[" + numeros[j][i] + "]");
            }
            System.out.println("");
         }
    }
}
