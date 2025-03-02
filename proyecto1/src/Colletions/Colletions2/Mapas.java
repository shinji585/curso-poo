package Colletions.Colletions2;

import java.util.TreeMap;
import java.util.Map;

public class Mapas {
 public static void main(String[] args) {
    // formas de usar map y treemap 
    Map<Integer, String> map = new TreeMap<>();
   
    // aplicamos los metodos estudiandos en map llenamos 
    map.put(1, "perro");
    map.put(2, "leon");
    map.put(3, "gatos");
    map.put(4, "camaleon");
    map.put(5, "caballos");

    // recorremos el map 
    // primera forma de recorrer el map map.entrySet().forEach(System.out::println);

    map.forEach((k,v) -> {System.out.println("clave: " + k + " - valor: " + v);});

    // otra forma de recorrerlo 
   System.out.println("\notra forma de recorrer el map ");
    for (Map.Entry<Integer,String> valor : map.entrySet()) {
      System.out.println("la clave es: " + valor.getKey() + " - el valor es: " + valor.getValue());
    }
 }    
}
