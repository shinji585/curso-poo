package com.example.StudyJavaFuncional;

import java.util.List;

public interface Fundamentos {

    /*
     * en esta seccion se estaran estudiando los fundamentos que se veran en el curso 
     * 
     * ok las interfaces  son un caso mas complejo de lo que suponia inicialmente ya que creia estas solo serviaran para activar la herencia multiple en java pero no nuevos conceptos como permitir crear clases anonimas con ellas permitir crear metodos privados o por default en la misma clase son los que hacen que sea mas rapido y flexible hacer trabajo en ella 
    */

    // supongamos que esta interfaz fundamentos tenga los dos siguientes metodos 

    void showTopics(String nameTopic);
    int evaluarStudy(List<String> example);

    default void mostrarCalificaciones(){
        int calificacion = calificarEvaluacion();
        System.out.println("tu calificacion es de " + calificacion);
    }
    // ahora esos metodos son publicos y los podemos aplicar en cualquier otra parte de nuestro proyecto pero podemos definir en cierto modo metodos staticos de la misma clase o probados que sea capaces de evaluar en la interfaz que se haga eso acaso se viola el concepto de responsabilidad unica al permitir esto que una interfaz ya no solo permita trabajar con nuevos metodos sin no que trabaje con sus mismos metodos 
    private int calificarEvaluacion(){
       // obtenemos la calificacion 
       return (int) Math.random() * 100; 
    }

    static void mostrarAdvertencias(){
        System.out.println("deja de copiarte en el examen");
    }
    
}

    

