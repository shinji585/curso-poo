package com.example.StudyJavaFuncional.PaqueteFunction;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumerStudy {
    /*
     * lo mismo que consumer pero ahora en dos valores 
     */
    public static void main(String[] args) {
        HashMap<String,Integer> datos = new HashMap<>(); 

        datos.put("samuel", 19);
        datos.put("Martha", 42);
        datos.put("Francisco", 50);
        datos.put("Santiago", 15);
        datos.put("Sebastian", 15);

        // lo que hacemos con un vi consumer es ahorrarnos el hecho de crear la accion a el recorrer un for each y tener que mostrar estos datos 
        BiConsumer<String,Integer> datConsumer = (nombre,edad) -> System.out.println(nombre + " tiene una edad de " + edad);


        // ahora simplemente utilizamos el forach 
        datos.forEach(datConsumer); // sin tener que estar creando una estructura a cada rato compleja 

    }
}
