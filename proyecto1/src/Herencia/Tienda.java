package Herencia;

import java.util.ArrayList;

public class Tienda extends Herencia{
    private ArrayList<Herencia> arraylist = new ArrayList<>();
    // creamos un constructor 
    public Tienda(ArrayList<Herencia> arrayList,String marca,int cantidad,double precio){
        super(marca, cantidad, precio);
        this.arraylist = arrayList;
    }
    // creamos un constructor vacio 
    public Tienda(){
        // constructor vacio 
    }
    // sette del arraylist 
    public void setArraylist(ArrayList<Herencia> arraylist){
        this.arraylist = arraylist;
    }
    // creamos el get 
    public ArrayList<Herencia> getArrayList(){
        return this.arraylist;
    }
    public void agregarProducto(Herencia arraylist){
        this.arraylist.add(arraylist);
    }
    public void Mostrarproducto(){
        for (Herencia herencia : arraylist) {
            System.out.printf("la marca es %s su cantidad es %d y su precio es %.2f\n",herencia.getMarca(),herencia.getCantidad(),herencia.getPrecio());
        }
    }
}
