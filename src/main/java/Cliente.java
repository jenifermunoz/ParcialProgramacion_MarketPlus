public class Cliente {
    // Atributos
    private String nombreCompleto;
    private String documentoIdentidad;
    private String telefono;
    private String correo;

    //Constructor
    public Cliente(String nombreCompleto, String documentoIdentidad, String telefono, String correo) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.telefono = telefono;
        this.correo = correo;
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

    @Override
    public String toString() {
        return "Cliente" +
                "nombre Completo= " + nombreCompleto +
                ", documento Identidad= " + documentoIdentidad +
                ", telefono= " + telefono +
                ", correo= " + correo;
    }
}
