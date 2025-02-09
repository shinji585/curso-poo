package SistemaVentas;

public class Orden {
   private final int OrdenId; 
   private Producto[] producto;
   private  int contradorProducto;
   private static final int MAX_productos = 10;
   private static int contadorOrdenes; 

   public Orden(){
    this.OrdenId = ++Orden.contadorOrdenes;
    this.producto = new Producto[Orden.MAX_productos];
   }
   
  public void agregarProducto(Producto producto){
    if(this.contradorProducto < Orden.MAX_productos){
        this.producto[this.contradorProducto++] = producto;
    }else{
        System.out.println(" se ha superado el maximo de productos: " + Orden.MAX_productos);
    }
  }
  public double calcularTotal(){
    double total = 0;
    for (int i = 0; i < this.contradorProducto; i++) {
         total += this.producto[i].getPrecio();
    }
    return total;
  }
  

  // metodo vario 
  public void mostrarOrden(){
    System.out.println(" id orden: " + this.OrdenId);
    double totalOrden = this.calcularTotal();
    System.out.println("\tel total de la orden: $" + totalOrden );
    System.out.println("los productos de la orden: ");
    for (int i = 0; i < this.contradorProducto; i++) {
        System.out.println("\t\t" + this.producto[i]);
    }
  }
}
