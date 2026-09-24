import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
public class Supermercado {
    //Atributos
    private String nombreComercial;
    private String direccion;
    private String telefono;

//creacion listas
    private List<Cliente> listaClientes;
    private List<Producto> listaProductos;
    private List<Compra> listaCompras;

    //Constructor
    public Supermercado(String nombreComercial, String direccion, String telefono) {
        this.nombreComercial = nombreComercial;
        this.direccion = direccion;
        this.telefono = telefono;

    //inicializar listas
        listaClientes = new ArrayList<>();
        listaProductos = new ArrayList<>();
        listaCompras = new ArrayList<>();
    }

    //Getters Setters
    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public ArrayList<Cliente> getListaClientes() {
        return (ArrayList<Cliente>) listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Producto> getListaProductos() {
        return (ArrayList<Producto>) listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<Compra> getListaCompras() {
        return (ArrayList<Compra>) listaCompras;
    }

    public void setListaCompras(ArrayList<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }
    @Override
    public String toString() {
        return "Supermercado" +
                "nombreComercial= " + nombreComercial +
                ", direccion= " + direccion +
                ", telefono= " + telefono;
    }
    // metodo para registrar cliente
    public boolean registrarCliente (Cliente cliente){
    boolean agregar = false;
    if (cliente != null){
    listaClientes.add(cliente);
    agregar = true;
    }
    return agregar;
    }
    // metodo para registrar producto
    public boolean registrarProducto (Producto producto){
        boolean agregar = false;
        if (producto != null){
            listaProductos.add(producto);
            agregar = true;
        }
        return agregar;
    }
    //metoodo registrar compra
    public boolean registrarCompra(Compra compra){
        boolean agregar = false;
        if (compra != null){
            listaCompras.add(compra);
            agregar = true;
        }
        return agregar;
    }
    // consultarVentasPorFecha
    public double consultarVentasPorFecha(LocalDate fecha) {
        double totalVentas = 0.0;
        for (Compra compra : listaCompras) {
            if (compra.getFechaRealizacion().equals(fecha)) {
                totalVentas += compra.getValorTotal();
            }
        }
        return totalVentas;
    }

}
