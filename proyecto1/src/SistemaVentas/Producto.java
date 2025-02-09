package SistemaVentas;

public class Producto {
    private int id; 
    private String nombre;
    private double precio;
    private static int idClase = 0;
    // creamos dos constructores 
    public Producto(){

    }
    public Producto(String nombre,double precio){
      this.nombre = nombre;
      this.precio = precio;
      this.id = ++idClase;
    }
    // creamos los getters y setters 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getID(){
        return this.id;
    }
    // sobre escribimos el metodo tostring 
    public String toString(){
        return "el id del elemento es " + getID() + " su nombre es " + getNombre() + " su precio es " + getPrecio();
    }
}
