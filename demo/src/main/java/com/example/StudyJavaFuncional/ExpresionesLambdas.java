package com.example.StudyJavaFuncional;

import java.util.ArrayList;
import java.util.List;



public class ExpresionesLambdas  implements Operacion {
    
    /*
     * las expresiones lambdas son funciones sin "nombre" pero que en realidad el sin nombre no es que sea por que se definen en un solo bloque de forma corta no las funciones lambdas son funciones que a cada termino que le llegue le asigna una operacion y al asignar una operacion estas realizan dicha accion 
     */

     /**
     * @param args
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

        int resultado =   sumar.aplicar(10, 20);

        System.out.println(resultado);

        // esta tambien puede tener operaciones por defual explicando el tipo de operacion que se tiene que realizar en si y la cual no podemos cambiar 

        // ahora digamos que queremos tener ecuaciones queremos tener una interfaces que nos permita hacer las ecuaciones que nosotros queramos y que esta tenga ciertas hay de rapido acceso 
        Ecuaciones lineal = (x) ->  10*x + 15;
        
        System.out.println(lineal.obtenerValor(10));

        // si quisieramos obtener las que vienen por default tendriamos que hacer 
        System.out.println(lineal.cuadratica(10, 20));


        // creamos un objecto de tipo operacion

        Operacion logaritmos = (a,b) ->  (int) Math.log10(a) + b;
        
        // la pregunta es podemos llamar a el metodo excecute sin tener que sobre escribirlo y que nos haga la accion que estamos pensando 
        System.out.println(logaritmos.excecute(10, 20)); // nos muestra en si la suma entonces si queremos acceder a el metodo excecute tendriamos que sobre escribirlo en dicha clase anonima 

        
        Operacion logaritmica = new Operacion() {
            @Override
            public double excecute(int a, int b) {
                return (int) Math.log(a) + b;
            }

            @Override
            public int aplicar(int a, int b) {
                return a+b;
            }
        };

        // ahora si queremos acceder a dichos elementos los hariamos de la forma 
        System.out.println(logaritmica.excecute(10, 20)); // y ya no nos devolveria 30 si no 22.0



     }

     // si queremos que dicha accion se aplique tendriamos que hacer 
     // nota: despues de investigar esto o no es posible o tengo un error ya que la unica forma de sobre escribir dicho metodo es creando una clase anonima de el y cambiando su implementacion
     @Override
     public int aplicar(int a, int b) {
        return (int) Math.log(a) + b;
     }
}
@FunctionalInterface 
interface Operacion {
    int aplicar(int a,int b);

    default double excecute(int a, int b){return a+b;}
}


@FunctionalInterface
interface Ecuaciones{
    int obtenerValor(int x);

    // creamos las funciones por default
    default double lineal(int x,int y){return (x+y);}
    
    default double cuadratica(int x,int y){return Math.pow(x, 2) + y;}
}