package Exepciones;
import java.util.*;


public class Exepctiones3 {
   public static void main(String[] args) {
      try {
        int valor1 = 10;
        int valor2 = 0;
        Expetion.dividir(valor1, valor2);
        
      } catch (ArithmeticException e) {
        System.out.println(e.getLocalizedMessage());
      }
   }    
}
class Expetion{
    static Scanner s = new Scanner(System.in);
    // creamos un metodo que nos devuelva una excepcion cuando uno de los valores no sea entero 
    public static void verificartipo(int ... numero){
       for (int i : numero) {
        if (i % 10 == 0){
            throw new IllegalArgumentException("error de tipo desconocido");
        }else{
            System.out.println("numero divisible entre 2");
        }
       }
    }
    public static void dividir(int valor1,int valor2) throws ArithmeticException{
        if (valor2 == 0){
            throw new ArithmeticException("no se puede dividir por cero");
        }else{
            System.out.println("la division es: " + (valor1/valor2));
        }
    }
    public static String validarString(){
        System.out.println("ingrese un texto por favor: ");
        while (!s.hasNextLine()) {
           System.out.print("la entrada es erronea\nIngrese los datos de nuevo: ");
           s.next();
        }
        String valor = s.nextLine();
        
        // validamos si los datos son correctos 
         if (K.ExeptionString(valor)){
            return valor;
         }   
        return null;
    }
}
class K{
   public static boolean ExeptionString(String valor){
    if (valor.matches("[A-Z]")){
        throw new RuntimeException("los valores no coinciden");
    }else{
        return true;
    }
   }
}