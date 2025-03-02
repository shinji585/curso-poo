package Colletions.Colletions2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class EjercicioColletions3 {
    static  Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> tareas = new ArrayList<>(List.of("Hacer ejercicio","Estudiar ingles por la mañana","Visitar a mi abuela el domingo","Sacar la basura el viernes ","Cocinar la cena"));

        System.out.print("ingrese el nombre de la tarea para ver si se encuentra en lista: ");
        String name = s.nextLine();

        if (valor(tareas,name)){
            System.out.println("la tarea: " + tareas.get(tareas.indexOf(name)) + " se encuentra en la posicion: " + tareas.indexOf(name));
        }else{
            System.out.println("la tarea no se encuentra en la lista");
        }

    }
    // creamos el metodo que busca en la lista
    public static boolean valor(List<String> tarea,String nombre){
        for (String string : tarea){
            if (string.contains(nombre)){
                return  true;
            }
        }
        return  false;
    }
}
