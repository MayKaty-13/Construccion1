package TAREA02EntidadesSEMANA2;

public class ClienteJuridico extends Cliente {
    
    private String nombreT;//Nombre de la Tienda
    private String RUC;

    public ClienteJuridico(){
        super();
        nombreT = "";
        RUC = "";
    }

    public ClienteJuridico(String nombreT, String RUC, String telefono, String correo, String direccion) {
        super(telefono, correo, direccion);
        this.nombreT = nombreT;
        this.RUC = RUC;
    }
    
    public String getNombreT() {
        return nombreT;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }
    
}
