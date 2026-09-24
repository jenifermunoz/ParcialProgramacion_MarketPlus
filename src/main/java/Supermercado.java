public class Supermercado {
    //Atributos
    private String nombreComercial;
    private String direccion;
    private String telefono;

    //Constructor
    public Supermercado(String nombreComercial, String direccion, String telefono) {
        this.nombreComercial = nombreComercial;
        this.direccion = direccion;
        this.telefono = telefono;
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

    @Override
    public String toString() {
        return "Supermercado" +
                "nombreComercial= " + nombreComercial +
                ", direccion= " + direccion +
                ", telefono= " + telefono;
    }
}
