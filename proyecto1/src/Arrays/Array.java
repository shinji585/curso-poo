package Arrays;
import java.util.*;

public class Array {
    /* acontinuacion veremos un repaso sobre los array y su funcionamiento y resolveremos varios ejercicios en la misma carpeta  */
    public static void main(String[] args) {
        int[] array = {5,107,25};

        // con el metodo sort podemos ordenar nuestro array pero esto altera su posicion en memoria y la forma en como se da esta referencia 
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        // el array queda alterado por completo por lo que no se necesita crear un nuevo array para que almacene al otro por que se cambia su referencia en memoria y se le asigna los valores ordenados 
        for (int i : array) {
            System.out.println(i);
        }
    }
}
