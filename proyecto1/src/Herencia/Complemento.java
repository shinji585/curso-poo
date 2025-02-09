package Herencia;

public class Complemento {
    private double gasolina; 
    private double velocidad;
    private String placa; 
    // creamos un constructor vacio y uno inicilizado
    public Complemento(double gasolina, double velocidad,String placa){
        this.gasolina = gasolina;
        this.velocidad = velocidad;
        this.placa = placa;
    }
    public Complemento(){
    }
    // creamos los setters
    public void Setgasolina(double gasolina){
        this.gasolina = gasolina;
    }
    public void Setvelocidad(double velocidad){
        this.velocidad = velocidad;
    }
    public void Setplaca(String placa){
        this.placa = placa;
    }
    // creamos los getters 
    public double Getgasolina(){
        return this.gasolina;
    }
    public double Getvelocidad(){
        return this.velocidad;
    }
    public String Getplaca(){
        return this.placa;
    }
    public void sonido(){
        System.out.println("bfrrrrrrrrsuuuu");
    }
}
