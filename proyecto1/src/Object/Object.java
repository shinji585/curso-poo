package Object;

import java.util.*;

public class Object {
    static Scanner s = new Scanner(System.in);

    // la clase object es la clase padre todas herendan de ella y ademas de eso esta
    // ofrece metodos que ayudan a hacer algunas funcionalidades y que pueden ser
    // sobre escritos desde otra clase
    public static void main(String[] args) {
        Amigo amigo1 = new Amigo();
        amigo1.setNombre("santiago");
        System.out.println("ingrese las cualidades son maximo 3");
        for (int i = 0; i < 3; i++) {
            amigo1.setCualidades(s.nextLine());
        }
       
        System.out.println("mostrar clase sola " + amigo1.toString());
    }
}

class Amigo {
    private String nombre;
    private Vector<String> cualidades = new Vector<>();

    public Amigo() {

    }

    public void setCualidades(String string) {
        this.cualidades.add(string);
    }

    public Amigo(String nombre, String cualidades) {
        this.nombre = nombre;
        this.cualidades.add(cualidades);
    }

    // metodo para capturar y mostrar
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public Vector<String> getCualidades() {
        return this.cualidades;
    }
    @Override
    public String toString(){
        return "nombre amigo: " + getNombre() + " sus cualidades son " + getCualidades();
    }
}
