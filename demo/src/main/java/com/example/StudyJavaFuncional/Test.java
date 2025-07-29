package com.example.StudyJavaFuncional;


import java.util.List;

public class Test {
    public static void main(String[] args) {
        /*
         * probamos la interfaces funcional generica 
         */
        List<String> palabras = List.of("Java","perl","python","rust");

        GenericosYlambdas<String>  comparar = (a,b) ->  a.equalsIgnoreCase(b);

        comparar.showValues(palabras);

        int pos = comparar.findValue(palabras, "rust");

        System.out.println("Encontrada en la posicion: " + pos);
    }
}
