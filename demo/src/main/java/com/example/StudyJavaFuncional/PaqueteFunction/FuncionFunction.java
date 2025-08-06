package com.example.StudyJavaFuncional.PaqueteFunction;


import java.util.function.Function;

public class FuncionFunction {
    /*
     * en esta seccion se estudiara la funcion dentro del paquete
     * java.util.functional.function la cual recibe un parametro de t tipo y
     * devuelve un valor de r tipo
     */

    // --- compose(Function before) ---
    // Se usa para componer funciones donde la función "before" se ejecuta primero.
    // Es decir, primero se ejecuta la función pasada como argumento (antes),
    // y luego se ejecuta la función actual.
    // Ejemplo lógico: f.compose(g) => f(g(x))
    // Útil cuando necesitas preprocesar un valor antes de aplicar la función
    // principal.

    // --- Precaución con compose ---
    // Si la función "before" retorna null o un tipo no compatible con la función
    // principal,
    // puede lanzar NullPointerException o ClassCastException.

    // --- andThen(Function after) ---
    // Se usa para componer funciones donde la función actual se ejecuta primero,
    // y luego se ejecuta la función "after" que se pasa como argumento.
    // Ejemplo lógico: f.andThen(g) => g(f(x))
    // Útil cuando quieres postprocesar el resultado de la función principal.

    // --- Diferencia principal entre compose y andThen ---
    // compose: primero aplica la función pasada (antes) y luego la función actual.
    // andThen: primero aplica la función actual y luego la función pasada.
    // El orden en el que se llaman las funciones puede afectar el resultado final,
    // especialmente si hay efectos secundarios, nulls, o transformaciones de tipos.

    // ahora sabemois que podemos function tiene dentro de 3 metodos importantes hasta el momento apply, compose y andThem que sus acciones son las siguientes: el primero apply aplica la expresion lambda que le estamos pasando el segundo compose aplica primero la function que le pasamos y luego la function que la llama y el andThem hace es el proceso inverso 

    // nota: esta interfaz es utilizada para transformar datos, es decir consumir de convertir de un tipo a otro 
    static Function<String,Integer> strToint = Integer::parseInt;
    // en la anterior expresion lo que estamos haciendo es convertir de estring a integer pero que pasaria si quisiramos ahora de integer (entero) a char para ver su representacion ascii 
    static Function<Integer,Character> intTochar =  i -> (char)(int)i; 


    // ahora tenemos dos opciones que las vamos a envolver en dos funciones distintas 
    public static void before(){
        Function<String,Character> before = intTochar.compose(strToint);
        /*
         * lo que se dice aqui es primero aplica el strtoint es decir registra un str y devuelve le el int a intotchar y el por ultimo aplica su funcion lambda y que me devuelva ese valor a mi 
         */

         System.out.println(before.apply("157"));
    }

    // ahora con el metodo andThem 
    public static void  after(){
        Function<String,Character> after = strToint.andThen(intTochar);

        /*
         * aqui se hace algo casi similar solo que primero toma el String luego calcula su longitud y despues se lo pasa a intTochar que me devuelve el char correspondiente en ascci es lo mismo solo que a lo inverso 
         */

        System.out.println(after.apply("65"));
    }

    public static void main(String[] args) {
        try {
            System.out.println("Before: ");
            before();
            System.out.println("\nAfter");
            after();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
