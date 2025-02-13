package Interfaces;

public interface Interfaces {
   String especie = "perro";

    public void ladrar(boolean a);
    
}
class  Perro implements Interfaces  {
   
    private String name; 
    private int edad; 

    public Perro(String name,int edad){
        this.edad = edad;
        this.name = name;
    }

    // implementamos el metodo de ladrar
    @Override
    public void ladrar(boolean a){
       if (a == true){
        
        System.out.println( this.name + " guauauguau");
       }
    }

    public void Mostrarinfo(){
        System.out.println(especie 
        + " se llama " 
        + this.name 
        + " tiene una edad de " 
        + this.edad);
    }
    
}
class Prueba{
    public static void main(String[] args) {
        Interfaces prueba = new Perro("key", 4);

        prueba.ladrar(true);

        // recordar que no se puede implementar en un tipo de dato un metodo que esta definido en memoria de otra forma 
        Perro prueba2 = new Perro("meldow", 2);

        prueba2.ladrar(false);
        
        prueba2.Mostrarinfo();
    }
}