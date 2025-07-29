package com.example.StudyJavaFuncional.EjerciciosFuncionales;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Filtro<T> {
    // 🔵 Ejercicio 2 – Intermedio: Filtrado de elementos con lambdas, genéricos y
    // métodos default

    // 1. Crea una interfaz funcional genérica llamada Filtro<T>
    // con un método abstracto: boolean test(T elemento);

    // 2. Dentro de la interfaz, define un método default llamado filtrar(List<T>
    // lista)
    // que recorra la lista, aplique el método test(...) a cada elemento,
    // y devuelva una nueva lista con solo los elementos que cumplan la condición.

    // 3. En el método main:
    // a) Crea una implementación con lambda que filtre números pares de una lista
    // de enteros.
    // Ejemplo: n -> n % 2 == 0

    // b) Crea otra implementación con lambda que filtre strings que empiecen por
    // vocal (a, e, i, o, u).
    // Ejemplo: s -> s.toLowerCase().matches("^[aeiou].*")

    // 4. Usa el método filtrar(...) para aplicar ambos filtros a listas diferentes
    // y muestra los resultados por consola.

    // Resultado: Aprenderás a combinar lambdas con lógica condicional,
    // genéricos y procesamiento funcional de listas.

    boolean test(T elemento);

    default List<T> filtrar(List<T> lista) {
        List<T> filtrada = new ArrayList<>();
        for (T elem : lista) {
            if (test(elem)){
              filtrada.add(elem);
            }
        }
        return filtrada;
    }
}
