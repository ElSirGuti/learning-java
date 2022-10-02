// Primer Día Clase 2 1-10-22

// Tipos de Datos y Variables

// Tipos de Datos
// Primitivos
//  Enteros
//      byte (-128 hasta 127)
//      short (-32,768 hasta 32,767)
//      int (-2,147,483,648 hasta 2,147,483,647)
//      long (muy grande...)
//
//  Decimales
//      float: Aloja 8 valores decimales
//      double: Aloja 15 valores decimales
//
//  Otros
//      char (un solo caracter)
//      boolean (true | false)
//
// Objeto
//  String (cadenas de texto)
//      Ejemplo: "Hola Mundo"
//
// Variable ejemplo
//  Tipo: int
//  Nombre: num1 o numuno o num_uno o num_Uno o num_1

// En este programa haremos una suma

public class dia1c2 {
    public static void main(String args[]){
        int num_1     = 5;
        int num_2     = 2;
        int resultado = 0;

        resultado = num_1 + num_2;
        System.out.println("El valor de la suma es: " + resultado);
    }
}