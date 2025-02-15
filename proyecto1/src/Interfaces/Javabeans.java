package Interfaces;
import java.io.Serializable;
import java.text.*;
public class Javabeans {
    // acontinuacion se estudiara lo que es javabeans su uso y las formas y
    // ejercicios que le podemos darle

    /*
     * es un estandar para crear objectos reutilizables esto con el fin de poder ser
     * convertidos a bytes y a obejctos con el proceso de serializacion y
     * deserializacion en java se utiliza principalmente con json y bases de datos o
     * con frameworks como hibernate o spring boot
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("###,###");
        // creamos una instancia de nuestra camioneta 
        Camioneta camioneta1 = new Camioneta();
        camioneta1.setModelo(2010);
        camioneta1.setNombre("Ranger Raptor");
        camioneta1.setPrecio(316290000);

        System.out.println("camioneta modelo: " + camioneta1.getModelo());
        System.out.println("camineta nombre: " + camioneta1.getNombre());
        System.out.println("camioneta precio: " + df.format(camioneta1.getPrecio()));
    }
}

// acontinuacion se procede a realizar mas abajo un ejemplo de ello
class Camioneta implements Serializable{
    // creamos atributos de tipo privado
    private String nombre;
    private int modelo;
    private double precio;

    // realizamos una sobre carga de metodos
    public Camioneta() {
    }

    public Camioneta(String nombre, int modelo, double precio) {
        this.modelo = modelo;
        this.nombre = nombre;
        this.precio = precio;
    }

    // creamos los getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // modificamos el metodo tostring
    @Override
    public String toString(){
        return "{nombre: " 
        + this.nombre 
        + ", modelo: " 
        + this.modelo 
        + ", precio: " 
        + this.precio + "}";
    }

}