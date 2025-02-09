package Avanzados.ejemplo.Services;

public class Producto {
    private String nombre;
    private String deString;
    private double precio;
    private int stock;
    private static int id = 0;
    private int ID;

    // implementamos los constructores 
    public Producto(){
        // constructor vacio
    }
    public Producto(String nombre,String deString,double precio,int stock){
        this.nombre = nombre;
        this.deString = deString;
        this.precio = precio;
        this.stock = stock;
        ID += Producto.id;
    }

    // implementamos los getters y setters 
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDeString() {
        return deString;
    }
    public void setDeString(String deString) {
        this.deString = deString;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    // acedemos a el id del producto 
    public int getProducto(){
        return this.ID;
    }

    // ahora sobre escribimos el metodo tostring 
    @Override 
    public String toString(){
        return "producto nombre: " 
        + this.nombre 
        + " producto descripcion: "
        + this.deString 
        + " producto precio: " 
        + this.precio 
        + " producto stock: " 
        + this.stock;
    }
}
