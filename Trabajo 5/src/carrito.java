import tienda.producto.*;
public class carrito {

    private String[] productos;
    private Integer[] cantidad;
    private Double precio;

    public carrito(String item, Integer cantidad){
        
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCantidad(Integer[] cantidad) {
        this.cantidad = cantidad;
    }

}
