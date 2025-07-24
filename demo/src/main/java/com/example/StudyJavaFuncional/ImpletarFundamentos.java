package com.example.StudyJavaFuncional;

import java.util.List;

public class ImpletarFundamentos {
    public static void main(String[] args) {
        // ahora dos cosas primero vamos a ver que son las clases anonimas 
        Fundamentos calificacion = new Fundamentos() {
            @Override
            public void showTopics(String nameString){
                System.out.println("su tema a estudiar es  " + nameString);
            }

            @Override
            public int evaluarStudy(List<String> example) {
                return (int) Math.random() * 100; 
            }
        };

        // ahora calficacion es una clase anonima se comporta como ella mas no es una clase como tal solo tiene los metodos que esta implementa o sobre escribe por culpa de la interfaz Fundamentos 
        calificacion.showTopics("matematica");

        int resultado = calificacion.evaluarStudy(List.of("calculo integral","algebra lineal"));
        System.out.println("el resultado de la nota es " + resultado);

        // ahora que pasa con los metodos por defectos o privados dentro de Fundamentos 
        calificacion.mostrarCalificaciones(); // es la funcion de default 
    }
    
}
