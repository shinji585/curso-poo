package com.example.StudyJavaFuncional.PaqueteFunction;

import java.util.function.BiPredicate;

public class BiPredicateStudy {
    /*
     * Bipredicate es similar a el Bifunction solo que este valida dos valores y nos muestra true or false ya eso es todo
     */

     public static void main(String[] args) {
        // imaginemos que queremos comprobar dos string segun si son iguales 
        BiPredicate<String,String> validarString = String::equalsIgnoreCase;

        // tenemos los dos String 
        String saludo = "hola mundo";
        String saludoUpper = "HOLA MUNDO"; 

        // y los queremos comprar y mostrar 
        if (validarString.test(saludo, saludoUpper)){
            System.out.println("las palabras ingresadas son iguales ");
        }else{
            System.out.println("No son iguales");
        }
     }
}
