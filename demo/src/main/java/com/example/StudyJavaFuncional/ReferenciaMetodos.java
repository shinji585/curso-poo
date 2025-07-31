package com.example.StudyJavaFuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.IntStream;

public class ReferenciaMetodos {
    /*
     * en esta seccion estare estudiando las referencias a metodos su funcionamiento
     * y la forma correcta de utilizarlos
     * 
     * 
     * en este tipo de forma de tratar los metodos de un objecto o valor los mismo
     * metodos se comportan por referencia (objectos) pero no del todo como objectos
     * en el sentido de programacion orientada a objectos si no que se comportan mas
     * como un metodo interfaz funcional es decir una funcion anonima que cumple con
     * cierta forma
     */

    /*
     * las referencias a métodos se pueden utilizar cuando una expresión lambda
     * simplemente llama a un método sin modificar sus parámetros.
     */

    public static void main(String[] args) {
        /*
         * en este tipo de metodos de referencia se dan de 4 formas ya que tenemos en
         * cuatro forma en java de representar los valores en java de forma estatica. de
         * un objecto especifico,de forma arbirtraria, y en forma de constructor
         */

        formaObjecto();

        // las referencias estaticas son todas aquellas que pertenece a la misma clase y
        // que ademas de eso no tenemos que pasarle nada
        List<Integer> posiblesPrimos = List.of(131, 7, 97, 25, 43, 118, 59, 149, 81, 103, 122, 37, 73, 90, 113);

        // el paso por referencia estatica entonces tendria que funcionar asi
        Function<List<Integer>, List<Integer>> funcion = ReferenciaMetodos::primosLista;

        // ahora lo que hacemos es utilizar funcion

        List<Integer> listaPrimos = funcion.apply(posiblesPrimos);

        System.out.println(listaPrimos);
    }

    static void formaObjecto() {
        // tenemos una lista por ejemplo
        List<Integer> numeros = new ArrayList<>(10); // que tendra 10 numeros inicialmente

        // y queremos darle 10 valores de forma en expresion lambda seria
        IntStream foStream = IntStream.range(1, 21); // lo que le decimos es que itere desde 1 hasta 21 almacenando
                                                     // desde 1 hasta 20

        // para agregar los numeros seria
        // foStream.forEach( e -> numeros.add(e)); // agregamos el valor e a la lista

        // vscode no nos lo va a decir pero otros entornos como intellij si y es que
        // aqui podemos aplicar un metodo por referencia ya que numeros es un objecto es
        // una referencia de list de tipo integer y la forma que tenemos para hacerlo es

        foStream.forEach(numeros::add); // esto aplica lo mismo que tenemos mas arriba solo que el mismo compliador se
                                        // encarga de hacer todo no de forma implicita haciendo el codigo de mas alto
                                        // nivel
        System.out.println(numeros);

        Persona empleado = crarPersonaFuncional("samuel", 19);
        System.out.println(empleado.toString());
    }

    static List<Integer> primosLista(List<Integer> lista) {
        /*
         * en esta buscaremos y agregaremos numeros primos
         */
        List<Integer> listaPrimos = new ArrayList<>();

        // recorremos la lista
        for (Integer integer : lista) {
            if (isprimo(integer)) {
                listaPrimos.add(integer);
            }
        }
        return listaPrimos;
    }

    static boolean isprimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // los metodos por constructo son aquellos que nos crean objectos y nos devuelve
    // el valor sin uno tener que estar declarando varios constructores arbitrarios
    static Persona crarPersonaFuncional(String name, int edad) {
        BiFunction<String, Integer, Persona> crear = Persona::new;
        Persona persona = crear.apply(name, edad);

        return persona;
    }

}

record Persona(String nombre, int edad) {
}