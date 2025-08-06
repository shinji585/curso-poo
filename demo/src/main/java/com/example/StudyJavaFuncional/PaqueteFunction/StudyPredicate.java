package com.example.StudyJavaFuncional.PaqueteFunction;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudyPredicate {
    /*
     * la siguiente interfaz funcional a estudiar es predicate su funcionamiento es tener un valor o de tipo T y este nos devuelve true o false su funcionamiento como tal es de validacion este se encarga de validar si algo es correcto o no y nos devuelve true or false 
     */
    public static void main(String[] args) {
        Predicate<Integer> validarEnterosPar = (x) -> x % 2 == 0; 

        List<Integer> listaEnteros = List.of(1,2,3,4,5,6,8);

        // ahora lo que hacemos es aplicar una validacion 
        listaEnteros.stream()
              .filter(validarEnterosPar).forEach(System.out::println); // lo que estamos haciendo es filstrar la lista aplicamos el predicate nuestra interfaz funcional lo que hace aqui es validar si algun numero de la lista es par y lo que hace con foreach es imprimir dicho valor cada vez que recorre la lista 

        // pieso que dicha interfaz funcional la podemos combinar con otras 
        Function<Integer,Integer> cuadrado_numero = (x) -> (int) Math.pow(x, 2); 

        // hacemos lo mismo pero ahora creamos una lista de numeros Enteros
       List<Integer> cuadrados_Numeros = listaEnteros.stream().filter(validarEnterosPar).map(cuadrado_numero).toList();

       System.out.println("the mix about predicate and function is a new list elevate to x^2: " + cuadrados_Numeros.toString());
    }
}
