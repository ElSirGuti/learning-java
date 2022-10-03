// Tercer Día Clase 9 3-10-22

// Arreglos unidimensionales (Vectores)

// ¿Qué es un arreglo?
// Un arreglo es una estructura de datos que almacena bajo el mismo nombre a una colección de datos.

// Lista de alumnos ---------> Nombre de la colección de datos

// # de Lista | Nombre    |
//      1     | Juan      |
//      2     | Guillermo | ------> Colección de datos
//      3     | Ana       |
//      4     | Luis      |

// Los arreglos se caracterizan por:
// 1. Almacenar los elementos en posiciones contiguas de memoria.
// 2. Tienen un mismo nombre de variable que representa a todos los elementos.
// 3. Los elementos son asignados a una posición dentro del vector.

// Lista de alumnos ---------> Nombre de la colección de datos
// # de Lista | Nombre    | 
//      1     | Juan      | ------> Posición 1
//      2     | Guillermo | ------> Posición 2
//      3     | Ana       | ------> Posición 3
//      4     | Luis      | ------> Posición 4

// 4. Los arreglos trabajan en conjunto con índices que especifican la posición de cada elemento dentro del
//    arreglo.

// Tenemos dos tipos de arreglos
// 1.- Arreglos unidimensionales mejor conocidos como "Vectores"
// [ ,  ,  ,  ,  ]
// 2.- Arreglos bidimensionales mejor conocidos como "Matrices"
// [ ,  ,  ,  ,  ]
// [ ,  ,  ,  ,  ]
// [ ,  ,  ,  ,  ]
// [ ,  ,  ,  ,  ]

// Vectores (Arreglos unidimensionales)
// Representación gráfica de un vector:

// [Juan, Guillermo, Ana, Luis, Pedro]

// Longitud o tamaño de un vector

// [Juan, Guillermo, Ana, Luis, Pedro]
//    0       1       2     3     4   
// Está dividido en 5 secciones y a cada sección se le conoce como posición

// Índice de un Vector
// Representación gráfica de un índice:

//          Tipo de dato   Nombre del   Valor inicial
//  ^        del índice      índice      del índice
//              int        indice_uno        = 0;

//    0       1       2     3     4   
// [Juan, Guillermo, Ana, Luis, Pedro]
//    ^

// Sintaxis para programar un Vector

// int nombre[] = new int [5];
// Representación gráfica:
// [ ,  ,  ,  ,  ]

// Comportamiento estático de un índice: No se moverá el índice a menos que se le indique
// [            ,             ,             ,             ,             ]
//       ^  ------------------------------------- ^
//              Mover índice a la posición 3

// Como introducir datos a un Vector
// numeros[2] = 8;
//  vector      elemento a guardar
//       posicion
// [ ,  , 8,  ,  ]

// Como imprimir datos de un Vector
// [ 5, 220, 8, 458, 22]
//   0   1   2   3   4
// System.out.println(numeros[3]);
// >>> 458

// Crear un vector de cinco posiciones, posteriormente guardar un número
// en cada una de las posiciones del vector, y finalmente imprimir en
// pantalla cada una de las posiciones para verificar que se hayan guardado
// los números de manera correcta.

public class dia3c9 {
    public static void main(String args[]){

        int numeros[] = new int[5];

        numeros[0] = 5;
        numeros[1] = 220;
        numeros[2] = 8;
        numeros[3] = 458;
        numeros[4] = 22;

        System.out.print("[" + numeros[0] + "]");
        System.out.print("[" + numeros[1] + "]");
        System.out.print("[" + numeros[2] + "]");
        System.out.print("[" + numeros[3] + "]");
        System.out.print("[" + numeros[4] + "]");
    }
}
