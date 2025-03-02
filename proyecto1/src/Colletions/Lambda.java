package Colletions;

import java.util.*;

public class Lambda {
    public static void main(String[] args) {
        // ejemplo de las funciones lambda 
        List<String> name = new ArrayList<>(List.of("santiago","samuel","sebastian","martha","pepito","tu mama"));

        // queremos recorrer la lista 
        // en las funciones lambda se implementa y se reduce el codigo con la siguiente expresion
        System.out.println("ejemplo con funciones lambda");
        name.forEach(elemento -> System.out.print( "{ "+ elemento + " }"));
        // la siguiente linea nos imprime cada uno de los elemento dentro de lista 
        System.out.println("\n\nejemplo con foreach normal");
        for (String string : name) {
            System.out.print( "{ " + string  + " }");
        }

    }
    
}
