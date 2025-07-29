package com.example.StudyJavaFuncional.EjerciciosFuncionales;

import java.util.List;

@FunctionalInterface
public interface Ejercicion1<T> {
    // 🟢 Ejercicio 1 – Fácil pero clave para entender lambdas y generics con
    // métodos default

    // 1. Crea una interfaz funcional genérica llamada Imprimir<T>
    // con un método abstracto: void imprimir(T elemento);

    // 2. Dentro de la interfaz, agrega un método default llamado
    // imprimirLista(List<T> lista)
    // que recorra la lista usando un for-each y llame al método imprimir por cada
    // elemento.

    // 3. En el método main:
    // a) Crea una lambda que imprima el elemento en mayúsculas si es un String.
    // b) Usa imprimirLista con una lista de Strings como: ["samuel", "lucas",
    // "daniela"].

    // Reto adicional:
    // - Crea otra implementación que reciba enteros y los imprima multiplicados por
    // 2.

    void imprimir(T elemento); // recibe cualquier tipo de valores 

    // creamos el metodo abstracto que nos imprime los elementos
    // abstract void imprimir(T elemento); 

    default void imprimirLista(List<T> lista){lista.forEach(System.out::println);}




}
