package Avanzados;

/**
 * @author samuel vargas 
 * @since 05/02/20205
 * en esta seccion estudiaremos lo que son los varargs de java o argumentos de java 
 */

public class Avanzado {
    public static void main(String[] args) {
     // ejemplos de varagas 
     // primer ejercicio orientado a lo que seria la concatenacion de datos tipos string 
     
     String[] palabras = {"Hola", "mundo", "Java", "es", "genial"};
     concatenar(palabras);

     // ejercicio numero dos promedios de numeros

     int[] numero = {10, 20, 30, 40, 50} ;
     System.out.println("\n");
     promedio(numero);
    
    }
    public static void concatenar(String... string){
        for (String string2 : string) {
            System.out.print(string2 + " ");
        }
    }
    public static void promedio(int... numero){
       

       int promedoio = 0;
       int suma = 0;
       int denominador = numero.length;

        for (int i : numero) {
           suma += i;
        }

        promedoio = suma/denominador;
        
        // se muestra la suma 
        System.out.println(promedoio);
    }
}
