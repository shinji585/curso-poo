package com.example.StudyJavaFuncional.PaqueteFunction;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;


public class Functional1 {
    // 1. Function<T, R> es una interfaz funcional:
    // Representa una función que toma un argumento de tipo T y devuelve un valor de
    // tipo R.

    // 2. Se pueden definir funciones lambda usando esta interfaz:
    // Por ejemplo: Function<Integer, Integer> cuadrado = x -> x * x;

    // 3. Estas funciones se pueden pasar como argumentos a otros métodos:
    // Esto permite simular lo que hace Python al pasar funciones como parámetros.

    // 4. Para ejecutar la función lambda usamos .apply(valor):
    // Ejemplo: int resultado = cuadrado.apply(5); // devuelve 25

    // 5. Las funciones también pueden componerse con andThen() y compose():
    // andThen: primero se aplica la función original, luego la siguiente.
    // compose: primero se aplica la función pasada como parámetro, luego la
    // original.

    // 6. Todo esto forma parte del paquete java.util.function y permite
    // programación funcional,
    // haciendo el código más flexible, reutilizable y expresivo.


    /*
     * en funcion de lo anterior se analizara el paquete java.util.Functional el cual contiene dentro de el funciones anonimas que nos permite crear nuestras propias expresiones lamabdas y extender el scope que tenemos en java haciendo que podamos pasar funciones a funciones o pasar funciones a variables 
     */

     static BiFunction<Integer,Integer,Integer> compareToInteger = Integer::compareTo;

     // creamos una funcion anonima para imprimir 
     static Consumer<String> print = System.out::println;

     static Scanner sc = new Scanner(System.in);

    public static void compararNumeros(){

        System.out.print("ingrese un numero 1: ");
        int number1 = sc.nextInt();

        System.out.print("ingrese un numero 2: ");
        int number2 = sc.nextInt(); 


        // ahora que es lo que podemos hacer es una comparacion utilizando comparetointeger y imprimiendo el resultado

        if (compareToInteger.apply(number1, number2) == -1){
            print.accept("el numero " + number2 + " > " + number1);
        }else{
            print.accept("el numero " + number1 + " > " + number2);
        }
     }

     public static void main(String[] args) {
        compararNumeros();
     }
     
}
