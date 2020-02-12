
package TAREA01SEMANA2;

public class Boleto {
  private int numero;
  private String codigoB; 
  private String Ubicacion;
  private double costo;

    public Boleto(int numero, String codigo, String Ubicacion, double costo) {
        this.numero = numero;
        this.codigoB = codigo;
        this.Ubicacion = Ubicacion;
        this.costo = costo;
    }
    public Boleto(){
        numero=0;
        codigoB="";
        Ubicacion="";
        costo=0.0;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCodigo() {
        return codigoB;
    }

    public void setCodigo(String codigo) {
        this.codigoB = codigo;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
  
 public void mostrarBoleto(){
    System.out.println("-N°: "+numero+" -Codigo: "+codigoB+"  -Ubicacion: "+Ubicacion+"        -Costo: s/. "+costo);
 }
  
  
}
