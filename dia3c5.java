// Tercer Día Clase 5 3-10-22

// Ejercicios para el desarrollo de la lógica

// Realizar las siguientes series numericas utilizando las estructuras repetitivas for, while
// y do-while:
// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
// 1, 99, 2, 98, 3, 97, 4, 96, 5, 95

public class dia3c5{
    public static void main(String args[]){
    
    int i = 0;
  
    System.out.println("Serie con for: ");
    for(i = 1; i <= 10; i++){
    if(i < 10){
    System.out.print(i + ",");
    } else {
    System.out.print(i); 
    }
    }
    i = 1; 
    System.out.println("");
  
    System.out.println("Serie con while: ");
    while(i <= 10){
    if(i < 10){
    System.out.print(i + ",");
    } else {
    System.out.print(i); 
    }
    i++;
    }
    i = 1;
    System.out.println("");
  
    System.out.println("Serie con do-while: ");
    do{
    if(i < 10){
    System.out.print(i + ",");
    } else {
    System.out.print(i); 
    }
    i++;
    }while(i <= 10);
    
    System.out.println("");  
    i = 1;
    int j = 99;
      
    System.out.println("Serie con for: ");
    for(i = 1; i <= 5; i++){
        if(i < 5){
        System.out.print(i + ",");
        System.out.print(j + ",");    
        } else {
        System.out.print(i + ",");    
        System.out.print(j);
        }
        j--;
    }
    System.out.println("");
      
    i = 1;
    j = 99;
      
    System.out.println("Serie con while: "); 
    while(i <= 5){
    if(i < 5){
        System.out.print(i + ",");
        System.out.print(j + ",");    
        } else {
        System.out.print(i + ",");    
        System.out.print(j);
        }
        i++;
        j--;
    }
    System.out.println("");
      
    i = 1;
    j = 99;
      
    System.out.println("Serie con do-while: "); 
    do{
        if(i < 5){
        System.out.print(i + ",");
        System.out.print(j + ",");    
        } else {
        System.out.print(i + ",");    
        System.out.print(j);
        }
        i++;
        j--;
    }while(i <= 5);
    }
}