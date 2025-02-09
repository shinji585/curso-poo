package Polimorfismo;
import java.util.*;
public class Polimorfismo {
    public static void main(String[] args) {
        CocheElectrinco cohe = new CocheElectrinco(0, "volar", "Qatar Airways", 185, 15000, "EC-HCF");
        cohe.MostrarInfo();
        // ahora aplicaremos un poco de polimorfismo 
        System.out.println();
        Electronicos electronico = new Celular(100, "apple", "portatil", "negro");
        electronico.MostrarInfo();
    }
}
class Electronicos{
    static Scanner s = new Scanner(System.in);
    private int capacidad; 
    private String funcionalidad;
    private String marca; 
    // creamos dos metodos 
    public Electronicos(int capacidad,String funcionalidad,String marca){
        this.capacidad = capacidad;
        this.funcionalidad = funcionalidad;
        this.marca = marca;
    }
    public Electronicos(){
       // metodo vacio    
    }
    // creamos los setters
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setFuncionalidad(String funcionalidad){
        this.funcionalidad = funcionalidad;
    }
    // creamos los getters 
    public String getFuncionalidad(){
        return this.funcionalidad;
    }
    public String getMarca(){
        return this.marca;
    }
    public int getCapacidad(){
        return this.capacidad;
    }
    // implementamos metodos padres 
    public int bateria(int oputCapacidad){
        while (oputCapacidad< 0){
            System.out.print("el dispostivo esta apagado\nPor favor conectelo a cargar: ");
            while (!s.hasNextInt()) {
                System.out.print("la entrada es incorrecta por favor ingrese lo que se le esta solicitando: ");
                s.next();
            }
              oputCapacidad = s.nextInt();
        }
        
        return this.capacidad = oputCapacidad;
    }
    public void MostrarInfo(){
        System.out.printf("\nsu dispositovo es %s ------ tiene una capacidad de %d ------ su funcionalidad es %s\n",this.marca,this.capacidad,this.funcionalidad);
    }
}
// creamos una nueva clase que implemente y herede la funcionalidad de nuestra clase electronico 
class CocheElectrinco extends Electronicos{
    private int  NmPasajero;
    private double precio; 
    private String placa; 

    // creamos dos constructores 
    public CocheElectrinco(){
        // constructor vacio 
    }
    public CocheElectrinco(int capacidad,String funcionalidad,String marca,int NmPasajero,double precio,String placa){
        super(capacidad, funcionalidad, marca);
        this.NmPasajero = NmPasajero;
        this.precio = precio;
        this.placa = placa;
    }
    // Getter para NmPasajero
    public int getNmPasajero() {
        return NmPasajero;
    }

    // Setter para NmPasajero
    public void setNmPasajero(int nmPasajero) {
        this.NmPasajero = nmPasajero;
    }

    // Getter para precio
    public double getPrecio() {
        return precio;
    }

    // Setter para precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getter para placa
    public String getPlaca() {
        return placa;
    }

    // Setter para placa
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    // ahora implementamos lo que seria la herencia aplicando la sobre escritura de uno de sus metodos y tambien solciitamos la 
    @Override
    public void MostrarInfo(){
        System.out.printf("\nsu dispositovo es %s ------ tiene una capacidad de %d ------ su funcionalidad es %s\n",getMarca(),getCapacidad(),getFuncionalidad());
        System.out.printf("el precio del vehiculo es %.2f ---- su numero de placa es %s ----- la cantidad de pasajeros del vehiculo es %d", this.precio,this.placa,this.NmPasajero);
    }
}
class Celular extends Electronicos{
    private String color; 
    public Celular(int capacidad,String marca,String funcionalidad,String color){
        super(capacidad, funcionalidad, marca);
        this.color = color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public  String getColor(){
        return this.color;
    }
    public void MostrarInfo(){
        System.out.printf("\nsu dispositovo es %s ------ tiene una capacidad de %d ------ su funcionalidad es %s\n",getMarca(),getCapacidad(),getFuncionalidad());
        System.out.println("el color de su celular es: " + this.color);
    }

}