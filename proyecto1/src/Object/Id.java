package Object;

import java.util.HashMap;
import java.util.Scanner;



public class Id {
       public static void main(String[] args) {
        Tienda.cargarDatoPortatils();
        Tienda.Mostrarinformacion();
       }
}
class Portatil{
    private String marca; 
    private int ram; 
    private String procesador;
    private String targetaGrafica;
    private String tipoPantall;
    private static int id; 
    private static int  identificacion = 0; 
    // creamos un metodo 
    public Portatil(){}
    // metodo instanciador
    public Portatil(String marca,int ram,String procesador,String targetaGrafica,String tipoPantall){
       this.marca = marca;
       this.procesador = procesador;
       this.ram = ram;
       this.targetaGrafica = targetaGrafica;
       this.tipoPantall = tipoPantall;
       id = ++identificacion;
    }
    // creamos los getters 
    public String getMarca() {
        return marca;
    }
    public int getRam() {
        return ram;
    }
    public String getProcesador() {
        return procesador;
    }
    public String getTargetaGrafica() {
        return targetaGrafica;
    }
    public String getTipoPantall() {
        return tipoPantall;
    }
    // creamos los setters 
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public void setTargetaGrafica(String targetaGrafica) {
        this.targetaGrafica = targetaGrafica;
    }
    public void setTipoPantall(String tipoPantall) {
        this.tipoPantall = tipoPantall;
    }
    public int getId() {
        return id; // Aquí devolvemos el id único para cada instancia
    }

    public static int getIdentificacion() {
        return identificacion;
    }
    // creamos el metodo tostring 
    public String toString(){
        return "Marca: " + marca + ", Procesador: " + procesador + ", RAM: " + ram + "GB, Tarjeta Gráfica: " + targetaGrafica + ", Pantalla: " + tipoPantall;
    }
}
class Tienda{
    static Scanner s = new Scanner(System.in);
    private static HashMap<Integer,Portatil> portHashMap = new HashMap<>();

    // creamos las instancias de nuestro producto 
    public static  void  cargarDatoPortatils(){
        System.out.println("ingrese el numero de portatil que va a digitar: ");
        while (!s.hasNextInt()) {
            System.out.println("la entrada tiene que ser un entero");
            s.next();
        }
        int valor = s.nextInt();
        s.nextLine();
        
        for (int i = 0; i < valor; i++) {
            System.out.println("Ingrese la marca del portátil: ");
            String marca = s.nextLine();
            System.out.println("Ingrese la cantidad de RAM del portátil: ");
            int ram = s.nextInt();
            s.nextLine(); // Limpiar buffer después de nextInt()

            System.out.println("Ingrese el tipo de procesador del portátil: ");
            String procesador = s.nextLine();

            System.out.println("Ingrese el tipo de tarjeta gráfica del portátil: ");
            String targetaGrafica = s.nextLine();

            System.out.println("Ingrese el tipo de pantalla del portátil: ");
            String tipoPantall = s.nextLine();

            // Crear una nueva instancia de Portatil y añadirla al HashMap
            Portatil portatil = new Portatil(marca, ram, procesador, targetaGrafica, tipoPantall);
            portHashMap.put(portatil.getId(), portatil);
        }

       
    }
    // metodo para mostrar la informacion guardada 
    public static  void Mostrarinformacion(){
       for (Integer key : portHashMap.keySet()) {
          System.out.println("el id de su portatil es " + key + " - " + " -los datos son- " + portHashMap.get(key) + " \n");
       }
    }
}