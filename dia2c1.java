// Segundo Día Clase 1 2-10-22

// Operadores aritméticos y prioridad de los signos

// Operadores aritméticos

// Signo |   Nombre del Signo   |      Tipo de Operación      | Código ASCII |
//   +   |          Más         |            Suma             |   ALT + 43   |
//   -   |         Menos        |            Resta            |   ALT + 45   |
//   *   |       Asterisco      |        Multiplicación       |   ALT + 42   |
//   /   |    Diagonal o Slash  |           División          |   ALT + 47   |
//   ^   |   Acento Circunflejo |           Potencia          |   ALT + 94   |
//   (   |  Paréntesis Apertura | Prioridad entre operaciones |   ALT + 40   |
//   )   |  Paréntesis Apertura | Prioridad entre operaciones |   ALT + 41   |

// Prioridad entre operadores

// () Paréntesis > ^ Potencia >  * , / Multiplicación y División > + , - Suma y Resta

public class dia2c1 {
    public static void main(String args[]){

        int num_1 = 4;
        int num_2 = 4;
        int resultado_1 = 0;
        int resultado_2 = 0;

        resultado_1 = num_1 + num_2 / 2;
        System.out.println("El resultado es: " + resultado_1 );

        resultado_2 = (num_1 + num_2) / 2;
        System.out.println("El resultado usando paréntesis es: " + resultado_2);
        
    }    
}
