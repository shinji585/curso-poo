package com.example.StudyJavaFuncional.PaqueteFunction;

import java.util.Scanner;
import java.util.function.Function;

public class ProfundizacionFunction {
    public static void main(String[] args) {
        /*
         * la interfaz funcional function tiene dos metodos que se aplican de forma diferente uno de ellos es compose y el otro es andThen vamos a estudiar dichos metodos ya que son los que me estan confundiendo para ellos creamos dos interfaces funcionales 
         */

         Function<String,Integer> conversor = Integer::parseInt;
         Function<Integer,Integer> cuadrado = (x) ->  (int) Math.pow(x, 2);

         /*
          * comenzaremos analizando andThen y su funcionamiento: este metodo recibe dos function pero la diferencia esta en como se utiliza ya que la que lo llama es la que se ejecuta primero y luego su resultado se lo pasa a la segunda 
          */

          Scanner s = new Scanner(System.in); 

          System.out.print("ingrese un numero: ");
          String number = s.nextLine();
          while (true) {
            try {
                if (number.matches("\\d+")){
                    System.out.println("se aplicara una funcion a su numero");
                    break;
                }else{
                    System.out.print("ingrese un numero no una letra: ");
                    number = s.nextLine();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
          }

          // aplicamos primero andThen 
          // tenemos que primero aplicar la String que convierte a numero y luego que lo convierta a el cuadrado
          System.out.println("utilizando andThen(): " + conversor.andThen(cuadrado).apply(number));


          // compose es lo inverso la funcion que le pasemos sera compose(before) y la que va en before sera la que se aplicara primero retonrnando el valor a la que lo llama y esta por ultimo utilizando 
          System.out.println("utilizando compose(): " + cuadrado.compose(conversor).apply(number));
          s.close();
    }
}
