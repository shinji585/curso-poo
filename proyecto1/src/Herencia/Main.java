package Herencia;
import java.util.*;
public class Main {
    static Scanner s = new Scanner(System.in);
    static ArrayList<Herencia> producto = new ArrayList<>();
    public static void main(String[] args) {
        
            Herencia producto1 = new Herencia("cohce", 10, 153.500);
            Herencia producto2 = new Herencia("avion", 5, 700.000);
            producto.add(producto1);
            producto.add(producto2);

        // creamos ahora una instancia de tienda y la llenamos con la lista de producto 
        Tienda tienda = new Tienda();
        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);
        // mostramos los productos de la tiendad 
        tienda.Mostrarproducto();

    }
}
