package Swing.Fundamentos_de_programacion_GUI;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Estudio_Del_Boton extends JFrame {
    /*
     * en esta seccion se estudiara el funcionamiento del boton y la forma correcta en que este debe ser utilizando 
     * 
     * 
     * el jbutton es un componente que por si solo no prepresenta una accion como tal para agregarle dichas acciones este debe tener lo que seria un oyente el cual este escuchando cuando se haga click sobre el y asi poder devolver una accion de respuesta a la que el usuario a ingresado 
     */

     private final static int WIDTH = 300; 
     private final static int HEIGHT = 300; 
     // creamos el constructor 
     public Estudio_Del_Boton(){
        setTitle("estudio_Button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        // definimos el layout manager 
        setLayout(new FlowLayout());
        ingresarMensaje();
        setVisible(true);
     }

     // creamos un metodo con un button que va a implementar una accion y un jtextfield 
     private JTextField texto; 
     private JButton button; 

     @SuppressWarnings("unused")
    public void ingresarMensaje(){
        // inicializamos el jtexfield y mostramos un texto mediante un jlabel 
        JLabel saludo = new JLabel("Numeros randoms");
        texto = new JTextField(15);
        texto.setToolTipText("Ingrese su nombre y nosotros te daremos un numero random segun la longitud de este");
        button = new JButton("ingrese nombre");

        // creamos unas acciones para el jbutton cuando este se presione deberia capturar el texto ingresado en el jtextfield 
        button.addActionListener(e -> {
            String nombre = texto.getText(); 

            // creamos un numero entero random segun la longitud del nombre o la palabra ingresada 
            Random rm = new Random();
            int numeroRandom = rm.nextInt(nombre.length());

            // ese numero random ahora lo pasamos el jlabel que estabamos utilizando y cambiamos la visialividad de el button y el jtextfield 
            saludo.setText("Su numero es: " +Integer.toString(numeroRandom));
            button.setVisible(false);
            texto.setVisible(false);
        });
        // agregamos los componentes 
        add(saludo);
        add(texto);
        add(button);
     }

     public static void main(String[] args) {
        new Estudio_Del_Boton();
     }
}
