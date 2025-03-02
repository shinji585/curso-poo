package Colletions.Colletions2;
import java.util.*;
public class EjercicioColletion1 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> producto = new ArrayList<>(List.of("lapto","celular","equipos de sonido","televisores"));
        // ahora preguntamos para verificar si en la lista se encuentra algun producto buscando por alguien
        System.out.print("ingrese por favor el nombre del articulo que busca: ");
        String nombre = s.nextLine();
        // utilizamos regex
        while (nombre.matches("[a-zA-Z]")){
            System.out.print("el valor ingresado no corresponde con el tipo de dato esperado\nIngrese el nombre del articulo: ");
            nombre = s.nextLine();
        }

        if (EstaEnlista(producto,nombre)){
            System.out.println("el elemento esta en lista");
        }else{
            System.out.println("lo sentimos el elemento buscando no se encuentra en lista ");
        }
    }
    // creamos el metodo que nos bucara
    public static boolean EstaEnlista(List<String> producto,String nombre){
        for (String elemento : producto){
            if (elemento.contains(nombre)){
                  return  true;
            }
        }
        return  false;
    }
}

