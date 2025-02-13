package Proyects2.Exercise2.Service;

import Proyects2.Exercise2.Model.Productok;

public class Libro extends Productok {
    private String tipoLibro;
    private  int id = 0;
    private static int ID;

    // creamos un constructor para todo esto 
    public Libro(String tipo,String name,double precio){
        super(name, precio);
       this.tipoLibro = tipo;
       Libro.ID =+ id;
    }

    // creamos los getters and setters 
    public void setTipo(String tipo){
       this.tipoLibro = tipo;
    }
    public String getTipo(){
        return this.tipoLibro;
    }
    public int getID(){
        return Libro.ID;
    }

    // implementamos los metodos obtenidos de los atributos abstractos 
    @Override
    public void setName(String name){
      this.name = name;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public void setPrecio(double precio){
          this.precio = precio;
    }
    @Override
    public double getPrecio(){
        return this.precio;
    }

    // ahora implementeamos el metodos de mostrar informacion 
    @Override
    public void mostrarDetalles() {
        System.out.println("📖 ID: " + id);
        System.out.println("📂 Tipo de libro: " + tipoLibro);
        System.out.println("📚 Nombre: " + name);
        System.out.println("💲 Precio: $" + precio);
        
    }

    // sobre escribimos el tostring 
    @Override
    public String toString(){
        return "Libro{" + "tipo=" + tipoLibro + ", nombre=" + name + ", precio=" + precio + '}';
    }

    
}
