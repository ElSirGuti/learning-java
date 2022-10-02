// Segundo Día Clase 5 2-10-22

// Condiciones compuestas con operadores lógicos & relacionales

// Operadores relacionales

// Operador |      Nombre     |     Ejemplo     |        Significado       |
//    <     |     Menor que   |      5 < 4      |     5 es menor que 4     |
//    >     |     Mayor que   |      A > B      |     A es mayor que B     |
//    ==    |      Igual a    |      5 == 5     |      5 es igual a 5      |
//    !=    |     Diferente   |  perro != gato  | perro no es igual a gato |
//    <=    | Menor o igual a |     A <= B      | A es menor o igual que B |
//    >=    | Mayor o igual a |     A >=  B     | A es mayor o igual que B |

// Operadores lógicos

// Operador |  Nombre |            Ejemplo            |          Significado         |    ASCII  |
//    &&    |   AND   |  Haz la tarea && lava la ropa | Haz la tarea y lava la ropa  |  ALT + 38 |
//    ||    |   OR    |  Haz la tarea || lava la ropa | Haz la tarea o lava la ropa  | ALT + 124 |

// Práctica Propuesta

// La empresa Coca-Cola Company solicita un sistema que determine los días de vacaciones a
// los que tiene derecho un trabajador, tomando en cuenta las siguientes características

// Existen tres departamentos dentro de la empresa con sus respectivas claves:
//  1. Departamento de Atención al cliente. (Clave 1)
//  2. Departamento de Logística. (Clave 2)
//  3. Gerencia. (Clave 3)

// Trabajadores con clave 1 (Atención al cliente):
//  Con 1 año de servicio, reciben 6 días de vacaciones.
//  Con 2 a 6 años de servicio, reciben 14 días de vacaciones.
//  A partir de 7 años de servicio, reciben 20 días de vacaciones.

// Trabajadores con clave 2 (Logística):
//  Con 1 año de servicio, reciben 7 días de vacaciones.
//  Con 2 a 6 años de servicio, reciben 15 días de vacaciones.
//  A partir de 7 años de servicio, reciben 22 días de vacaciones.

// Trabajadores con clave 3 (Gerencia):
//  Con 1 año de servicio, reciben 10 días de vacaciones.
//  Con 2 a 6 años de servicio, reciben 20 días de vacaciones.
//  A partir de 7 años de servicio, reciben 30 días de vacaciones.

// Nota: El sistema debe de solicitar el "Nombre", "Clave del departamento" y "Antiguedad"
// del trabajador, posteriormente mostrar un mensaje que contenga el nombre del trabajador
// y los días de vacaciones a los que tiene derecho

import java.util.Scanner;

public class dia2c5 {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        int clave = 0, antiguedad = 0;

        System.out.println("*******************************************************");
        System.out.println("*Bienvenido al sistema vacacional de Coca-Cola Company*");
        System.out.println("*******************************************************");
        System.out.println("");
        System.out.println("");

        System.out.print("¿Cuál es el nombre del trabajador?: ");
        nombre = entrada.nextLine();
        System.out.println("");

        System.out.print("¿Cuánto años de servicio tiene el trabajador?: ");
        antiguedad = entrada.nextInt();
        System.out.println("");

        System.out.print("¿Cuál es la clave del trabajador?: ");
        clave = entrada.nextInt();
        System.out.println(""); 

        if(clave == 1){
            if(antiguedad == 1){
                System.out.println(nombre + " tiene derecho a 6 días de vacaciones.");
            } else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.print(nombre + " tiene derecho a 14 días de vacaciones.");
            } else if(antiguedad >= 7){
                System.out.print(nombre + " tiene derecho a 20 días de vacaciones.");
            }
        } else if(clave == 2){
            if(antiguedad == 1){
                System.out.println(nombre + " tiene derecho a 7 días de vacaciones.");
            } else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.print(nombre + " tiene derecho a 15 días de vacaciones.");
            } else if(antiguedad >= 7){
                System.out.print(nombre + " tiene derecho a 22 días de vacaciones.");
            }
        } else if(clave == 3){
            if(antiguedad == 1){
                System.out.println(nombre + " tiene derecho a 10 días de vacaciones.");
            } else if(antiguedad >= 2 && antiguedad <= 6){
                System.out.print(nombre + " tiene derecho a 20 días de vacaciones.");
            } else if(antiguedad >= 7){
                System.out.print(nombre + " tiene derecho a 30 días de vacaciones.");
            }
        } else{
            System.out.print("Error: La clave no pertenece a ningún departamento: " + clave);
        }
    }
}

// Lo hice bien sin ver el video :D