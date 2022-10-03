// Tercer Día Clase 4 3-10-22

// Estructura básica de "Do While"

// do{
//     Instrucción;
// } while(condición);

// El programa primero lee la condicion del while y luego realiza las instrucciones en do

// Ejemplo: Realizar un programa que imprima en pantalla la siguiente serie numérica:
//          1000, 800, 600, 400, 200, 0,

public class dia3c4 {
    public static void main(String args[]){

        int i = 1000;
        
        do{
            System.out.print(i + ", ");
            i-=200;
        }while(i>+0);
    }
}
