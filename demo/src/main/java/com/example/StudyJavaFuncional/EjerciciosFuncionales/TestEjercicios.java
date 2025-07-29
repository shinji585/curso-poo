package com.example.StudyJavaFuncional.EjerciciosFuncionales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEjercicios {

    public static void main(String[] args) {
        // 3. En el método main:
        // a) Crea una lambda que imprima el elemento en mayúsculas si es un String.
        // b) Usa imprimirLista con una lista de Strings como: ["samuel", "lucas",
        // "daniela"].

        // Reto adicional:
        // - Crea otra implementación que reciba enteros y los imprima multiplicados por
        // 2.

        // creamos la lambda que imprima el elemento si en mayusculas si es un String
        Ejercicion1<String> imprimirStrings = (String elemento) -> System.out.println(elemento.toUpperCase());

        List<String> nombres = List.of("Samuel", "Lucas", "Daniela");

        // ahora utilizamos el metodo imprimir de la lamabda que viene por defaul
        imprimirStrings.imprimirLista(nombres);

        // implementacion segundo ejercicio

        // 3. En el método main:
        // a) Crea una implementación con lambda que filtre números pares de una lista
        // de enteros.
        // Ejemplo: n -> n % 2 == 0

        // b) Crea otra implementación con lambda que filtre strings que empiecen por
        // vocal (a, e, i, o, u).
        // Ejemplo: s -> s.toLowerCase().matches("^[aeiou].*")

        // 4. Usa el método filtrar(...) para aplicar ambos filtros a listas diferentes
        // y muestra los resultados por consola.

        Filtro<Integer> filtro = n -> n % 2 == 0;

        Filtro<String> stringFiltro = s -> s.toLowerCase().matches("^[aeiou].*");

        // creamos las listas
        List<Integer> numeros = List.of(1, 2, 4, 5, 6, 7, 8, 9, 10, 22, 12, 3, 4, 5, 13, 44, 55, 66);
        List<String> palabras = List.of("sol", "luna", "estrella", "planeta", "galaxia", "universo", "cometa",
                "asteroide", "órbita", "gravedad");

        // aplicamos los filtros
        List<Integer> numerosFIltrados_pares = filtro.filtrar(numeros);
        List<String> palabrasFiltradas = stringFiltro.filtrar(palabras);

        System.out.println("los numeros filstrados son: ");
        numerosFIltrados_pares.forEach(e -> {
            System.out.println(e);
        });

        System.out.println("las palabras que empiezan por una vocal son: ");
        palabrasFiltradas.forEach(e -> {
            System.out.println(e);
        });

        // implementacion ejercicio 3

        Analizador<Integer> analizadorInteger = (a, b) -> a > b;

        Analizador<String> analizadorString = (a, b) -> a.length() > b.length();

        // listas de prueba

        // Lista 1: Números enteros con repetidos, máximos claros
        List<Integer> listaEnteros1 = Arrays.asList(4, 8, 2, 8, 5, 8, 1);

        // Lista 2: Números negativos y positivos
        List<Integer> listaEnteros2 = Arrays.asList(-10, 0, 5, -10, 20, 20, 3);

        // Lista 3: Todos los elementos son iguales
        List<Integer> listaEnteros3 = Arrays.asList(7, 7, 7, 7, 7);

        // Lista 4: Cadenas de texto con diferentes longitudes
        List<String> listaStrings1 = Arrays.asList("sol", "luna", "estrella", "mar", "sol");

        // Lista 5: Strings con mismas longitudes pero diferentes valores
        List<String> listaStrings2 = Arrays.asList("uno", "dos", "tres", "mil", "sol");

        // Lista 6: Lista vacía (para probar el caso sin elementos)
        List<String> listaVacia = new ArrayList<>();

        List<Integer> positivosMayores = analizadorInteger.maximos(listaEnteros1);
        List<Integer> negativosMayores = analizadorInteger.maximos(listaEnteros2);
        List<Integer> enterosIguales = analizadorInteger.maximos(listaEnteros3);
        List<String> textosDiferentes = analizadorString.maximos(listaStrings1);
        List<String> string_mismas_longitudes = analizadorString.maximos(listaStrings2);
        List<String> listaVacia_Prueba = analizadorString.maximos(listaVacia);
        
        
        // imprimimos los resultados 
        System.out.println("\n" + positivosMayores.toString());
        System.out.println(negativosMayores.toString());
        System.out.println(enterosIguales.toString());
        System.out.println(textosDiferentes.toString());
        System.out.println(string_mismas_longitudes.toString());
        System.out.println(listaVacia_Prueba.toString());
        

    }
}
