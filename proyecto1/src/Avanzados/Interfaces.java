package Avanzados;

public class Interfaces {
    /** en esta seccion estudiaremos lo que son las interfaces y la forma en como debemos implementar estas en nuestro programa asi como la relacion que esto tiene con las clases abstractas */
    public static void main(String[] args) {
        Producto2 producto2 = new Producto2("xiaomi 14 pro", 1, 1.455);

        producto2.calcular();

        System.out.println(producto2.toString());
    }
}
// declaramos un interfaz 
interface InnerInterfaces {
  double IVA = 45.88;
    
  
   // implementamos un metodo de calcular 
   public void calcular();
}

// creamos una clase producto 
class Producto2 implements InnerInterfaces{
    private String name;
    private int cantidad; 
    private double precio;

    // creamos un constructor 
    public Producto2(String nombre,int cantidad,double precio){
        this.name = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    @Override
    public void calcular(){
        double pagar = (precio * cantidad) * IVA;
        System.out.println("el total a pagar es: " + pagar);
    }

    @Override
    public String toString(){
        return "product name: " 
        + this.name 
        + "- producto quantity: " 
        + this.cantidad 
        + "- producto price: " 
        + this.cantidad;
    }
    
}