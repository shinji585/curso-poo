package Swing.Fundamentos_de_programacion_GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MasComponentes extends JFrame {
    /*
     * en esta seccion estudiara lo que seria el metodo getSource() que nos permite identificar que componente realizo una accion y enviar una respuesta ante este 
     * 
     */

     private final static int WIDTH = 350; 
     private final static int HEIGHT = 250; 

     // creamos lo que seria el frame 
     public MasComponentes(){
        setTitle("Mas componentes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(WIDTH,HEIGHT);
        createContest();
        setVisible(true);
     }

     // imaginemos que tenemos dos campos uno realiza una accion y otro realiza otra accion esos campos son botones 
     private JButton button1; 
     private JButton button2;
     private JLabel texto; 
     // y queremos que cada uno deveulva su respectivo texto si se hace boton en uno 
     public void createContest(){
        texto = new JLabel("haz click en cada uno veras un texto diferente");
        button1 = new JButton(); 
        button1.setText("click in me 1");
        button2 = new JButton();
        button2.setText("click in me 2");

        // ahora queremos definir las acciones para cada uno cuando se hagla click en cada texto siendo yo lo que haria es utilizar programacion funcional pero como estamos aprendiendo tenemos que crear una clase privada Listener que escuche y que devuelva una accion por el metodo actionPerfomed
       // button1.addActionListener(new Listener());
       // button2.addActionListener(new Listener());

       button1.addActionListener(new Listener2());
       button2.addActionListener(new Listener2());

        // utilizacion del metodo actionCommand
        button1.setActionCommand("tu mama");
        button2.setActionCommand("tu papa");
        // agregamos los componentes 
        add(texto);
        add(button1);
        add(button2);

     } 
     @SuppressWarnings("unused")
    private class Listener implements ActionListener{
        // definimos el metodo actionPerformed
        @Override
        public void actionPerformed(ActionEvent e){
            // ahora si nos ocupamos de identificar cada accion con el metodo getsource() y devolver una respuesta esto se hace ya que se hace una comparacion con las referncias en memoria 
            if (e.getSource() == button1){
                // en esta accion supongamos que el texto cambie a 
                texto.setText("tu maldita madre careverga");
                button1.setVisible(false);
            }else if (e.getSource() == button2){
              // en esta el texto sea 
              texto.setText("¿POR QUE ERES DEBIL BAKI ES TU CULPA POR SER DEBIL");
              button2.setVisible(true);
              button1.setVisible(true);
            }else{
                texto.setText("te quiero mucho");
            }
        }

     }

     // ademas de este metodo si necesitamos utilizar otro metodo el cual sea igualemente importante y que nos permita trabajar con valores en clases diferentes seria el actioncomman() tanto su set como su get el set es para asignarle un texto y el get es para obtener el texto 

     private class Listener2 implements ActionListener {
     
        @Override
        public void actionPerformed(ActionEvent e){
            // verificamos utilizando getactioncommand
            if (e.getActionCommand().equals("tu mama")){

                texto.setText("hola");
            }else if (e.getActionCommand().equals("tu papa")){
 
                texto.setText("adios");
            }
        }
        
     }

     public static void main(String[] args) {
        new MasComponentes();
     }

}
