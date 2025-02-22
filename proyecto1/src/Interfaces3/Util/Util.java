package Interfaces3.Util;
import java.util.*;
public class Util {
    static Scanner s = new Scanner(System.in);
    // creamos los metodos los cuales validan los distintos tipos de entrada de datos 

    // creamos un metodo para que devuelva valores double
    public  static double validarDouble() throws IllegalArgumentException{
        double valor = 0;
        while (true) {
            try {
                System.out.println("ingrese un numero por favor: ");
                while (!s.hasNextDouble()) {
                    System.out.println("valor introduccido incorrecto\nIngrese un valor numerico: ");
                    s.next();
                }
                valor = s.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("eror de tipo: " + e.getMessage());
            }
        }
     return valor;
    }
    // creamos un metodo para validar las estring 
    public static  String validaString() throws IllegalArgumentException{
        String valor = null;
        while (true) {
            try {
                System.out.print("Ingrese una cadena de texto: ");
                while (!s.hasNextLine()) {
                    System.out.print("el valor ingresado es incorrecto\nIngrese un valor correcto: ");
                    s.next();
                }
                valor = s.nextLine();
                while (valor.matches("^-?\\d+(\\.\\d+)?$")) {
                    System.out.print("solo se admiten letras\npor favor ingresar una letra: ");
                    valor = s.nextLine();
                }
                break;
            } catch (Exception e) {
                System.out.println("error de tipo: " + e.getMessage());
            }
        }
       
        return valor;
    }
    public static void main(String[] args) {
        System.out.println("ingrese un valor");
        String valor = validaString();
        System.out.println(valor);
    }
}