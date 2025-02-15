package Proyects2.Exercise2.Ejercicio3.Service;

import Proyects2.Exercise2.Ejercicio3.Model.Model;

public class Moto extends Model {
    private int capacidad;
    private String tipoGasolina;

    // creamos el constructor de nuestra clase auto
    public Moto(String marca, int modelo, int capacidad, String tipoGasolina) {
        super(marca, modelo);
        this.capacidad = capacidad;
        this.tipoGasolina = tipoGasolina;
    }

     // implementamos los getters and setters de nuestros atributos abstractos 
     @Override
     public void setMarca(String marca) {
         this.marca = marca;
     }
     @Override
     public String getMarca() {
         return this.marca;
     }
     @Override
     public void setModelo(int modelo){
       this.modelo = modelo;
     }
     @Override
     public int getModelo(){
         return this.modelo;
     }
     // implementamos los getters and setters de nuestra clase 
     public void setCapacidad(int capacidad){
         this.capacidad = capacidad;
     }
     public int getCapacidad(){
         return this.capacidad;
     }
     public void settipoGasolina(String gasolina){
         this.tipoGasolina = gasolina;
     }
     public String gettipoGasolina(){
         return this.tipoGasolina;
     }

      // creamos los metodos de nuestra clase abstracta 
    @Override
    public void frenar(boolean a){
        if (a == true){
            System.out.println("la auto se esta deteniendo...");
        }else{
            System.out.println("el auto continua en movimiento");
        }
    }
    @Override
    public void acelerar(boolean b){
        if (b == true){
            System.out.println("el auto esta acelerando...");
        }else{
            System.out.println("el auto se esta deteniendo...");
        }
    }

    // sobre escribimos el toString 
    @Override
    public String toString(){
        return "Marca del vehiculo: " 
        + getMarca() 
        + "\nModelo del vehiculo: " 
        + getModelo() 
        + "\nCapacidad de pesajeros del vehiculo: " 
        + getCapacidad() 
        + "\nTipo de gasolina del vehiculo: " 
        + gettipoGasolina() + "\n";
    }
}
