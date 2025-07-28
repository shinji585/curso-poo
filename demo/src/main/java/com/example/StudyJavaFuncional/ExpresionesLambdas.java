package com.example.StudyJavaFuncional;

import java.util.ArrayList;
import java.util.List;

public class ExpresionesLambdas {
    
    /*
     * las expresiones lambdas son funciones sin "nombre" pero que en realidad el sin nombre no es que sea por que se definen en un solo bloque de forma corta no las funciones lambdas son funciones que a cada termino que le llegue le asigna una operacion y al asignar una operacion estas realizan dicha accion 
     */

     public static void main(String[] args) {
        /*
         * por ejemplo en java tenemos el foreach que es una forma facil y que trae el lenguaje de visualizar como esto funciona 
         */

         List<String> lenguajes_programacion_nombres = new ArrayList<>(List.of("rust","python","c++","c","java","golang","perl","ruby","js","typescript"));

         // la forma funcional de recorrer esto es 
         lenguajes_programacion_nombres.forEach(e -> {
            System.out.println(e);
         });

        // esta viene siendo la segunda forma  lenguajes_programacion_nombres.forEach(System.out::println); 

        /*
         * ahora para crear nuestras lambdas tenemos que crear un marco utilizando una interfaz funcional que los que nos permite es decirle a el compilador que esa funcion que parece que se le asigna a una variable en realidad no es y que esta realizando una accion valga la redundancia  esta solo tiene un metodo la cual se encarga de verificar la cantidad de metodos (funciones) que se estan creando ya que solo soporta uno no la podemos declarar dentro de main la interface funcional si no fuera de esta 
         */

         Operacion sumar = (a,b) -> a + b;
         
         // ahora podemos utilizar sumar en cual quier otra parte por ejemplo 

        int resultado =  sumar.aplicar(10, 20);

        System.out.println(resultado);

        // esta tambien puede tener operaciones por defual explicando el tipo de operacion que se tiene que realizar en si y la cual no podemos cambiar 

        // ahora digamos que queremos tener ecuaciones queremos tener una interfaces que nos permita hacer las ecuaciones que nosotros queramos y que esta tenga ciertas hay de rapido acceso 
        Ecuaciones lineal = (x) ->  10*x + 15;
        
        System.out.println(lineal.obtenerValor(10));

        // si quisieramos obtener las que vienen por default tendriamos que hacer 
        System.out.println(lineal.cuadratica(10, 20));



     }
}
@FunctionalInterface
interface Operacion {
    int aplicar(int a,int b);
}


@FunctionalInterface
interface Ecuaciones{
    int obtenerValor(int x);

    // creamos las funciones por default
    default double lineal(int x,int y){return (x+y);}
    
    default double cuadratica(int x,int y){return Math.pow(x, 2) + y;}
}