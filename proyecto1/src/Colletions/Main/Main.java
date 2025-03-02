package Colletions.Main;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Scanner s = new Scanner(System.in);
  public static void main(String[] args) {
    // ejemplo de la forma en como se diseña una lista sin ningun tipo de dato especifico 
    List mliista = new ArrayList<>();
    // esta lista la podemos llenar con cualquier tipo de dato que queramos y ademas de eso podemos iterar y hacer acciones con estas por ejemplo 
    for (int i = 0; i < 10; i++) {
        mliista.add(i);
    }
    // en el ciclo anterior le estaba añadiendo entero pero que pasa si ahora le añademos un String 
    mliista.add("santiago salio un dia");
    // y luego la recorremos 
    for (Object object : mliista) {
        System.out.println(object);
        // nos damos cuenta que esta imprime todos los tipos de datos dentro pero mas no es algo correcto ya que estamos trabajando con datos indefinidos que son definidos desde object 
    }
    // acontinuacion se muestra una lista utilizando genericos que es una forma de definir el tipo de dato que contiene nuestra lista por ejemplo
    List<Integer> lista = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
        lista.add(i);
    }
    // si tratamos de ingresar un objecto diferente que pasaria 
    // lista.add("santaigo");  el mismo compilador nos dice que el metodo add esta definido para entero por que la lista es de tipo entero 
    // aontinuacion se procedera y se definira en forma de lista los metodos que se estudiara de list 1/contanins() and indexof()
    // metodo contains utilizando list.of
    List<String> listaNombres = new ArrayList<>(List.of("santiago","sebastian","samuel","matha","francisco"));

    // preguntamos desde un if si contiene un elemento y que haga una accion si lo tiene 
    System.out.print("ingrese el nombre: ");
    String name = s.nextLine();
    if (listaNombres.contains(name)){
        System.out.println("El nombre '" + name + "' está en la lista.");
    }else{
        System.out.println("el elemento no se encuntra en lista");
    }
    Buscar(listaNombres, name);
  }  
  public static void Buscar(List<String> lista,String elementoString){
    if (lista.indexOf(elementoString) != -1){
      System.out.println("felicitaciones el elemento se encuntra en lista");      
    }else{
        System.out.println("el elenento no se encuentra en lista");
    }
  } 
}
