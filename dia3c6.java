// Tercer Día Clase 6 3-10-22

// Sucesión de Fibonacci

// Realizar un programa que imprima en pantalla la sucesión Fibonacci utilizando las
// estructuras repetitivas: for, while y do-while

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

public class dia3c6 {
    public static void main(String args[]){
        int a = 0, b = 1, c = 0;
        System.out.println("Ciclo con for:");
        for(int i=0; i < 10; i++){
            if(i < 9){
                System.out.print(a + ", ");
            } else {
                System.out.print(a);
            }
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("");
        System.out.println("Ciclo con while:");
        int i = 0;
        a = 0;
        b = 1;
        c = 0;

        while(i<10){
            if(i < 9){
                System.out.print(a + ", ");
            } else {
                System.out.print(a);
            }
            c = a + b;
            a = b;
            b = c;
            i += 1;
        }
        i = 0;
        a = 0;
        b = 1;
        c = 0;
        System.out.println("");
        System.out.println("Ciclo con do-while:");
        do{
            if(i < 9){
                System.out.print(a + ", ");
            } else {
                System.out.print(a);
            }
            c = a + b;
            a = b;
            b = c;
            i += 1;
        }while(i<10);
    }
    
}
