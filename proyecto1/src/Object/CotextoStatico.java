package Object;

public class CotextoStatico {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero("perro", 4);
        mamifero.Comer();
        Mamifero mamifero2 = new Mamifero("gato", 4);
        mamifero2.Comer();
        System.out.println();
        System.out.println("numero de tipos de mamiferos " + Mamifero.Numeromamifero);
    }
}
class Mamifero{
    static final String tomarLeche = "toma leche";
    private String tipo;
    static int Numeromamifero = 0;
    private int numeroPatas;
    public Mamifero(String tipo,int numeroPatas){
       this.tipo = tipo;
       this.numeroPatas = numeroPatas;
       // si quiero acceder a el atributo estatico de la clase tengo que para crear un contador de este para saber cuantos mamiferos hay por cada uno que se cree 
       Mamifero.Numeromamifero++; 
    }
    public String getTipo(){
        return this.tipo;
    }
    public int getCantidadPatas(){
        return this.numeroPatas;
    }
    // creamos un metodo 
    public void Comer(){
        System.out.println(getTipo() + " " + tomarLeche);
    } 
}