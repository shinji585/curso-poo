package Proyects2.Exercise2.Main;

import java.util.ArrayList;


import Proyects2.Exercise2.Service.Libro;
import Proyects2.Exercise2.Service.Libroelectronico;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> tienda = new ArrayList<>();

    // agregamos productos a la lista 
    Libro libro = new Libro("terror", "IT", 12000);

        tienda.add(libro);

        Libro libroElectronico = new Libroelectronico("PDF", 5, "calculo II", 350, "estudiantil");

        tienda.add(libroElectronico);

        // recorremos tienda para ver la informacion dentro de ella 
        for (Libro libro2 : tienda) {
            libro2.mostrarDetalles();
            System.out.println("\n-------------------------------------");
        }
    }
}
