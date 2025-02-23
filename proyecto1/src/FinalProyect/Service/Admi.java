package FinalProyect.Service;

import java.io.Serializable;

import FinalProyect.Model.Model;

public class Admi implements Serializable,Model{
    private String name; 
    private String key;

    // creamos una sobre carga de constructores 
    public Admi(){};
    public Admi(String name,String key){
      this.name = name;
      this.key = key;
    }
    // implementamos los getters and setters 
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
    public boolean Validar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Deserializar'");
    }
    // creamos el metodo toString 
    @Override
    public  String toString(){
        return "Nombre: " + getName();
    }
    
}
