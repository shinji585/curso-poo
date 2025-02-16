package Interfaces.EjercicioInterfaces1.InterfaceModel;

public abstract class Comida implements Saludables {
    // creamos los atributos de nuestra plantilla general llamada comida 
    protected double CantidadAzucar;
    protected String tipo;
    protected double calorias;
    protected double cantidadProteinas;

    // creamos el constructor de nuestra clase 
    public Comida(double CantidadAzucar,String tipo,double calorias,double cantidadProteinas){
        this.CantidadAzucar = CantidadAzucar;
        this.tipo = tipo;
        this.calorias = calorias;
        this.cantidadProteinas = cantidadProteinas;
    }

    // implemtamos los getters and setters de nuestros atirbutos 
    public abstract void setCantidadAzucar(double a);
    public abstract double getCantidadAzucar();
    public abstract void setTipo(String b);
    public abstract String getTipo();
    public abstract void setCalorias(double c);
    public abstract double getCalorias();
    public abstract void setCantidadProteinas(double d);
    public abstract double getCantidadProteinas();


    // implementaciones del metodo es saludables de forma abstracta 
    @Override
    public abstract boolean esSaludables();
}
