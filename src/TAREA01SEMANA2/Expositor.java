
package TAREA01SEMANA2;

import java.util.Scanner;


public class Expositor {
  Scanner leer=new Scanner(System.in); 
  private String Codigo;
  private String Nombre;
  private String Apellidos;
  private String correo;
  
    public Expositor(String Codigo, String Nombre, String Apellidos, String correo) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.correo = correo;
    }
    public Expositor(){
        this.Codigo="";
        this.Nombre="";
        this.Apellidos="";
        this.correo="";    
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    } 
    
   public void ingresarDatos(){
       System.out.println("Ingresar su codigo: ");
       this.Codigo=leer.next();
       System.out.println("Ingresar su Nombre: ");
       this.Nombre=leer.next();
       System.out.println("Ingresar sus Apellidos: ");
       this.Apellidos=leer.next();
       System.out.println("Ingresar su correo: ");
       this.correo=leer.next();
   } 
   public void mostrarDatos(){
       System.out.print("  -Codigo: "+Codigo+"  -Nombre: "+Nombre+"  -Apellidos: "+Apellidos+"  -Correo: "+correo);
   }
}
