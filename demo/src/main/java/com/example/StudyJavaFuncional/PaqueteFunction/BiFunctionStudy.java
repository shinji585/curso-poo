package com.example.StudyJavaFuncional.PaqueteFunction;

import java.util.function.BiFunction;

public class BiFunctionStudy {
    /*
     * Bifuction cumple la misma funcion que function en java solo que este recibe dos valores y retorna un unico valor 
     */
    public static void main(String[] args) {
        // por ejemplo imaginemos que tenemos la entrada de dos valores y queremos realizar una suma de ellos 


        BiFunction<Integer,Integer,Integer> sumar_dos_valores = (a,b) -> a + b;
        
        
        // tenemos los siguientes valores 
        int a = 5, b = 10;
        
        
        // y queremos sumarlos pero utilizando una interfaz funcional 
        System.out.println("la suma de los valores es -> " + sumar_dos_valores.apply(a, b));

        // y luego este nos imprime el resultado deseado eso es bifucntion rapido conciso y facil de entender 
    }
}
