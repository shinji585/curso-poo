package Herencia;

public class Practica {
    public static void main(String[] args) {
       
        Vehiculo vehiculo = new Vehiculo("BMW", "carro", 35000.500, 359.78, 50, "AFX-2456");
        // mostrclsamos informacion 
        vehiculo.Mostrarinfo();
        vehiculo.sonido();
    }
}
class Vehiculo extends Complemento{
    private String marca; 
    private String tipo;
    private double precio; 
    // creamos dos constructores uno vacio y uno con valores 
    public Vehiculo(String marca,String tipo, double precio,double velocidad,double gasolina,String placa){
        super(gasolina, velocidad, placa);
        this.marca = marca;
        this.tipo = tipo;
        this.precio = precio;
    }
    // creamos los setter 
    public void Setmarca(String marca){
        this.marca = marca;
    }
    public void Settipo(String tipo){
        this.tipo = tipo;
    }
    public void Setprecio(double precio){
        this.precio = precio;
    }
    // creamos los getters 
    public String Getmarca(){
        return this.marca;
    }
    public String Gettipo(){
        return this.tipo;
    }
    public double Getprecio(){
        return this.precio;
    }
    // creamos un metodo para mostrar la informacion 
    public void Mostrarinfo(){
        System.out.printf("el tipo de vehiculo es %s\n Su marca es %s\n El precio actualmente por el vehiculo es %.2f\n Su velocidad maxima es %.2f\n El total de gasolina es %.2f\n Su numero de placa es %s", this.tipo,this.marca,this.precio,Getvelocidad(),Getgasolina(),Getplaca());
    }
    // metodo sobre escritor 
    @Override
    public void sonido(){
        System.out.println("\ntufutufutuutufutur broroooooorororoo");
        System.out.println("ejemplo sobrescritura super");
        super.sonido();
    }
}