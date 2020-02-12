package TAREA02EntidadesSEMANA2;

public class Producto {
    
    private int codigo;
    private String descripcion;//Tipo
    private double precio;
    private int stock;
    private String unidadMedida;
    
    public Producto(){
        codigo = 0;
        descripcion = "";
        precio = 0;
        stock = 0;
        unidadMedida = "";
    }

    public Producto(int codigo, String descripcion, double precio, int stock, String unidadMedida) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.unidadMedida = unidadMedida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    
}
