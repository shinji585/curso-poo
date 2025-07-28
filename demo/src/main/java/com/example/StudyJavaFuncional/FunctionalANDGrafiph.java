package com.example.StudyJavaFuncional;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class FunctionalANDGrafiph extends JFrame{
    /*
     * en esta seccion se estudiara la forma en que se da lo que hemos estudiando hasta ahora de los genericos y lo que viene siendo el Jmenu en java como tal 
     */

     private JPanel panel; 

     private Informacion_Mercado mercadoUsa; 
     private Informacion_Mercado mercadoColombia; 
    
     // creamos el constructor 
     public FunctionalANDGrafiph(){
      mercadoUsa = new Informacion_Mercado("Techologico",1000);
      mercadoColombia = new Informacion_Mercado("Agricultor",20000);
        setTitle("Jmenu-Study");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.panel = new JPanel();
        // pasamos el panel a el contenier 
        getContentPane().add(this.panel); // pasamos la instancia del panel 
        fuctionJMenu();
        setSize(500,400);
        setVisible(true);
     }

     // creamos un metodo en donde exploraremos el jmenu y su funcionamiento para despues pasarlo a el panel 
     public void fuctionJMenu(){
        /*
         *  em esta seccion se estudiara el JMenu y su funcionamiento 
         */

         /*
          * el jmenu es una estructura que se compone de 3 componenes un contenedor que es a el que le pasamos el jmenu y los items que estan dentro de este que al hacer click sobre ellos se activa una accion con el actionlistener 
          */

          JMenuBar bar = new JMenuBar();


          // definimos varios menus 
          JMenu informacion_Mercado = new JMenu("Informacion mercado");
          JMenu activos = new JMenu("Activos que poseo");


          // le damos jitem 
          JMenuItem mercadoNacional = new JMenuItem("Mercado nacional");
          mercadoNacional.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,"mercado " + mercadoColombia.pais());
          });
          JMenuItem mercadoInternacion = new JMenuItem("Mercado internacional");
          mercadoInternacion.addActionListener(e -> {
             JOptionPane.showMessageDialog(null,"mercado " + mercadoUsa.pais());
          });

          // ahora creamos los activos 
          JMenuItem activosInvertidos = new JMenuItem("Activos invertidos");
          activosInvertidos.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "el total invertido en el mercado es de " + (mercadoUsa.activos() + mercadoColombia.activos()));
          });
          JMenuItem activos_En_Reserva = new JMenuItem("Activos en reserva");
          activos_En_Reserva.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "no tiene ningun dinero en reserva ");
          });

          // ahora pasamos los valores 

          informacion_Mercado.add(mercadoInternacion);
          informacion_Mercado.add(mercadoNacional);

          activos.add(activosInvertidos);
          activos.add(activos_En_Reserva);

          bar.add(informacion_Mercado);
          bar.add(activos);
      

          // pasamos el bar a el jpnale 
          setJMenuBar(bar);
     }





     public static void main(String[] args) {
        new FunctionalANDGrafiph();
     }
}
