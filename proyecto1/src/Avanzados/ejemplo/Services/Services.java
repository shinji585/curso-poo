package Avanzados.ejemplo.Services;

public abstract class Services {
    protected String tipoProducto; 
    protected String nombreTienda;

    //creamos un constructor 
    public Services(String tipoString,String nomString){
     this.nombreTienda = nomString;
     this.tipoProducto = tipoString;
    }

    // implementamos getters y setter de tipo protected para mas informacion
    public abstract String getTipoProducto(); 
    public abstract void setTipoProducto(String a); 
    public abstract String getNombreTienda();
    public abstract void setNombreTienda(String b);
    
    // metodos abstractos 
    public abstract void agregarProducto();
    public abstract void eliminarProducto();
    public abstract void buscarPrdocut();

    // modificamos el toString por si queremos mostrar la tienda y su producto y tipo 
    @Override
    public String toString(){
        return "el nombre de la tienda es: "
         + nombreTienda 
         + " el tipo de producto es: " 
         + tipoProducto;
    }
}
