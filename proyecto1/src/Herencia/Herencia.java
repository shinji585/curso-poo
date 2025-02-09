package Herencia;

public class Herencia {
    private String marca;
    private int cantidad; 
    private double precio; 
    // voy a construir algunos constructores y getters y setters 
    public Herencia(){
    }
    public Herencia(String marca,int cantidad,double precio){
        this.marca = marca;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    // setters 
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setCantidad(int cantidad){
       this.cantidad = cantidad;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    // creamos los getters
    public double  getPrecio(){
        return this.precio;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public String getMarca(){
        return this.marca;
    }
}
