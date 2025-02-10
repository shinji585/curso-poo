package Proyects.Service;

public  abstract class Service {
    protected String nombre;
    protected int edad; 

    // creamos un constructor para poder aplicar la herencia 
    public Service(String nombre, int edad){
         this.nombre = nombre;
         this.edad = edad;
    }
    // constructor vacio 
    public Service(){}

    // creamos unos metodos abstractos 
    public abstract void trabajar();
    public abstract void descansar();

    @Override
    public String toString(){
        return "nombre: " 
        + this.nombre 
        + "\nedad: " 
        + this.edad;
    }
}
