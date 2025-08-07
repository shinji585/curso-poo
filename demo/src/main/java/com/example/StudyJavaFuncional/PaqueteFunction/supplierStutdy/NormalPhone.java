package com.example.StudyJavaFuncional.PaqueteFunction.supplierStutdy;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NormalPhone<T extends Number>  extends Telefono<T>{
    
    // creamos los atributos de un smartphone 
    private boolean tiene_TecladoFisico; 
    private int bateria_en_dias; 

    public String enviarMensajeTexto(String destinario, String mensaje){
        return "Numero: " + destinario + "\nMensaje: " + mensaje;
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

    public boolean tiene_teclado(){
        return this.tiene_TecladoFisico;
    }

    public int bateriaDIas(){
        return this.bateria_en_dias;
    }
}
