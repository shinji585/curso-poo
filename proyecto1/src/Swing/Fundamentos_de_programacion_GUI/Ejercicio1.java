package Swing.Fundamentos_de_programacion_GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio1 extends JFrame{
    /*
     * en este primer ejercicio tenemos que capturar la entrada del usuario y calcular lo que seria el factorial de un numero para este ejercicio estare utilizando la formula recursiva de r = n (n-1) teniendo en cuenta que el factorial de 1 es 1 y que el factorial de 0 es 1 
     */

     private final static int WIDTH = 400; 
     private final static int HEIGHT = 250; 
     public Ejercicio1(){
        setTitle("Factorial");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        createContents();
        setVisible(true);
     }

     // creamos las variables privadas que seran utilizadas dentro del programa 
     private JLabel tituJLabel;
     private JTextField entrada; 
     private JButton calcularButton;
     private JLabel resuJLabel; 

     // ceramoe el metodo de componentes 
     @SuppressWarnings("unused")
    public void createContents(){
        // inicializamos los valores y le damos a cada uno sus acciones y textos 
        tituJLabel = new JLabel(); 
        tituJLabel.setBounds(120, 20, 200, 25);
        entrada = new JTextField(); 
        entrada.setBounds(130, 60, 120, 25);
        calcularButton = new JButton(); 
        calcularButton.setBounds(130, 100, 120, 30);
        resuJLabel = new JLabel(); 
        resuJLabel.setBounds(80, 150, 250, 25);

        // ahora cada uno le asignamos su respetivo texto 
        tituJLabel.setText("Bienvenido a la calculadora factorial\nIngrese un numero para obtener su factorial");
        entrada.setToolTipText("ingrese un numero");
        calcularButton.setText("calcular");

        // creamos la accion 
        calcularButton.addActionListener(e -> {
            try {
                int numero_Factorial = calcularFactorial(Integer.parseInt(entrada.getText()));

                // luego de obtener el factorial lo asinamos a resultados y mostramos por pantalla 
                resuJLabel.setText("su resultado es: " + numero_Factorial);
                // ocultamos los componentes que no estemos utlizando 
                entrada.setVisible(true);
                calcularButton.setVisible(true);
                tituJLabel.setVisible(true);
            } catch (Exception c) {
                c.printStackTrace();
            }
        });

        // agregamos cada componente 
        add(tituJLabel);
        add(entrada);
        add(calcularButton);
        add(resuJLabel);
     }

     // creamos el metodo calcular factorial 
     public int calcularFactorial(int numero){
        if (numero == 0 || numero == 1){
            return 1; 
        }else{
            return numero * calcularFactorial(numero - 1); 
        }
     }

     // creamos el metodo main y testiamos el programa 
     public static void main(String[] args) {
        new Ejercicio1();
     }
}
