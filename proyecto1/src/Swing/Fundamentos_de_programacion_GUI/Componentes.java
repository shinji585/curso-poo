package Swing.Fundamentos_de_programacion_GUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Componentes extends JFrame {
    /*
     * en esta seccion estudiaremos el funcionamiento del jframe y la forma correcta
     * de utilizarlo
     * los componentes que se estudiaran son jlabel,jtexfield,jbutton y los metodos
     * que a esta la componen
     * 
     */

    private static final int WIDTH = 300;
    private static String textoString;
    private static final int HEIGHT = 150;

    // creamos primero un constructor y creamos la ventana
    public Componentes() {
        setTitle("Windows 3");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // createJlabel();
        createJtextfield();
        setVisible(true);
    }

    // creamos el primer componente que vamos a estudiar
    private void createJlabel() {
        // el objecto jlabel es un componente que sirve solamente para mostrar
        // informacion atraves de texto, imagenes o ambas en una ventana
        JLabel label = new JLabel();
        // los metodos de jlabel son variados pero varios de estos son settext and
        // gettext
        label.setText("ejemplo de label");
        textoString = label.getText();
        // agregamos el texto a la ventana
        add(label); // este metodo agrega el componente a la ventana

        // otros metodos
        // ademas de los metodos señalados tenemos otros metodos que hacen que un jlabel
        // tenga mas funcionalidad metodos como setooltiptext,seticon and setforeground

        // vamos a explorar uno por uno acontinuacion primero vamos a comenzar por
        // seticon
        JLabel imagenLabel = new JLabel();

        imagenLabel.setIcon(new ImageIcon(
                "C:/Users/USUARIO/Desktop/curso-poo/proyecto1/src/Swing/Fundamentos_de_programacion_GUI/𝘚𝘶𝘱𝘦𝘳 𝘚𝘢𝘪𝘺𝘢𝘯 𝘎𝘰𝘬𝘶 𝘈𝘦𝘴𝘵𝘩𝘦𝘵𝘪𝘤 𝘐𝘤𝘰𝘯(𝘗𝘭𝘢𝘯𝘦𝘵 𝘕𝘢𝘮𝘦𝘬).jpg"));

        // agregamos la imagen a el frame
        add(imagenLabel);

        // para cambiar el color del texto utilizamos metodos como setforedground
        label.setForeground(new Color(0xF5332C)); // sun nos ofrece colores de forma predeterminada pero podemos
                                                  // establecer colores por uno mismo he aqui un ejemplo de ello

        // el otro metodo que estamos utilizando seria settooltiptext(String texto) que
        // nos ayuda a darle informacion de ayuda a el usuario para que este se pueda
        // guiar
        label.setToolTipText("hola se que estas viendo esto");

    }

    // segundo componente a estudiar jtextfield
    @SuppressWarnings("unused")
    private void createJtextfield() {
        /*
         * JTextField permite al usuario escribir texto de una línea.
         * Métodos clave:
         * 
         * getText(): obtiene el texto actual.
         * setText(String): coloca texto.
         * setEditable(boolean): permite o no la edición.
         * setVisible(boolean): muestra/oculta el campo.
         * addActionListener(...): ejecuta acción al presionar Enter.
         * 
         * Muy útil para formularios, búsquedas, entradas de datos, etc esta clase nos ayuda a resivir informacion del usuario y poder crear una interaccion 
         * 
         * 
         */
        JTextField textField = new JTextField("ingrese un numero por favor",20);
        JTextField textField2 = new JTextField("ingrese un segundo numero por favor", 20);
        JLabel mostrarSuma = new JLabel("aqui se mostrara la suma");
        JButton sumar = new JButton("sumar numeros");

        sumar.addActionListener(e ->{
            try {
                // sumamos los numeros
                int numero1 = Integer.parseInt(textField.getText());
                int numero2 = Integer.parseInt(textField2.getText());
                int suma = numero1 + numero2; 
                mostrarSuma.setText(Integer.toString(suma));
            } catch (Exception c) {
                System.out.println("error de tipo: " + c.getLocalizedMessage());
            }
        });

        add(textField);
        add(textField2);
        add(sumar);
        add(mostrarSuma);

    }

    public static void main(String[] args) {
        new Componentes();

        System.out.println(textoString);
    }
}
