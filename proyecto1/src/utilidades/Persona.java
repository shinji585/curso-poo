package utilidades;

public class Persona{
    private String name; 
    private String lastName; 
    public Persona(String name, String lastname){
       this.name = name; 
       this.lastName = lastname;
    }
    public void setName(String name){
        this.name = name; 
    }
    public void setLastname(String lastname){
        this.lastName = lastname;
   }
   public String getname(){
    return name;
   }
   public String getlastname(){
    return lastName;
   }
    // creamos un metodo de mostrar informacion 
    public void mostrarInfor(){
     System.out.printf("bienvenido %s tu apellido es %s\n", name,lastName);
    }
 }
