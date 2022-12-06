// Segunda evaluación 
// Trabajo realizado por Andrés Gutiérrez y Daniel Pérez
// Sección 204C2

/*
 * Evaluar si el numero M es un numero primo
 * Mostrar la secuencia Fibonacci hasta el valor menor o igual al resultado  de N x M
 * Potencia de N elevado a la M
 * Suma de los digitos del valor de N x M
 * Factorial de N
 */
package interfaz;

import java.math.BigInteger;

public class metodos {
    public static boolean numeroPrimo(int num, int divisor){
        if(num/2 < divisor){
        return true;
        } else {
            if(num % divisor == 0){
                return false;
            } else {
                return numeroPrimo(num, divisor+1);
            }
        }
    } // Fin del metodo numeroPrimo
    /* Pegar esto en ventana
    int nxm = n * m;
    String strFibonacci = "";
    for (int i = 0; i < nxm; i++) {
        strFibonacci = metodos.fibonacci(i) + ",";      
    } jTextArea1.setText(strFibonacci);
    if(num == 0 || num == 1){
            return num;
        }
        else
            return fibonacci(num - 1) + fibonacci(num - 2);
    */
    
    public static BigInteger potencia(int base, int exponente){
        BigInteger p;
        p = BigInteger.valueOf(base);
        BigInteger potencia = p.pow(exponente);
        
        return potencia;
    } // Fin del metodo potencia
    
    public static int sumaDigitos(int num){
        if(num == 0){
            return 0;
        } else {
            return sumaDigitos(num/10) + num%10;
        }
    } // Fin del metodo sumaDigitos
    
    public static long factorial(int num){
        if(num == 0){
            return 1;
        }
        else
            return num * factorial(num-1);    
    } // Fin del metodo factorial 
}
