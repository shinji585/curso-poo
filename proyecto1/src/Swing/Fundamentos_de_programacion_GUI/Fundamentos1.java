package Swing.Fundamentos_de_programacion_GUI;


import java.awt.*;
import javax.swing.*;


public class Fundamentos1 extends JFrame{

    
    // creamos las constantes que definen el tamaño de la ventana 
    private static final int WIDTH = 250; 
    private static final int HEIGHT = 100;


    // creamos el constructor que contendra todos los componentes de nuestra ventana 
    public Fundamentos1(){
        setTitle("First Windows");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContesnts();
        setVisible(true);
    }


    private void createContesnts() {
        JLabel label = new JLabel("Hola mundo");
        add(label);
    }

    public static void main(String[] args) {
        new Fundamentos1();
    }

}
