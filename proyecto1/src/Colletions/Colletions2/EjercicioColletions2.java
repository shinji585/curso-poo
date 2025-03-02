package Colletions.Colletions2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioColletions2 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of("carlos","samuel","marian","camila","santiago","luisa"));

        System.out.print("ingrese el nombre de la persona para ver si se encuentra en lista: ");
        String name = s.nextLine();

        if (valor(lista,name)){
            System.out.println("la persona se encuentra en la posicion: " + lista.indexOf(name));
        }else{
            System.out.println("el elemento no se encuentra en lista");
        }

    }
    // creamos el metodo que busca en la lista
    public static boolean valor(List<String> lista,String nombre){
        for (String string : lista){
            if (string.contains(nombre)){
                return  true;
            }
        }
        return  false;
    }
}
