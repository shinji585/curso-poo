package Swing.Fundamentos_de_programacion_GUI;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ventanas_De_Dialogo extends JFrame{
    /*
     * en esta seccion se estudiaran las ventanas de dialogo su funcionamiento y ademas de eso se estudiara la forma correcta en que se debe utilizar el JoptionPane que es para enviarle mensajes de alerta a el usuario 
     */

     public static void main(String[] args) {
        // este ejemplo del joptionpane sera rapido se utiliza para mostrar mensajes de dialogos no profundizare mucho de este aqui por que es algo sencillo y lo cual aprender de el sin profundizar ni matarme estudiando sus metodos ni nada de el 
        JOptionPane.showMessageDialog(null, "hola este es mi primer JOptionPane", "first JOptionPane", JOptionPane.INFORMATION_MESSAGE); // null quiere decir que el mensaje se mostrara en la ventana el segundo parametro representa el mensaje que queremos mostrar el tercero es el titulo del  joptionpane y el ultimo es el icono que queremos que muestre 
     }
}
