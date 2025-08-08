package com.example.StudyJavaFuncional.PaqueteFunction;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class FuncionesEspeciales {
    /*
     * ahora vamos a analizar un tipo que es especial ya que a diferencia de la interfaz funcional functional que nos permite trabajar con tipos de datos del mismo tipo es muy engorroso estar trabajando con algo que se retonra el mismo entonces a estos de oracle o de java le gusta tener muchas cosas en su lenguaje que sirve y que no sirve y crearon lo mismo pero en vez de recibir dos parametros recibe uno solo 
     */

     public static void main(String[] args) {
        UnaryOperator<Integer> aumentar_por_dos = x -> x + 2; 

        System.out.println(aumentar_por_dos.apply(2)); // listo hace lo mismo 


        // tiene una version en la cual recibe dos parametros, se me olvida el mismo valor que se especifica es decir el tipo de dato que estemos manejando correspondera a el mismo tipo de salidad 

        BinaryOperator<Integer> aumentar_dos_numeros = (a,b) -> (a + b) * 2; 

        System.out.println("la suma de dos numeros aumentada en dos -> " + aumentar_dos_numeros.apply(2, 2));
     }
}
