import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compra {

    // Atributos
    private String codigoCompra;
    private LocalDate fechaRealizacion;
    private double valorTotal;

    //Creación de Listas
    private List<Producto> listaProductos;
    private List<Integer> listacantidadesCompradas;

    //Relacion de compra con metodoPago
    private MetodoPago metodoPago;

    //Constructor
    public Compra(String codigoCompra, LocalDate fechaRealizacion, double valorTotal, MetodoPago metodoPago) {
        this.codigoCompra = codigoCompra;
        this.fechaRealizacion = fechaRealizacion;
        this.valorTotal = valorTotal;
        this.metodoPago=metodoPago;

        //Inicialización de las listas
        listaProductos= new ArrayList<>();
        listacantidadesCompradas= new ArrayList<>();
    }

    //Getters y Setters
    public String getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(String codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Integer> getListacantidadesCompradas() {
        return listacantidadesCompradas;
    }

    public void setListacantidadesCompradas(List<Integer> listacantidadesCompradas) {
        this.listacantidadesCompradas = listacantidadesCompradas;
    }

    @Override
    public String toString() {
        return "Compra " +
                "codigoCompra= " + codigoCompra +
                ", fechaRealizacion= " + fechaRealizacion +
                ", Lista de productos= " + listaProductos +
                ", Lista de Cantidades Compradas= " + listacantidadesCompradas +
                ", valorTotal= " + valorTotal +
                ", Metodo de pago= " + metodoPago;
    }
}
