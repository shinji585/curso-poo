package Interfaces;


public class Ejercicio2Interfaces {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(5, 7);
        System.out.println(calculadora.sumar());
        System.out.println(calculadora.restar());
        System.out.println(calculadora.multiplicar());
    }
}
// creamos la interfaces 
interface Operaciones {

    // creamos los metodos sumar, restar y multiplicar 
    public int sumar();
    public int restar();
    public double multiplicar();

}
// creamos la clase calculadora 
class Calculadora implements Operaciones{
    private int numero1;
    private int numero2;

    public Calculadora(int numero1,int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // creamos un  metodo que nos devuelva todos los numeros del vector 
    public int getnumero1(){
        return this.numero1;
    }
    public int getnumero2(){
        return this.numero2;
    }

    // implementamos los metodos 
    @Override 
    public int sumar(){
         return getnumero1() + getnumero2();
    }
    @Override
    public int restar(){
        return getnumero1()  - getnumero2();
    }
    @Override 
    public double multiplicar(){
        return getnumero1() * getnumero2();
    }
}