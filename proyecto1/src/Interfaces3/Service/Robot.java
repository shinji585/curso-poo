package Interfaces3.Service;

import Interfaces3.Model.*;

public class Robot  implements Caminante,Hablante{
    private static final String  nombre = "roberto";

    // implementamos los metodos y que estos devuelvan un mensaje ademas de eso creamos un constructor vacio 
    public Robot(){}

    @Override
    public void Hablar(String a) {
        System.out.println(Robot.nombre + " esta diciendo lo siguiente " + a);
    };
    @Override
    public void Caminar(){
        System.out.println("el robot esta camiando");
    }
    

}
