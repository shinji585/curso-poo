package Interfaces;

import java.util.*;

public class try2 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // el try catch nos permite ejecutar un bloque de codigo y si este este tiene
        // una excepcion la captura y al muestra por pantalla
        int[] j = { 15, 27, 31, 64, 88 };
        // intentamos aceder a los indices de nuestro array mediante a el indice
        // ingresado por el usuario
        while (true) {
            try {
                System.out.println("elementos dentro del array: ");
                for (int i : j) {
                    System.out.println(i);
                }
                System.out.print("ingrese el indice a el cual quiere acceder: ");
                int index = s.nextInt();
                System.out.println(j[index]);
                break;
            } catch (Exception e) {
                System.out.println("excepcion del tipo: " + e.getLocalizedMessage());
            }
        }
    }
}
