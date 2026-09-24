import java.time.LocalDate;

public class Compra {

    // Atributos
    private String codigoCompra;
    private LocalDate fechaRealizacion;
    private double valorTotal;

    //Constructor
    public Compra(String codigoCompra, LocalDate fechaRealizacion, double valorTotal) {
        this.codigoCompra = codigoCompra;
        this.fechaRealizacion = fechaRealizacion;
        this.valorTotal = valorTotal;
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

    @Override
    public String toString() {
        return "Compra " +
                "codigoCompra= " + codigoCompra +
                ", fechaRealizacion= " + fechaRealizacion +
                ", valorTotal= " + valorTotal;
    }
}
