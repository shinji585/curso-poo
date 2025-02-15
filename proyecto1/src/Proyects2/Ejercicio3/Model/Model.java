package Proyects2.Exercise2.Ejercicio3.Model;

public abstract class Model {
    // creamos los atributos abstractos 
    protected String marca;
    protected int modelo;

    // constructor de nuestra clase abstracta 
    public Model(String marca,int modelo){
       this.marca = marca;
       this.modelo = modelo;
    }

    // creamos los getters and setters abstractos 
    public abstract void setMarca(String marca);
    public abstract String getMarca();
    public abstract void setModelo(int modelo);
    public abstract int getModelo();

    // creamos los metodos de nuestro modelo 
    public abstract void frenar(boolean a);
    public abstract void acelerar(boolean b);

    // metodo tostring sobre escrito 
    @Override
    public String toString(){
        return "marca: " 
        + this.marca 
        + "\nmodelo: " 
        + this.modelo;
    }
}
