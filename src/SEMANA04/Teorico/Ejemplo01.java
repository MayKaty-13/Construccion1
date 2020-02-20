
package SEMANA04.Teorico;

class Humano{
    protected String nombre;
    protected String apellido;

    public Humano(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String nombreCompleto(){
        return this.apellido+" , "+this.nombre;
    }
    public String identificacion(){
        return this.nombreCompleto();
    }

    @Override
    public String toString() {
        return "Humano{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
class ciudadano extends Humano{
  private String documento;

    public ciudadano(String documento, String nombre, String apellido) {
        super(nombre, apellido);
        this.documento = documento;
    }

    public String toStringCiudadano() {
        return this.toString()+" ciudadano{" + "documento=" + documento + '}';
    }
  
}
public class Ejemplo01 {
    public static void main(String[] args) {
        ciudadano c1=new ciudadano("123"," juan","Salazar");
        System.out.println(c1.toStringCiudadano());
    }
  
}
