package Proyects2.Exercise2.Model;

public abstract class Productok {
   // cremos dos atributos y metodos para acceder esto y mostrar detalles acerca de los productos 

   protected String name; 
   protected double precio;

   // creamos un constructor ya que aunque sean abstractos los atributos estos se tinenen que inicializar 
   public Productok(String name,double precio){
       this.name = name;
       this.precio = precio;
   }
   

   // creamos metodos abstractos para acceder a estos como getters and setters 
   public abstract void setName(String name);
   public abstract String getName();
   public abstract void setPrecio(double precio);
   public abstract double getPrecio();

   // creamos lo que seria un metodo abstracto llamado mostrar detalles pero sobre escribiendo tambien el tostring para que esto sea mas facil 

   @Override 
   public String toString(){
    return "nombre: " 
    + this.name 
    + " precio = " 
    + this.precio;
   }

   // creamos el metodo mostrar precio
   public abstract void mostrarDetalles();
    
} 
