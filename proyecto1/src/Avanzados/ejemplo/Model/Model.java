package Avanzados.ejemplo.Model;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

import Avanzados.ejemplo.Services.Producto;
import Avanzados.ejemplo.Services.Services;
import java.util.Scanner;

public class Model extends Services{
    HashMap<Integer,ArrayList<Producto>> hashMap = new HashMap<>();
    static Scanner s = new Scanner(System.in);
     
    // creamos el constructor de nuestra herencia 
    public Model(String nombre, String tipoString){
      super(tipoString, tipoString);
    }


    // ahora inicializamos nuestros getter y setter
    @Override 
    public String getTipoProducto(){
        return super.nombreTienda;
    }
    @Override
    public String getNombreTienda(){
        return super.tipoProducto;
    }
    @Override
    public void setTipoProducto(String a){
        super.tipoProducto = a;
    }
    @Override
    public void setNombreTienda(String b){
        super.tipoProducto = b;
    }
    // creamos el metodo implementar productos que se hereda de la clase abstractas services
    @Override
    public void agregarProducto(){
        System.out.println("Ingrese el nombre de la tienda: ");
        setNombreTienda(s.nextLine());
        System.out.println("ingrese el tipo de tienda: ");
        setTipoProducto(s.nextLine());
        
        // agregamos los productos a un arraylist 
        System.out.println("ingrese el nombre del producto: ");
        String nombre = s.nextLine();

        System.out.println("ingrese una descripcion del producto: ");
        String descString = s.nextLine();

        System.out.println("ingrese el precio del producto: ");
        double price = s.nextDouble();

        System.out.println("ingrese la cantidad de productos a vender: ");
        int stock = s.nextInt();

        // pasamos todo a una variable de instancia 
        Producto producto = new Producto(nombre, descString, price, stock);
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto);

        // pasamos todo a el hashmap 

        hashMap.put(producto.getProducto(), productos);
        
    }
    @Override
    public void eliminarProducto(){
        // esto estara en pausa 
    }
    @Override
    public void buscarPrdocut(){
       // esto estara en pausa 
    }
    public void mostrarproducto(){
        System.out.println("nombre de la empresa: " + getNombreTienda());
        System.out.println("tipo de tienda: " + getTipoProducto());
        for (Map.Entry<Integer,ArrayList<Producto>> entry : hashMap.entrySet()) {
            System.out.println("id: " + entry.getKey() + ", valor: " + entry.getValue());
        }
    }
}
