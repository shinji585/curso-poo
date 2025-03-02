package Colletions.Colletions2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class EjercicioColletions7 {
    static Random r = new Random();
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            listaNumeros.add(r.nextInt(100) + 1);
        }
        System.out.println(listaNumeros);
        // ahora creamos una sublista 
        List<Integer> subList = listaNumeros.subList(5, 15);
        System.out.println(subList);
        System.out.println("sublista antes de ordenar ");
        // ordenamos la sublista  en orden descendente 
        Collections.sort(subList,Comparator.reverseOrder());
        System.out.println("sublista despues de ordenar");
        System.out.println(subList);
        System.out.println("la lista orginal era");
        System.out.println(listaNumeros);
        System.out.println("lista orginal ordenada");
        Collections.sort(listaNumeros);
        System.out.println(listaNumeros);
    }
}
