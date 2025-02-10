package Proyects.Model;

import Proyects.Service.*;;

public class Model1 extends Service{
    

    public Model1(String nombre,int edad){
      super(nombre, edad);
    }

    // implementamos los metodos 
    @Override
    public void trabajar(){
        System.out.println("el estudiante " + this.nombre + " esta trabajando ");
    }
    @Override
    public void descansar(){
        System.out.println("el estudiante " + this.nombre + " esta descansando ");
    }
}
