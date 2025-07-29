package com.example.StudyJavaFuncional.EjerciciosFuncionales;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Analizador<T> {
    // 🔴 EJERCICIO 3 – MÁS DESAFIANTE

    // OBJETIVO:
    // Crear una interfaz funcional que permita hacer comparaciones genéricas
    // y generar estadísticas como contar, obtener máximos y mínimos,
    // usando una sola lambda para definir la lógica de comparación.

    // PASO 1:
    // Define una interfaz funcional llamada Analizador<T>
    // que contenga un único método abstracto:
    // boolean comparar(T a, T b);

    // PASO 2:
    // Dentro de esa interfaz Analizador<T>, agrega métodos default:
    // a) int contar(List<T> lista, T valor)
    // → Cuenta cuántas veces aparece 'valor' en la lista.
    // b) List<T> maximos(List<T> lista)
    // → Devuelve una lista con todos los elementos que son "máximos"
    // según la lógica definida en el método comparar(T a, T b).
    // c) List<T> minimos(List<T> lista)
    // → Lo mismo pero para encontrar los "mínimos".

    // NOTA IMPORTANTE:
    // El método 'comparar' es la lógica que decides en tiempo de ejecución,
    // a través de una lambda. Por ejemplo:
    // (a, b) -> a > b → compara enteros normalmente
    // (a, b) -> a.length() > b.length() → compara longitud de strings

    // PASO 3:
    // En tu método main:
    // a) Crea un Analizador<Integer> usando lambda (a, b) -> a > b
    // → Usa contar(), maximos() y minimos() para una lista de enteros.
    // b) Crea un Analizador<String> usando lambda (a, b) -> a.length() > b.length()
    // → Aplica los métodos para comparar cadenas por longitud.

    // PASO 4:
    // Prueba con varias listas mixtas (números repetidos, strings de distintas
    // longitudes)
    // y valida que los métodos devuelven los resultados esperados.

    // EXTRA:
    // Puedes imprimir los resultados en consola, como:
    // System.out.println("Máximos: " + analizador.maximos(lista));

    boolean comparar(T a,T b);


    default int contar(List<T> lista,T valor){
        // contamos cuantas veces aparece el valor dentro de la lista
        int apariciones = 0;  
        for (T t : lista) {
            if (t.equals(valor)){
             apariciones++;
            }
        }
        return apariciones;
    }

    default List<T> maximos(List<T> lista){
        List<T> maximos = new ArrayList<>();
        for (T t : lista) {
            boolean esMaximo = true;
            for (T t2 : maximos) {
               if (comparar(t, t2)){
                 esMaximo = false;
                 break;
               }   
            }
            if (esMaximo){
                maximos.add(t);
            }
        }
        return maximos;
    }

}
