package Colletions.Colletions2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class LambdaEjercicio {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Mariana","Carolina","kenia","juan miguel","marcos","samuel"));

        // creamos una funcion lambda para imprimir los en mayusculas 
        names.sort(String:: compareTo);
        
        System.out.println("elementos en mayusculas");
        names.forEach(elemento-> {
            System.out.print( "{ " + elemento.toUpperCase() + " }");
        });

        // que pasa si creamos una lista de tipo integer funcionara? 
        List<Integer> listaInteger = new ArrayList<>(List.of(4,55,7458,3,7841201));

        // queremos ordenar la lista y para esto tenemos dos formas 
        Collections.sort(listaInteger, Comparator.reverseOrder());
        // rodenamos en orden inverso la lista y la imprimimos 
        System.out.println("\n" + listaInteger);
        // si quisieramos hacer lo mismo pero con expresiones lambda seria de la forma 
        listaInteger.sort(Integer::compareTo);
        System.out.println("\n" + listaInteger);
        // una nueva forma de crear lista se da de la forma 
        List<Integer> listaList = Arrays.asList(4,5,7,8);
        // y podemos imprimir esta nueva lista utilizando la forma 
        listaList.forEach(System.out::println); //  la desventaja de esto es que la informacion se pierde y no podemos modificar la salidad 
        listaList.sort(Integer::compareTo);
        // luego buscamos 
        if (Collections.binarySearch(listaList, 4) == 4) {
            System.out.println("el numero se ha encontrado");
        }else{
            System.out.println("el numero no esta en la lista");
        }
    }
}
