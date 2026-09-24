public class Producto {

    //Atributos
    private String codigo;
    private String nombre;
    private double precioUnitario;
    private int cantidadDisponible;

    // Relación de Producto con categoria
    private Categoria categoria;

    //Constructor
    public Producto(String codigo, String nombre, double precioUnitario, int cantidadDisponible, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidadDisponible = cantidadDisponible;
        this.categoria = categoria;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto" +
                "codigo= " + codigo +
                ", nombre= " + nombre +
                ", precioUnitario= " + precioUnitario +
                ", cantidadDisponible= " + cantidadDisponible +
                ", Categoria= " + categoria;
    }

    // metodo para verificar disponibilidad
    public boolean verificarDisponibilidad(int cantidadRequerida) {
        boolean disponible = false;
        if (this.cantidadDisponible >= cantidadRequerida) {
            disponible = true;

        }
        return disponible;
    }

    // metodo para actualizar la Cantidad
    public void actualizarCantidad(int actualizacion) {
        if (this.cantidadDisponible + actualizacion >= 0) {
            this.cantidadDisponible += actualizacion;

        } else {
            System.out.print("error");

        }
    }
}