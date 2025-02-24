package FinalProyect.Service;

import java.io.Serializable;
import FinalProyect.Model.Model;

public class User implements Serializable, Model {
    private static final long serialVersionUID = 1L;
    private String name;
    private String keys; 
    private double deposito;
    private static boolean estado = false;

    // Sobrecarga de constructores 
    public User() {}

    public User(String name, String keys, double deposito) {
        this.name = name;
        this.keys = keys;
        this.deposito = deposito;
    }

    // Getters y Setters 
    public static long getSerializableId() {
        return serialVersionUID;
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

    public void setKey(String keys) {
        this.keys = keys;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    @Override 
    public boolean Validar(String usuario, String falsekey) {
        if (getName().equals(usuario) && getKeys().equals(falsekey)) {
            estado = true;
            return true;
        } else {
            estado = false;
            return false;
        }
    }

    public void CambiarDatos(String a, String b) {
        if (estado) {
            setName(a);
            setKey(b);
            System.out.println(" Los datos han sido actualizados correctamente.");
        } else {
            System.out.println(" Error: No tienes permisos para actualizar los datos.");
        }
    }

    // Método toString con mejor presentación
    @Override
    public String toString() {
        return " Información del Usuario\n" +
               "---------------------------------\n" +
               " Nombre: " + getName() + "\n" +
               " Cantidad depositada: $" + String.format("%.2f", getDeposito()) + "\n" +
               " Contraseña: " + getKeys();
    }
}
