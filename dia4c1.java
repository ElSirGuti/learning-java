// Cuarto Día Clase 1 4-10-22

// Arreglos bidimensionales (Matrices)

//     |  0     |    1   |    2    |     3   |
//  > 0|Juan    |  Luis  |Guillermo|  Pedro  |
//    1|Gerardo | Esteban|  Mario  |   Ana   |
//    2|Fernando| Carlos | Ernesto |  Carmen |
//    3|Eduardo |Santiago|  Noemi  |  Maria  |
//         ^

// ^ Índice i -> Posición 0
// > Índice j -> Posición 0

// Ejercicio
// Crear un programa que muestre en pantalla una Matriz de 2 Filas y 2 Columnas con un
// numero dentro de cada posición tal y como se muestra a continuación:
//                              [5][2]
//                              [2][5]


public class dia4c1 {
    public static void main(String args[]){

        int numeros [][] = new int[2][2];

        numeros [0][0] = 5;
        numeros [0][1] = 2;
        numeros [1][0] = 2;
        numeros [1][1] = 5;

        System.out.print("[" + numeros [0][0] + "]");
        System.out.println("[" + numeros [0][1] + "]");
        System.out.print("[" + numeros [1][0] + "]");
        System.out.print("[" + numeros [1][1] + "]");
    }
}
