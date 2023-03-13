import java.time.LocalDate;
public class Producto {
    private String nombre;
    private LocalDate fechaAlta;
    private Double precio;
    private static final Double minPrecio = 0.1;

    public Producto (String nombre, Double prc){
        this.nombre = nombre;
        this.fechaAlta = LocalDate.now();
        this.precio = prc;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public Double getMinPrecio() {
        return minPrecio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}