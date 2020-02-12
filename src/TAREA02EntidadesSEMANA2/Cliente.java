package TAREA02EntidadesSEMANA2;

public class Cliente {
    
    protected String telefono;
    protected String correo;
    protected String direccion;
    
    public Cliente(){
        telefono = "";
        correo = "";
        direccion = "";
    }

    public Cliente(String telefono, String correo, String direccion) {
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
