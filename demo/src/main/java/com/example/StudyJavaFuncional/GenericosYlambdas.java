package com.example.StudyJavaFuncional;

import java.util.List;

@FunctionalInterface
public interface GenericosYlambdas<T> {
    /*
     * en esta seccion estudiaremos las expresiones lambdas y los genericos estaremos creando aqui una interface funcional de forma generica 
     */
    boolean aplicar(T a,T b);


    // definimos un metodo por default que nos imprima todo los valores 
    default void showValues(List<T> lista){
        for (T element : lista) System.out.println(element); // mostramos todos los valores de la lista 
    }

    // ahora creamos un metodo que busque un valor dentro de la lista 
    default int findValue(List<T> lista, T value){
        for (int i = 0; i < lista.size(); i++) {
            if (aplicar(lista.get(i), value)) return i; 
        }
        return -1;
    }

}
