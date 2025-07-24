package Swing.Fundamentos_de_programacion_GUI.CursoVisual;

import javax.swing.*;
import java.awt.*;

public class Ejemplo1Curso {
  // vamos a estudiar en esta seccion lo que seria los jframe en mas profundida

    public static void main(String[] args) {
         createWindow();
    }

    private final static int WIDTH = 300;
    private final static int HEIGHT = 250;
    // creamos un metodo el cual contiene la ventana que es una ventana principal de todo el scenerario que nosotros queremos tener para nuestro proyecto
    public static  void createWindow(){
        // creamos una instancia del jframe
        JFrame jframe = new JFrame();

        // a esta instancia le daremos los valores que conocemos por defecto del libro
        jframe.setTitle("ejemplo curso");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(WIDTH,HEIGHT);
        jframe.setLayout(new FlowLayout());
        // acontinuacion se estudiaran algunos metodos nuevos
        jframe.setVisible(true);
    }
}
