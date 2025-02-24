package FinalProyect.Service;

import java.io.Serializable;
import FinalProyect.Model.Model;

public class Admi implements Serializable, Model {
    private String name; 
    private String key;
    private static boolean estado = false;

    // Sobrecarga de constructores
    public Admi() {}

    public Admi(String name, String key) {
        this.name = name;
        this.key = key;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override 
    public boolean Validar(String usuario, String falsekey) {
        if (getName().equals(usuario) && getKey().equals(falsekey)) {
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

    // Método toString 
    @Override
    public String toString() {
        return " Datos del Administrador\n" +
               "----------------------------\n" +
               " Nombre: " + getName() + "\n" +
               " Contraseña: " + getKey();
    }
}
