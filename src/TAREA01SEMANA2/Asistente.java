
package TAREA01SEMANA2;

import java.util.Scanner;

public class Asistente extends Expositor{
Scanner leer=new Scanner(System.in);    
 private int telefono;
 private String direccion;
 private double Deuda;

    public Asistente(int telefono, String direccion, String Codigo, String Nombre, String Apellidos, String correo) {
        super(Codigo, Nombre, Apellidos, correo);
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public Asistente(){
      super();
      telefono=0;
      direccion="";
      Deuda=0;
    }
  
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public double getDeuda() {
        return Deuda;
    }

    public void setDeuda(double Deuda) {
        this.Deuda = Deuda;
    }
    
   public void ingresarAsistente(){
       super.ingresarDatos();
       System.out.println("Ingresar su direccion: ");
       this.direccion=leer.next();
       System.out.println("Ingresar su telefono: ");
       this.telefono=leer.nextInt();
       
   }  
   public void mostrarAsistente(){
       super.mostrarDatos();
       System.out.print("   -Telefono: "+telefono+" -Direccion: "+direccion);
       System.out.println();
   }
   public void mostrarAsistenteDeuda(){
       
       System.out.print("  -Codigo: "+super.getCodigo()+"  -Nombre: "+super.getNombre()+"  -Deuda: "+Deuda);
   }
}
