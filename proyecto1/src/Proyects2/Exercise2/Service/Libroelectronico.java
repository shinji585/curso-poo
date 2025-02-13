package Proyects2.Exercise2.Service;

public class Libroelectronico extends Libro{
    private double tipoTamaño;
    private String formato;

    // creamos un constructor 
    public Libroelectronico(String formato,double tipoTamaño,String name,double precio,String tipoLibro){
     super(tipoLibro, name, precio);
     this.formato = formato;
     this.tipoTamaño = tipoTamaño;
    }

    // creamos los getters y setters para nuestros dos atributos 
    public void setpeso(double a){
      this.tipoTamaño = a;
    }
    public double getPeso(){
        return this.tipoTamaño;
    }
    public void setFormato(String formato){
      this.formato = formato;
    }
    public String getFormato(){
        return this.formato;
    }


    // metodo sobre escrito de la clase Libro para mostrar informacion
    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles(); 
        System.out.println("📥 Formato: " + this.formato);
        System.out.println("💾 Tamaño: " + this.tipoTamaño + "MB");
    }
}
