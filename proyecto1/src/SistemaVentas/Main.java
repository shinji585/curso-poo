package SistemaVentas;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("camisa", 578);
        Producto producto2 = new Producto("televisor", 785);
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        // analizar este codigo 
    }
}
