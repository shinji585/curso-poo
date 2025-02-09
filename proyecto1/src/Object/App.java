package Object;
import java.util.*;
import utilidades.Persona;
public class App {
    static Persona persona = new Persona(null, null);
    static Scanner s = new Scanner(System.in);
    static HashMap<String,Integer> hashmap = new HashMap<>();
    public static void main(String[] args) throws Exception {
    //    Persona persona = new Persona("santiago", "vargas");
    //    persona.mostrarInfor();
    // Aritmetica aritmetica = new Aritmetica(12, 16);
    // aritmetica.mostrarInfo();
    persona.setName("santiago");
    persona.setLastname("cardenas");
    persona.mostrarInfor();
     }
}
class Aritmetica{
    private int operando1; 
    private int operando2; 
    public Aritmetica(int operando1, int operando2){
        this.operando1 = operando1; 
        this.operando2 = operando2;
    }
    public void mostrarInfo(){
        int suma = operando1 + operando2;
        System.out.println("la suma de sus numeros es: " + suma);
        int resta = operando1 - operando2; 
        System.out.println("el resultado es: " + resta);
    }
}