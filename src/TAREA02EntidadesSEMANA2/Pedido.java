package TAREA02EntidadesSEMANA2;

public class Pedido {
    
    private int numeroP;//Número de Pedido
    private String fechaP;//Fecha del Pedido
    private int cantidad;
    private String cliente;
    private int codigoProducto;

    public Pedido(){
        numeroP = 0;
        fechaP = "";
        cantidad = 0;
        cliente = "";
        codigoProducto = 0;
    }
    
    public Pedido(int numeroP, String fechaP, int cantidad, String cliente, int codigoProducto) {
        this.numeroP = numeroP;
        this.fechaP = fechaP;
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.codigoProducto = codigoProducto;
    }

    public int getNumeroP() {
        return numeroP;
    }

    public void setNumeroP(int numeroP) {
        this.numeroP = numeroP;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    
}