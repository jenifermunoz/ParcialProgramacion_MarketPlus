import java.util.ArrayList;
import java.util.List;

public class Cliente {
    // Atributos
    private String nombreCompleto;
    private String documentoIdentidad;
    private String telefono;
    private String correo;

    // creación de listas
    private List<Compra> listaCompras;

    //Constructor
    public Cliente(String nombreCompleto, String documentoIdentidad, String telefono, String correo) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.telefono = telefono;
        this.correo = correo;

        //Inicializacion de listas
        listaCompras= new ArrayList<>();
    }


    //Getters y Setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    @Override
    public String toString() {
        return  nombreCompleto +
                ", documento Identidad= " + documentoIdentidad +
                ", telefono= " + telefono +
                ", correo= " + correo +
                ", Compras realizadas= " + listaCompras;
    }
    // metodo para realizar compra

    public boolean realizarCompra(Compra compra) {
        boolean agregado = false;

        if (compra != null) {
            listaCompras.add(compra);
            agregado = true;
        }

        return agregado;
    }

    // Metodo para consultar compras

    public List<Compra> consultarCompras() {
        return listaCompras;
    }

}
