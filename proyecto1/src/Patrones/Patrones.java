package Patrones;
/**
 * @autor: samuel vargas 
 * @since 03/02/2025
 * nombre del archivo: Patrones  
 * funcionalidad: nos permite visualizar el uso y la forma en que   aplicamos patrones de diseños para que nuestro codigo se vea mas  limpio 
 */

public class Patrones {
  // en esta clase estudiaremos patrones de diseños enfocados en poo
    
  // variable estatica que nos dice el tipo de animal  
    private  static  String  Tipo; 
    
   // variables de instancias 
    private int numeroPatas; 
    private String color; 
  

    /**
     * 
     * @param color
     * @param numeroPatas
     * @param tipo
     */
    // constructor 
    public Patrones(String color,int numeroPatas,String tipo){
        this.numeroPatas = numeroPatas;
        this.color = color;
        Patrones.Tipo = tipo;
    }

    // metodo que muestra informacion 
    public void Mostrar(){
        System.out.println("el tipo de animal es " + Patrones.Tipo);
        System.out.println("el color del animal es " + this.color);
        System.out.println("la cantidad de patas del animal es "
         + this.numeroPatas);
    } // fin del metodo mostrar 


}
