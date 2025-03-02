package Colletions.Colletions2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioColletions4 {
    static  Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> tareas = new ArrayList<>(List.of("Sacar la basura","Ir de compras a el mercado","Realizar la tarea de matematicas","Terminar de verme star wars"));

        // ahora solicitamos la tarea y el indixe que la persona quiere cambiar
        System.out.print("ingrese el indixe de la tarea que quiere cambiar en la lista: ");
        int indexe = s.nextInt();
        s.nextLine();
        System.out.print("ingrese el nombre de la nueva tarea: ");
        String name = s.nextLine();
        tareas = cambiarDatos(tareas,indexe,name);
        // creamos un for each
        System.out.println("lista modificada: " + tareas);
    }
    // ahora creamos un  metodo que se encargue de buscar la tarea por el indixe
    public  static List<String> cambiarDatos(List<String> tareas,int indixe,String nuevaTarea){
        if (indixe != -1){
            System.out.println("la tarea ha sido encontrada y sera actualizada");
            tareas.set(indixe,nuevaTarea);
            return tareas;
        }
        return  null;
    }
}
