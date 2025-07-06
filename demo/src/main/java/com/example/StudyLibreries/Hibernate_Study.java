package com.example.StudyLibreries;

public class Hibernate_Study {
    /*
     * en esta seccion estudiaremos mas en profundida lo que seria jakarta validator la forma en como utilizarlo para poder utilizarlo correctamente en nuestros proyectos que se realizan mas adelante incluido en las validaciones que queremos que tenga nuestros programas 
     */


     /*
      * para dicho proyecto en esta clase estaremos realizando un ejemplo de ello esta clase solo sera de pruebas es decir que aca vendre a testear todo lo que pruebe en las otras 
      */


      public static void main(String[] args) {
        // probaremos acontinuacion la anotacion null haber que pasa 
        Usuario usuario = new Usuario(); 

        usuario.setNombre("samuel");
        usuario.setEmail(null);

        Validar_Usuario validar_Usuario = new Validar_Usuario(usuario);

        validar_Usuario.Validador();


      }
}
