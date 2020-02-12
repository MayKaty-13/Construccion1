package TAREA02EntidadesSEMANA2;

public class ClienteNatural extends Cliente {
    
    private String DNI;
    private String nombre;
    private String aPaterno;
    private String aMaterno;

    public ClienteNatural(){
        super();
        DNI = "";
        nombre = "";
        aPaterno = "";
        aMaterno = "";
    }
    
    public ClienteNatural(String DNI, String nombre, String aPaterno, String aMaterno, String telefono, String correo, String direccion) {
        super(telefono, correo, direccion);
        this.DNI = DNI;
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }
    
}
