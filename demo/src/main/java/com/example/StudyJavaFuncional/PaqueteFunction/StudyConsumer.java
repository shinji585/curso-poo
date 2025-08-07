package com.example.StudyJavaFuncional.PaqueteFunction;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class StudyConsumer {
    /*
     * consumer<T> es otra interfaz funcional que tenemos aqui en java su uso principal es permitirnos lograr una accion esta es la principal diferencia con respecto a function and predicate que function su accion es transformar, predicate su funcion es revisar chekear y decirnos ok o no aqui en consumer estamos realizando acciones como acceder a variables externas y lograr reutilizarlas  
     */

     /*
      * consumer no devuelve nada 
      */


      public static void main(String[] args) {
        /*
         * la interface consumer tiene como unico funcionamiento realizar acciones pero no devolver ningun tipo de valor este interface funcional nos sirve para imprimir valores o extender su funcionamiento 
         */


         /*
          *  por ejemplo imaginemos que tenemos un set de caracteres
          */
          Set<Character> setCharacter = new HashSet<>();

          // le damos valores valores 
          for (Character character : "hola mundo".toCharArray()) {
            setCharacter.add(character);
          } 

          // que pasa aqui imaginemos que tenemos un stream que transforma cada character a una secuencia de nuevo 

          // el consumer imprime cada character 
          Consumer<Character> printCH = c -> System.out.print(c);

          // ahora imprimimos cada caracter 
          setCharacter.stream().forEach(printCH); // se llama a el stream este recorrer cada secuencia y el consumer realiza la accion de imprimir los objecto de tipo Character 

      }
}
