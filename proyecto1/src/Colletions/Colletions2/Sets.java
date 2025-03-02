package Colletions.Colletions2;
import java.util.*;

public class Sets {
    public static void main(String[] args) {
        // los set son un tipo de dato de collections la difrencia con la lista es que este no maneja un orden o mas o menos lo hace pero en forma de arbol tiene metodos similares a list 
        Set<Integer> valor = new TreeSet<>();

        // podemos llenarlo de forma indefinidad al igual que un alista? 
        for (int i = 0; i < 10; i++) {
            valor.add(i);
        }

        System.out.println("podemos imprimir el set de la misma forma que las listas ");
        valor.forEach(System.out::println);
        

        if (valor.contains(5)){
            System.out.println("el numero 5 esta en lista");
        }else{
            System.out.println("el numero no se encuentra");
        }
    }
}
