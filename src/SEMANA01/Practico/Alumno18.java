
package SEMANA01.Practico;

public class Alumno18 {
    
    private String dni;
    private String nombre;
    private int edad;
    private String sexo;
    
    public Alumno18(){
        dni = "NoRegistrado";
        nombre = "NoRegistrado";
        edad = 0;
        sexo = "H";
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}