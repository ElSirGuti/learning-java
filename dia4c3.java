// Cuarto Día Clase 3 4-10-22

// Interfaces gráficas (Librería swing)

// ¿Qué es una Interfaz Gráfica?
// Es un programa informático que facilita el entorno a el usuario al momento de manipular
// el programa.

// Se pone asterisco para trabajar con toda la libreria swing
import javax.swing.*;

// Para trabajar con GUI agregamos dos palabras mas "extends" (importa clases que hayan
// hecho otras personas) y "JFrame" (permite crear interfaces graficas) (swing aporta
// los elementos para trabajar con GUI).
public class dia4c3 extends JFrame{
    // Crea etiquetas JLabel <nombre> *usar con modificador de acceso private*
    private JLabel label1;
    // Constructor: le dice a java que tiene que hacer todo eso
    // el nombre tiene que ser el mismo de la clase
    public dia4c3(){
        //Le indica al programa donde ubicar las cosas con coordenadas
        //(para evitar que las ponga donde quiera ponemos null)
        setLayout(null);
        label1 = new JLabel("Hola Mundo");
        // X, Y, ancho, alto
        label1.setBounds(10,20, 200, 300);
        // indica al programa que todo eso va en una etiqueta
        add(label1);
    }  
    public static void main(String args[]){
        // Creamos el objeto con el mismo nombre de la clase y el constructor
        dia4c3 formulario1 = new dia4c3();
        // Llamamos al objeto
        formulario1.setBounds(0,0,400,300);
        // Indicar que es visible. true: se ve. false: no se ve.
        formulario1.setVisible(true);
        // Indicar que aparezca en el centro de la pantalla
        formulario1.setLocationRelativeTo(null);
    }
}
