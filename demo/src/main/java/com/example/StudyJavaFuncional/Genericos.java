package com.example.StudyJavaFuncional;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Genericos<N extends Number> {


    /*
     * en esta seccion estudiaremos los genericos que es una forma de parametrizar nuestras clases de cualquier tipo abstractas privadas o publicas y las interfaces como tal que no sotros tenemos en java esto con el fin que podamos crear clases de cualquier tipo y que esta almacene tipo de datos de cualquier tipo que coincidan en tiempo de ejecucion 
     * 
     * para permitir dicha parametrizacion se hace agregando un elemento <> entre las llaves a la clase y especificandole segun una convencion el tipo con el cual queremos trabajar a el compilador 
     * 
     * 
     * estas tienen una nomenclarturas que tengo que estudiarlas desde ya, ya que si no las domino estare fallando en entender estos conceptos 
     * 
     * T = type (tipo general de dato)
     * E = element(usado en colecciones como list<E>)
     * K = key (usado en mapas del tipo Map<K,V)
     * V = value (usado en mapas)
     * N = number(usado cuando se espera un numero)
     * 
     * por ejemplo en esta clase simularemos una calculadora que puede hacer cualquier tipo de operaciones
     */
  
     
     // definimos dos atributos 
     private N a; 
     private N b;

     public Genericos(){} // constructor 
     // entonces como creamos un constructor correcto puesto creando unicamente vacio  aqui lo que decimos es que recibimos a de tipo N y b de tipo N
     public Genericos(N a,N b) {
        this.a = a;
        this.b = b;
     } 

     // realizar sumas 
     /**
     * @return
     */
    public int sumar(){
        return a.intValue() + b.intValue();
     }

    public int restar(){
        return a.intValue() - b.intValue();
    }
    
    public long multiplicacion(){
        return a.longValue() * b.longValue();
    }

    public double division(){
        return a.doubleValue() / b.doubleValue();
    }


    
     

     // lo que estamos diciendo arriba es que a y b pueden ser de cualquier tipo 

    // public Genericos(int a, int b){
    //  this.a = a;  esto da error asi que no lo hagas mal en el futuro  
    //  this.b = b; 
    // }


    // ahora podemos testear esta clase para ver si funciona y puede restar cualquier tipo de numero 

    public static void main(String[] args) {
        Genericos<Integer> suma = new Genericos<>();

        suma.setA(10);
        suma.setB(20);

        System.out.println("la suma de 10 y 20 es: " + suma.sumar());
    }
    
}
