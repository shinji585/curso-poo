package Swing.Fundamentos_de_programacion_GUI;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Action_Listener_Profundizacion extends JFrame{
      /* 
       * en esta seccion en el dia de hoy profundizaremos en lo que seria las actions en java swing la forma en que se da y la estructura correcta 
       * 
       * 
       * estas acciones se dan en el marco de un oyente es decir son las respuestas a las acciones que los usuarios van a comenter en nuestros programas y la forma de implementarlos es muy facil 
       */

       /*
        * va,mos a realizar un ejemplo para comprender aun mas esto
        */

        private final static int WIDTH = 500;
        private final static int HEIGHT = 300;
        private Animal animal;
        private JLabel mensaje_Mostrador;
        private JTextField namesbox;
        private JTextField edadbox;


        public Action_Listener_Profundizacion(){
            setTitle("actions example");
            setLayout(null);
            setSize(WIDTH,HEIGHT);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            createContes();
            setVisible(true);
        }

        // creamos ahora un constes es decir una ventana en donde mostraremos informacion apartir de lo que estamos haciendo 
        @SuppressWarnings("unused")
        private void createContes(){
            animal = new Animal();
            JLabel label = new JLabel("Hola bienvenido a crar tu mascota");
            label.setBounds(50, 20, 300, 30);
            namesbox = new JTextField(15);
            namesbox.setBounds(50, 70, 150, 25);
            mensaje_Mostrador = new JLabel();
            mensaje_Mostrador.setBounds(50, 110, 300, 25);
            namesbox.setToolTipText("ingrese el nombre de su mascota");
            edadbox = new JTextField(15);
            edadbox.setBounds(220, 70, 100, 25);
            edadbox.setToolTipText("ingrese la edad de su mascota");
            // ahora creamos un button para cuando se envie este haga una accion
            JButton button_enviar = new JButton("enviar informacion");
            button_enviar.setBounds(150, 150, 120, 30);
            add(label);
            add(namesbox);
            add(mensaje_Mostrador);
            add(edadbox);
            add(button_enviar);

            // otra forma sin tener que crear clases internas o tener que crear clases anonimas y de forma mas rapida es aplicando programacion funcional en todo esto y simplemente haciendo la accion que queremos ejercutar

          //  button_enviar.addActionListener(new Listener()); ejemplo con clase privada 
          // ejemplo con programacion funcional 
          button_enviar.addActionListener(e -> {
            // algo que es mucho mas compacto y mas rapido que tener que estar escribiendo clases tras clases cuando solo vamos a utilizarla en un contexto cuando se quiera utilizar en multiples objectos para ello tenemos que utilizar si una clase privada 
             StringBuilder mensajeString;
                animal.setNombreString(namesbox.getText());
                animal.setEdad(Integer.parseInt(edadbox.getText()));

                mensajeString = new StringBuilder();
                mensajeString.append("Su mascota se llama " + animal.getNombreString() + " y tiene una edad de " + animal.getEdad());

                // pasamos ahora el mensaje a el jlabel 
                // y reiniciamos los jtextfield 
                namesbox.setText("");
                edadbox.setText("");
                mensaje_Mostrador.setText(mensajeString.toString());
          });
        }

        @SuppressWarnings("unused")
        private class Listener implements ActionListener{
            // creamos el action perfomed
            public void actionPerformed(ActionEvent e){
                StringBuilder mensajeString;
                animal.setNombreString(namesbox.getText());
                animal.setEdad(Integer.parseInt(edadbox.getText()));

                mensajeString = new StringBuilder();
                mensajeString.append("Su mascota se llama " + animal.getNombreString() + " y tiene una edad de " + animal.getEdad());

                // pasamos ahora el mensaje a el jlabel 
                // y reiniciamos los jtextfield 
                namesbox.setText("");
                edadbox.setText("");
                mensaje_Mostrador.setText(mensajeString.toString());
            }
        }

        

       public static void main(String[] args) {
        new Action_Listener_Profundizacion();
    }
}
@AllArgsConstructor @ToString @EqualsAndHashCode @Getter @Setter @NoArgsConstructor
class Animal{
    private int edad;
    private String nombreString;
}