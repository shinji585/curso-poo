package Proyects2.Exercise2.Ejercicio3.Main;
import java.util.*;

import Proyects2.Exercise2.Ejercicio3.Model.Model;
import Proyects2.Exercise2.Ejercicio3.Service.Auto;
import Proyects2.Exercise2.Ejercicio3.Service.Moto;
public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        // creamos un arraylist de tipo vehiculo 
        ArrayList<Model> vehiculos = new ArrayList<>();

        // creamos dos atributos de tipo vehiculos que apunten a distintos tipos de datos en memoria 
        Auto auto = new Auto("BMD", 2019, 4, "hibrido");

        Moto moto = new Moto("yamaha", 2010, 2, "gasolina");

        // pasamos nuestros datos a el array 
        vehiculos.add(moto);
        vehiculos.add(auto);

        // mostramos atributos sobre estos 
        for (Model model : vehiculos) {
            System.out.println(model);
        }
        
        System.out.print("\nDesea visualizar el estado de alguno de los vehiculos\n1 para vehiculo\n2 para moto\n3 para no hacer nada:");
        int valor = s.nextInt();

        if (valor == 1){
            moto.acelerar(false);
        }else if (valor == 2){
            auto.acelerar(false);
        }else{
            System.out.println("Gracias por utilizar el programa....");
        }
    }
}
