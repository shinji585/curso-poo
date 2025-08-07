package com.example.StudyJavaFuncional.PaqueteFunction.supplierStutdy;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public abstract class Telefono<T extends Number>  {
     // le damos dos metodos abstractos a nuestra clase
     
     private T carga; 
     private String numeroTelefono; 
     void hacer_llamada(Number numero) {}
     void devolver_llamada(Number numero) {}


     public T verificar_Carga(){
        return this.carga; 
     }
  

}
