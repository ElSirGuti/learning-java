// Tercer Día Clase 7 3-10-22

// Cadenas de caracteres con el método equals

// String -> Permite declarar variables para alojar cadenas de caracteres (Texto).

// Declarar una variable
// int numero = 0;
// String nombre = "";

// Comparar valores
// numero == 9;
// nombre == "Juan";
// nombre.equals("Juan");

// Ejercicios:
//  1. Realizar un programa que compare dos nombres para verificar que son iguales,
//     mostrando un mensaje en pantalla al final que diga: los nombres son iguales / los
//     nombres son diferentes.
//     Nota: Los nombres debe de introducirlos el usuario desde el teclado.

//  2. Realizar un programa que simule un inicio de sesión solicitando el nombre de usuario
//     y la contraseña, para posteriormente compararlos y mostrar un mensaje en pantalla que
//     diga: inicio de sesión correcto / nombre de usuario o password incorrectos.
import java.util.Scanner;

public class dia3c7 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        String nombre_1 = "", nombre_2 = "";

        System.out.println("Introduce el primer nombre: ");
        nombre_1 = entrada.nextLine();

        System.out.println("Introduce el segundo nombre: ");
        nombre_2 = entrada.nextLine();

        if(nombre_2.equalsIgnoreCase(nombre_1)){
            System.out.println("Los nombres son iguales");
        }else{
            System.out.println("Los nombres son diferentes");
        }
        System.out.println("");
        // Ejercicio 2:
        String nombre = "", username = "", password = "", usuario = "", clave = "";

        System.out.println("=======================");
        System.out.println("=Procede a registrarte=");
        System.out.println("=======================");
        System.out.println("");

        System.out.print("Introduce tu nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Crea tu nombre de usuario: ");
        username = entrada.nextLine();
        System.out.print("Crea tu contraseña: ");
        password = entrada.nextLine();
        System.out.println("");

        System.out.println("====================");
        System.out.println("=¡Registro exitoso!=");
        System.out.println("====================");
        System.out.println("");

        System.out.println("===============");
        System.out.println("=Inicia Sesión=");
        System.out.println("===============");
        System.out.println("");

        System.out.print("Usuario: ");
        usuario = entrada.nextLine();
        System.out.print("Contraseña: ");
        clave = entrada.nextLine();
        System.out.println("");

        if(usuario.equals(username) && clave.equals(password)){
            System.out.println("============================");
            System.out.println("=¡Inicio de Sesión exitoso!=");
            System.out.println("============================");
            System.out.println("");
        }else{
            System.out.println("====================================");
            System.out.println("=¡Usuario o contraseña incorrectos!=");
            System.out.println("====================================");
            System.out.println("");
        }

    }
}

// Quise intentar usar un switch para seleccionar cual de los dos modulos usar pero por alguna razon en la primera opcion no me dejaba
// introducir algun valor
// Ejemplo: con la primera salia "Introduce el primer nombre: Introduce el segundo nombre: ", lo mismo pasaba con el segundo
// se saltaba el "Introduce tu nombre: " y de una iba con el "Crea tu nombre de usuario: ", lo pudiera hacer con ifs pero yo queria hacerlo con switch ya que es algo nuevo
// los ifs ya los se manejar desde python :)

