// Tercer Día Clase 10 3-10-22

// Arreglos unidimensionales (Vectores dinámicos)
// No necesita que le indiques al índice que posiciones debe recorrer, lo hace solo
// haciendo uso del for

// int numeros[] = new int[5];
//               0          5        0
//for(int i = 0; i < numeros.length; i++){
//  numeros[i]= i + 10;
//}

// Realizar un programa que contenga un vector cuya longitud sea proporcionado por el
// usuario , posteriormente solicitar al usuario los números necesarios para llenar todas las
// posiciones del vector , es decir , si el usuario solicito un arreglo de 10 posiciones , entonces el
// programa deberá de solicitarle al usuario 10 números , y finalmente se debe de imprimir el
// arreglo en pantalla de la siguiente manera :
//                [ 5 ] [ 54 ] [ 12 ] [ 65 ] [ 6 ] [ 54 ] [ 897 ]
import java.util.Scanner;

public class dia3c10 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int tamaño = 0, i = 0;

        System.out.print("¿Cuantos números quieres introducir?: ");
        tamaño = entrada.nextInt();

        int arreglo[] = new int[tamaño];
        
        for(i=0; i < arreglo.length; i++){
            System.out.print("Introduce el dato " + (i + 1)+ ": ");
            arreglo[i] = entrada.nextInt(); 
        }
        for(i=0; i < arreglo.length; i++){
            System.out.print("[" + arreglo[i] + "]");
        }

    }
}
