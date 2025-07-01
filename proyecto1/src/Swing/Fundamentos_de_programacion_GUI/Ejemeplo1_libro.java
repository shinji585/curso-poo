package Swing.Fundamentos_de_programacion_GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejemeplo1_libro extends JFrame{
    /*
     * en esta seccion se escribira el ejemplo mostrado por el libro de greetins para analizar el comportamiento de un oyente
     */

     private final static int WIDTH = 325;
     private final static int HEIGHT = 100;
     private JTextField namebox; 
     private JLabel greetings; 

     public Ejemeplo1_libro(){
        setTitle("Gretins");
        setLayout(new FlowLayout());
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createConstes();
        setVisible(true);
     }

     // creamos el metodo private createConstes()
     private void createConstes(){
        JLabel newPromp = new JLabel("¿como te llamas?");
        namebox = new JTextField(15);
        greetings = new JLabel();
        add(newPromp);
        add(namebox);
        add(greetings);
        namebox.addActionListener( new Listener());
     }

     private class  Listener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                String message;
                message = "Glad to meet you " + namebox.getText() + "!";
                namebox.setText("");
                greetings.setText(message);
            }
     } 
     public static void main(String[] args) {
        new Ejemeplo1_libro();
     }
}
