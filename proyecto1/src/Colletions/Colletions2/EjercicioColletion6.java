package Colletions.Colletions2;
import java.util.Scanner;



import java.util.ArrayList;
import java.util.List;

public class EjercicioColletion6 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> paisesLista = new ArrayList<>(List.of("colombia","venezuela","brasil","canada"));

      
            System.out.print("ingrese el indixe ");
            int indixe = s.nextInt();
            s.nextLine();
            System.out.print("ingrese el nombre que va a colocar: ");
            String nombre = s.nextLine();

            // ahora lo que hacemos es llamar a get 
            try {
               paisesLista.set(indixe, nombre);
            } catch (Exception e) {
                int longitud = paisesLista.size() - 1;
                System.out.println("el indixe ingresado no existe por favor ingrese uno de acuerdo a la longitud total que se tiene que es la siguiente: " + longitud);
            }
            System.out.println("nueva lista actualizada");
            System.out.println(paisesLista);

            List<String> nuevaStrings = paisesLista.subList(0, 2);
            System.out.println(nuevaStrings);
    }
}
