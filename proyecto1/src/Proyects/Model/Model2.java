package Proyects.Model;

import Proyects.Service.*;;

public class Model2 extends Service {


    public Model2(String nombre,int edad){
        super(nombre, edad);
      }
  
      // implementamos los metodos 
      @Override
      public void trabajar(){
          System.out.println("el profesor " + this.nombre + " esta trabajando ");
      }
      @Override
      public void descansar(){
          System.out.println("el profesor " + this.nombre + " esta descansando ");
      }
}
