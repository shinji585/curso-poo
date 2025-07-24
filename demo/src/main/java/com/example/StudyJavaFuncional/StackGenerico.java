package com.example.StudyJavaFuncional;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;




public class StackGenerico <T>{

    /*
     *  en esta clase estaremos replicando el funcionamiento de una statck utilizando los genericos 
     */

     private T[] valores; 
     private int tope; 

     // creamos un metodo vacio para inicializar lo que viene siendo los valores 

    public StackGenerico(Class<T> clazz){
        this(clazz, 10);
     }


     @SuppressWarnings("unchecked")
    public StackGenerico(Class<T> clazz,int capacidad){
        this.valores = (T[])  Array.newInstance(clazz, capacidad);
        this.tope = -1;
     }

     // creamos el metodo push que empuja los elementos 
     public void push(T elemento){
        this.valores[++tope]  = elemento;
     }

     public T pop(){
        return  this.valores[--tope];
     }

     public boolean isEmpty(){
        return tope == -1;
     }

     public int size(){
        return tope + 1;
     }

     // creamos el emtodo que nos muestra todos los valores 
     public void forEach(){
        for (T t : valores) {
            System.out.println(t);
        }
     }


     // creamos un main 
     public static void main(String[] args) {
        StackGenerico<Integer> stackInteger = new StackGenerico<>(Integer.class);

        stackInteger.push(10);


        // cremos una lista 

        List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5,6));

        // pasamos cada valor a la stack 
        numeros.forEach(e -> {
            stackInteger.push(e);
        });

        // ahora lo que hacemos es mostrar los elementos que estan dentro de la stack 
        stackInteger.forEach();
     }
}


