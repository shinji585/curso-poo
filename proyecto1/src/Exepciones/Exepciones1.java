package Exepciones;
import java.util.*;
public class Exepciones1 {
    static Scanner s = new Scanner(System.in);
    /*
     * en este archivo se estudiara lo que son las exepciones su funcionamiento y las cosas que podemos hacer con este 
     */
    public static void main(String[] args) {
        // para evitar esto creamos nuestras propias exepciones para que al momento de ejecutrar las aplicaciones que hagamos se ejecuten o permitan al usuario llegar a el resolutado que este espera 
        int valor = 0;
        int valor2 = 0;
        try {
            System.out.println("ingrese un valor: ");
             valor2 = s.nextInt();
             valor = 1 / valor2;
            System.out.println(valor); // aqui lo que hacemos es obtener una exepciones que no seria un error si no algo que hace que nuestro programa se detenga en tiempo de ejecucion  
            throw new Miexception("se intenta hacer una division el denominador debe ser distinto de cero");
        } catch (Miexception e) {
            System.out.println("se ha producido una exepcion:" + e.getMessage());
        }finally{
            System.out.println("el valor ingresado es erroneo\nIngrese de nuevo un valor: ");
            valor2 = s.nextInt();
            valor = 1 / valor2;
            System.out.println((double) valor);
        }
    }
}
// clase que hereda de exception 
class Miexception extends Exception{
    public Miexception(String exceptio){
       super(exceptio);
    }
}
