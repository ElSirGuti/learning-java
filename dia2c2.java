// Segundo Día Clase 2 2-10-22

// Estructuras condicionales if-else

// Condiciones

// Situación: Realizar un programa que calcule el promedio final de tres materias y que el
//            programa nos indique si el alumno aprobó o reprobó
//            Las calificaciones son: 
//            Matemáticas: 5
//            Biología: 8
//            Química: 7
// Condición: El promedio mínimo para aprobar es 6

public class dia2c2 {
    public static void main(String args[]){
        int Matemáticas = 5;
        int Biología = 8;
        int Química = 7;
        float Promedio = 0;

        Promedio = (Matemáticas + Biología + Química) / 3;

        if(Promedio >= 6){
            System.out.println("EL alumno aprobó con: " + Promedio);
        } else {
            System.out.println("El alumno reprobó con: " + Promedio);
        }
        
    }
    
}
