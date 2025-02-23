package FinalProyect.Service;


import java.io.Serializable;

import FinalProyect.Model.Model;

public class User implements Serializable,Model {
    private static final long SsrializableID = 1L;
    private String name;
    private String keys; 
    private double deposito;

    // creamos una sobre carga de constructores 
    public User(){};
    public User(String name,String keys,double deposito){
        this.name = name;
        this.keys = keys;
        this.deposito = deposito;
    }
    // creamos los getters and setters 
    public static long getSsrializableid() {
        return SsrializableID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getKeys() {
        return keys;
    }
    public void setKeys(String keys) {
        this.keys = keys;
    }
    public double getDeposito() {
        return deposito;
    }
    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }


    @Override 
    public boolean Validar(){
        return false;
    }




    // cramos ahora el toString de nuestra clase
    @Override
    public String toString(){
        return "Nombre de usuario:  " 
        + getName() 
        + "\nCantidad depositadad: " 
        + getDeposito() 
        + "\nConstraseña: " 
        + getKeys();
    }
}
