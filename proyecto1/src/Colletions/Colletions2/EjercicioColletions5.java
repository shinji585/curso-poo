package Colletions.Colletions2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioColletions5 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of("Celulares", "Aviones", "Camionetas", "Zapatos deportivos"));

        // preguntamos si quiere visualizar la lista
        System.out.print("¿Desea visualizar la lista?\nIngrese true or false: ");
        while (!s.hasNextBoolean()) {
            System.out.print("los valores ingresado no corresponden con true or false\nIngrese un valor de nuevo: ");
            s.next();
        }
        boolean valor = s.nextBoolean();
        if (valor) {
            VisualizarDatos(lista);
            System.out.print("ingrese true or false si quiere cambiar algun dato en la lista: ");
            while (!s.hasNextBoolean()) {
                System.out.print("los valores ingresado no corresponden con true or false\nIngrese un valor de nuevo: ");
                s.next();
            }
            boolean p = s.nextBoolean();
            if (p) {
                s.nextLine();
                System.out.print("ingrese el nombre o el indice del valor que quiere cambiar: ");
                String indice = s.nextLine();
                s.nextLine();
                lista = CambiarDatos(lista, indice);
                if (lista != null) {
                    System.out.println("La nueva lista es: " + lista);
                } else {
                    System.out.println("El valor ingresado no es válido.");
                }
            } else {
                System.out.println("Gracias por utilizar el programa.");
            }
        }

    }

    // creamos un metodo para visualizar datos
    public static void VisualizarDatos(List<String> lista) {
        System.out.println(lista);
    }

    // creamos un metodo para hacer una acciones y que estas no devuelva la lista actualizada
    public static List<String> CambiarDatos(List<String> lista, String valor) {
        if (valor.matches("[a-zA-Z ]+")) {
            int indixe = lista.indexOf(valor);
            if (indixe != -1) { // Si el valor existe en la lista
                System.out.print("Ingrese la nueva tarea: ");
                String nuevaTarea = s.nextLine();
                lista.set(indixe, nuevaTarea);
                return lista;
            }
        } else if (valor.matches("\\d+")) {
            int numero = Integer.parseInt(valor);
            if (numero >= 0 && numero < lista.size()) { // Verifica que el índice sea válido
                System.out.print("Ingrese la nueva tarea: ");
                String nuevaTarea = s.nextLine();
                lista.set(numero, nuevaTarea);
                return lista;
            }
        }
        return null;
    }
}
