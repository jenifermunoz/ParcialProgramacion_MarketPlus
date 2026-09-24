public class Producto {

    //Atributos
    private String codigo;
    private String nombre;
    private double precioUnitario;
    private int cantidadDisponible;

    //Constructor
    public Producto(String codigo, String nombre, double precioUnitario, int cantidadDisponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidadDisponible = cantidadDisponible;
    }

    //Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Producto" +
                "codigo= " + codigo +
                ", nombre= " + nombre +
                ", precioUnitario= " + precioUnitario +
                ", cantidadDisponible= " + cantidadDisponible;
    }
}
