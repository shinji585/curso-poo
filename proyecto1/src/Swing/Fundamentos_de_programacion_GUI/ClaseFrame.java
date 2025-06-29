package Swing.Fundamentos_de_programacion_GUI;

import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClaseFrame {
    /*
     * en esta seccion se estudiara la clase jframe y todos los metodos que a esta
     * la componente y como utilizarala correctamente
     */

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame(); // creamos una instancia del jframe sin utilizarla en una clase
        /*
         * las acciones de un jframe son las siguientes:
         * Crea la ventana principal de tu aplicación.
         * Aloja el resto de los componentes: cualquier cosa que quieras mostrar
         * (botones, textos, menús, imágenes) la vas a “agregar” a tu JFrame.
         * Controla el comportamiento de la ventana: puedes definir el tamaño, el
         * título, el layout, qué pasa al cerrar la ventana, etc.
         * Permite crear múltiples ventanas: no estás limitado a una sola, puedes tener
         * varias instancias de JFrame si tu aplicación lo necesita.
         * 
         * 
         * los metodos clave de la clase jframe son:
         * setTitle(String texto): Establece el título de la ventana.
         * setSize(int ancho, int alto): Define el tamaño de la ventana.
         * setLayout(LayoutManager manager): Decide cómo se colocan los componentes
         * dentro de la ventana.
         * add(Component comp): Agrega un componente (botón, etiqueta, etc.) a la
         * ventana.
         * setDefaultCloseOperation(int operacion): Define qué ocurre cuando el usuario
         * cierra la ventana (por ejemplo, terminar el programa).
         * setVisible(boolean visible): Muestra u oculta la ventana.
         * 
         */

        // hay dos formas de crear jframe primero exploramos creando un objecto y
        // dandole valores
        // mas arriba se pueden leer algunos de los metodos principales que tiene el
        // jframe y se estudiara uno por uno acontinuacion

        // 1. darle un titulo a el jframe utilizamos setTItle()

        frame.setTitle("second windows");

        // 2. para darle un altura y anchura a nuestro contenedor podemos definir
        // constantes y pasarle los valores a estos pueden ser constantes o pueden ser
        // estaticos

        final int altura = 400;
        final int anchura = 500;

        // pasamos la altura y anchura utilizando el metodo size()
        frame.setSize(anchura, altura); // el primer parametro representa la anchura el segundo representa la altura en
                                        // pixeles

        // el layout es la disposicion y organizacion de elementos visuales dentro de un
        // espacio o diseño, ya sea una pagina web, un espacio fisico, una interfaz de
        // usuario (como la que hacemos aqui) o un documento entonces si el layout
        // define la forma en como se comporta nuestros elementos del jframe como
        // definimos ese comportamiento bueno esto lo hacemos con el metodo setlayout
        frame.setLayout(new FlowLayout()); // un manager es un gestor de distribuccion de los componentes dentro del
        // contenedor (jframe) entre los tipos de organizaciones tenemos
        /*
         * Tipos comunes de Layout Manager
         * 
         * FlowLayout:
         * Coloca los componentes en una fila, como las palabras en un renglón, de
         * izquierda a derecha y de arriba hacia abajo si se llena.
         * 
         * BorderLayout:
         * Divide el espacio en 5 regiones: North, South, East, West y Center. Cada
         * componente va a una región.
         * 
         * GridLayout:
         * Coloca los componentes en una cuadrícula (tabla) de filas y columnas iguales.
         * 
         * BoxLayout:
         * Acomoda los componentes en una sola fila o una sola columna.
         */

        JLabel label = new JLabel();
        label.setText("good morning word");

        // con el metodo add pasamos informacion elementos a lo que seria el jframe
        frame.add(label);

        // para definir que ocurre cuando el usuario cierra la ventana utilizamos
        // metodos como setDefaultCloseOperation(int operacion)

        /*
         * el metodo setdefaultCloseOperations nos da las siguientes opciones:
         * 
         * 
         * setDefaultCloseOperation() define qué sucede al cerrar la ventana.
         * Las opciones principales son:
         * EXIT_ON_CLOSE: termina el programa.
         * DISPOSE_ON_CLOSE: cierra solo esa ventana.
         * HIDE_ON_CLOSE: oculta la ventana.
         * DO_NOTHING_ON_CLOSE: no hace nada.
         * 
         */

         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // sale del programa una vez que se presione la x 

         // para que nuestro programa sea visiable utilizamos setvisible y le pasamos true 
         frame.setVisible(true);

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("quieres ver la ventana numero 2: ");
         boolean option = Boolean.parseBoolean(br.readLine());

         if (option){
            new Frame2();
         }else{
            System.out.println("gracias por utilizar el programa");
         }
    }

   
}


// la segunda forma de crear un jframe es creando una clase que extiende de jframe 
class Frame2 extends JFrame{
  // creamos las constantes 
  private static final int anchuara = 400; 
  private static final int altura = 300; 

  // creamos el constructor 
  public Frame2(){
    setTitle("frame 2");
    setSize(anchuara,altura);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    agregarComponente();
    setVisible(true);
  }


  private void agregarComponente(){
    JLabel label = new JLabel();
    label.setText("presione el boton :)");
    JButton button = new JButton();
    button.setText("click me");
    add(label);
    add(button);
  }
}