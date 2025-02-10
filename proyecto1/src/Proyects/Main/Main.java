package Proyects.Main;

import Proyects.Model.Model1;
import Proyects.Model.Model2;

public class Main {
  public static void main(String[] args) {
    // creamos un objecto de tipo persona y aplicamos polimorficos con profesor y estudiante 

     Model1 persona1 = new Model1("santiago", 15);
    
     persona1.trabajar();

     persona1.descansar();

     System.out.println(persona1);

     // creamos un objecto de tipo model2 
     Model2 model2 = new Model2("samuel", 20);

      model2.trabajar();

      model2.descansar();

      System.out.println(model2);
  }   
}
