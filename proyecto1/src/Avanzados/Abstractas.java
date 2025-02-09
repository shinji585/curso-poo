package Avanzados;

import java.util.ArrayList;

public class Abstractas {
    /**
     * @author samuel vargas 
     * @since 06/02/25
     */

     // acontinuacion se estudiara un tema importante que son las clases abstractas y el funcionamiento de este con respecto a las demas tipos de clases y la forma en como se relacionan 

     public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<>();
        string.add("jugos");
        string.add("panes");
        string.add("televisores");
        Tienda tienda = new Exito(string, 2, 10, 15);

        // mostramos el totdal a pagar 
        tienda.informacion();

        Exito exito = new Exito(string, 14, 20, 10);

        System.out.println(exito.venta());
     }
}

// creamos una clase abstratas de tipo tienda 
abstract class Tienda{
   // creamos cierto tipo de atributos que contiene una tienda pero abstractos 
   protected ArrayList<String> productoName = new ArrayList<>();
   protected int numeroCajeros;
   protected int numeroProductoMaximos; 

   // creamos un constructor para esta clase 
   public Tienda(ArrayList<String> productoArrayList,int numeroCajeros,int numeroProductoMaximos){      this.numeroCajeros = numeroCajeros;      this.productoName = productoArrayList;      this.numeroProductoMaximos = numeroProductoMaximos;     }

   // creamos ciertos metodos sin impememtar que la tienda herederar

   public abstract double venta();


   // creamos un metodo que implemente polimorfimos para visualizar los datos 

   public void informacion(){
    
    System.out.println("el numero de cajeros disponibles en la tienda es " + this.
    numeroCajeros);
    
    System.out.println("el numero de productos maximos en la tienda es " + this.numeroProductoMaximos);

    System.out.println("los productos en la tienda son: ");
    for (String string : productoName) {
        System.out.println(string);
    }

   }
}
// creamos una nueva clase que imoplemente nuestra clase abstracta 
class Exito extends Tienda{
    // creamos ciertas caracteristicas que tiene exito como 
    private double impuesto;
    private  static int id = 0;
     
   // creamos el constructor 
   public Exito(ArrayList<String> productos,int numeroCajeros,int numeroProductoMaximos,int impuesto){
    super(productos, numeroCajeros, numeroProductoMaximos);
    this.impuesto = impuesto;
    Exito.id += id;
   }
   

   public void setImpuesto(int a){
    this.impuesto = a;
   }
   // creamos su getter 
   public double getImpuesto(){
    return this.impuesto;
   }

   // mostramos el numero de id de la instancia 
   public int getId(){
    return Exito.id;
   }

    @Override
    public  double venta(){
       double resultado = getImpuesto() * super.productoName.size();

       return resultado;
    }
}