package Interfaces3.Model;

public interface Caminante {
    // creamos los metodos por defecto 
    default void Caminar(){
        System.out.println("esta caminando");
    };
}
