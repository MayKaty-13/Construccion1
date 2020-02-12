
package TAREA01SEMANA2;

public class Evento {
  private int codigoE;  
  private String titulo;
  private String duracion;
  private String HoraI;
  private String HoraS;
  private int temporada;
    public Evento(){
        this.codigoE=0;
        this.titulo = "";
        this.duracion = "";
        this.HoraI = "";
        this.HoraS ="";
        this.temporada =0;  
    }
    public Evento(int codigo,String titulo, String HoraI, String HoraS, String duracion,int temporada) {
        this.codigoE=codigo;
        this.titulo = titulo;
        this.duracion = duracion;
        this.HoraI = HoraI;
        this.HoraS = HoraS;
        this.temporada = temporada;
    }

    public int getCodigo() {
        return codigoE;
    }

    public void setCodigo(int codigo) {
        this.codigoE = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getHoraI() {
        return HoraI;
    }

    public void setHoraI(String HoraI) {
        this.HoraI = HoraI;
    }

    public String getHoraS() {
        return HoraS;
    }

    public void setHoraS(String HoraS) {
        this.HoraS = HoraS;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public void mostrarEvento(){
        System.out.print("-Codigo: "+codigoE+"  -Titulo: "+titulo+"     -Hora Inicio: "+HoraI+"   -Hora Salida: "+HoraS+"  -Duracion: "+duracion);       
        if(this.getTemporada()==1)
           System.out.print("     -Temporada Alta");
       else
           System.out.print("     -Temporada Baja");
    }
}    
