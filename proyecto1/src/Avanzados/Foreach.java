package Avanzados;

import java.util.ArrayList;

/*
   * en este apartado estudiemos lo que seria el ciclo for each y todo sobre este su funcionamiento y la forma correcta en que debemos utilizarlo en todo momento 
   */

public class Foreach {

    public static void main(String[] args) {
      Perro perro = new Perro("moverse", 4, "negro");
      ArrayList<Perro> p = new ArrayList<>();
     
      p.add(perro);

      for (Perro perro2 : p) {
        System.out.println(perro2);
      }
    }
}
class Perro{
    private String accion; 
    private int numeroPatas;
    private String color; 
    private static  int id = 0;
    private int ID; 

    // creamos un constructor 
    public Perro(String accion,int numeroPatas,String color){
      this.accion = accion;
      this.numeroPatas = numeroPatas;
      this.color = color;

      // creamos un contador de objectos 
      ID += Perro.id;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getID() {
        return this.ID;
    }
   
   // sobre escribimos el tostring 
   @Override
   public String toString(){
    return "la accion del perrro es "
    + getAccion() 
    + " el numero de patas es " 
    + getNumeroPatas()
    + " el color del perro es " + getColor();
   }  
}