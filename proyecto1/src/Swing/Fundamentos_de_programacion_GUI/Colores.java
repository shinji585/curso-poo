package Swing.Fundamentos_de_programacion_GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Colores extends JFrame{
 
    /*
     * en esta seccion estudiaremos los colores y la forma en que estos se dan en java swing 
     * antes de continuar toca aclarar que los colores se pueden definir de varias formas unas mas basicas y otras mas avanzadas 
     */

     // creamos la anchura y altura de la pantalla 
     private final static int WIDTH = 300; 
     private final static int HEIGHT = 250; 
     // creamos el constructoir 
     public Colores(){
        setTitle("colores-java");
        setSize(WIDTH,HEIGHT);
        setLayout(new FlowLayout());
        // si queremos cambiar el color del jframe tenemos que utilizar el metodo getcontentpane() y acceder dentro de el con el . a setbackground 
        getContentPane().setBackground(Color.decode("#FAD02E"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createConstes();
        setVisible(true);
     }

     // creamos un metodo y definimos varios botones 
     @SuppressWarnings("unused")
    public void createConstes(){
        JButton btn1 = new JButton("click me 1");
        JButton btn2 = new JButton("click me 2");
        JButton btn3 = new JButton("click me 3");

        // a estos botones nosotros podemos darle colores ya sabemos que podemos definri acciones en ellos utilizando varias estructuras utilizar los getsource o actionperforme pero tambien tenemos metodos de colores por ejemplo cambiemos el color de cada boton cuando se haga click en cada uno 
        btn1.addActionListener(e -> {
            // cambiamos el color cuando se haga click 
            btn1.setBackground(Color.DARK_GRAY);
            btn1.setForeground(Color.white);
        });

        btn2.addActionListener(e -> {
            // cambiamos el color utilizando rgb 
            btn2.setBackground(new Color(33, 47, 60));
            btn2.setForeground(new Color(238, 243, 249));

            // ahora imaginemos que cuando se haga click en el 2 se cree un nuevo boton y este ahora tena un color pero este se da en formato hexadecimal 
            btn3.addActionListener(i -> {
                // cambiamos el color utilizando hexadecimal
                btn3.setBackground(Color.decode("#622872"));
                btn3.setForeground(Color.decode("#c8ddea"));
            });
        });

        add(btn1);
        add(btn2);
        add(btn3);
     }
     public static void main(String[] args) {
        new Colores();
     }
}
