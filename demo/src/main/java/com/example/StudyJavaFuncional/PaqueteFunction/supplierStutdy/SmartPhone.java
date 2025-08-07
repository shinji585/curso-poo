package com.example.StudyJavaFuncional.PaqueteFunction.supplierStutdy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SmartPhone<T extends Number> extends Telefono<T> {
    private String sistema_Operativo; 
    private boolean tiene_pantalla_tactil; 
    private int camaraPrincipal; 


    // implementamos los metodos 
    public void descargarAplicaciones(String name_app){
           System.out.println("la aplicacion -> " + name_app + " se esta descargando");
    }

    public void tomarPhots(){
        System.out.println("tomando la foto con la camara de " + this.camaraPrincipal + " pixeles");
    }

     // implentamos los metodos de telefono 
    @Override
    public void hacer_llamada(Number numero){
        System.out.println("llamado a el numero -> " + numero);
    }

    @Override
    public void devolver_llamada(Number numero){
        System.out.println("Devolviendo la llamada a -> " + numero);
    }

    // implementamos el metodo de verificar carga 
    @Override
    public T verificar_Carga(){
      System.out.println("Verificando carga...");
      return super.verificar_Carga();
    }
}
