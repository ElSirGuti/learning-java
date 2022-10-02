// Segundo Día Clase 3 2-10-22

// Estructuras condicionales anidadas con if-else

// Realizar un programa que pueda realizar una suma, una resta, una multiplicación o
// una división de dos números enteros, dependiendo de la decisión del usuario:
// Si operación es igual a 1, realizar una suma
// Si operación es igual a 2, realizar una resta
// Si operación es igual a 3, realizar una multiplicación
// Si operación es igual a 4, realizar una división

public class dia2c3{ 
    public static void main(String args[]){ 
  
    int Operación = 1;
    int num_1 = 8;
    int num_2 = 4;
    int resultado = 0;
  
    if(Operación == 1){
        resultado = num_1 + num_2;
        System.out.println("El resultado de la suma es: " + resultado);
    } else if(Operación == 2){ 
        resultado = num_1 - num_2;
        System.out.println("El resultado de la resta es: " + resultado);
     } else if(Operación == 3){ 
        resultado = num_1 * num_2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    } else if(Operación == 4){ 
        resultado = num_1 / num_2;
        System.out.println("El resultado de la división es: " + resultado);
    } else { 
        System.out.println("La opción que elgiste no existe: " + Operación);
    }
   }
}