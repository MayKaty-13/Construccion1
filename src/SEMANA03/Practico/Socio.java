
package SEMANA03.Practico;

public class Socio {
 private String nombre;
 private int antiguedad;
  public Socio(){
      nombre="";
      antiguedad=0;
  }
 public Socio(String nombre, int antiguedad){
     this.nombre=nombre;
     this.antiguedad=antiguedad;
 }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
 public void mostrarDatos(){
     System.out.println("Nombre: "+nombre+"  -Años de antiguedad: "+antiguedad);
 }
}
