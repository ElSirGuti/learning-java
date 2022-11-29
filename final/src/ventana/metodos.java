// Primera evaluación 
// Trabajo realizado por Andrés Gutiérrez y Daniel Pérez
// Sección 204C2

/*
 * Elementos ordenados de mayor a menor mostrados en forma de array
 * Multiplicacion de los elementos de la diagonal principal
 * Division del elemento de mayor valor entre el numero de menor valor
 * Potencia del elemento mayor elevado a la 10
 */

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventana;

import java.util.*;
import java.math.BigInteger;

public class metodos {
    public static int[][] generarMatriz(int n){
        // Creamos la matriz
        int[][] matriz = new int[n][n];
        // Bucle para generar la matriz de forma aleatoria
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                // Condicion para poner numeros positivos y negativos
                if(Math.random() >= 0.5){
                    int numero = (int) (Math.random() * 1000) + 1;
                    matriz[i][j] = numero;
                } else {
                    int numero = (int) -(Math.random() * 1000)+ 1;
                    matriz[i][j] = numero;
                }
            } 
        }
        return matriz;
    } // Fin del metodo generarMatriz
    
    public static List<Integer> ordenar(int[][] matriz){
        // Ordenar la matriz
            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz.length; j++){
                    for(int x = 0; x < matriz.length; x++){
                        for(int y = 0; y < matriz.length; y++){
                            if(matriz[i][j] > matriz[x][y]){
                                int temp = matriz[i][j];
                                matriz[i][j] = matriz[x][y];
                                matriz[x][y] = temp;
                        }
                    }
                }
            }
        }
        // Imprimir la matriz en forma de vector
            List<Integer> vector = new ArrayList<>();
            for (int row = 0; row < matriz.length; row++) {
	        for (int col = 0; col < matriz[row].length; col++)
                    vector.add(matriz[row][col]);
        }
        return vector;
    } // Fin del metodo ordenar
    
    public static BigInteger productoDiagonal(int[][] matriz){
    BigInteger producto = new BigInteger("1");
    
        for (int i = 0; i < matriz.length; i++) {
            producto = producto.multiply(new BigInteger(Integer.toString(matriz[i][i])));
        }
    
    return producto;
    } // Fin del metodo productoDiagonal
    
    public static float division(int[][] matriz){
        //Iniciando variables
        float numeroMayor = matriz[0][0];
        float numeroMenor = matriz[0][0];

        // Parametro para hallar el valor mayor 
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
              if (matriz[x][y] > numeroMayor) {
                numeroMayor = matriz[x][y];
              }
              if (matriz[x][y] < numeroMenor) {
                numeroMenor = matriz[x][y];
              }
            }                
        }
        //Variables de la division
        float numerador = numeroMayor;
        float denominador = numeroMenor;
        float d = (numerador / denominador);
        
        return d;
    } // Fin del metodo division
    
    public static BigInteger potencia(int[][] matriz){
        int numeroMayor = matriz[0][0];
        int exponente = 10;
        BigInteger p;
        p = BigInteger.valueOf(numeroMayor);
        BigInteger potencia = p.pow(exponente);
        
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
              if (matriz[x][y] > numeroMayor) {
                numeroMayor = matriz[x][y];
              }
            }                
        }
      return potencia;  
    } // Fin del metodo potencia
}

