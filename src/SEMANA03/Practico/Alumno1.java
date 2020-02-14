
package SEMANA03.Practico;

import java.util.Scanner;

public class Alumno1 {
  Scanner leer=new Scanner(System.in);  
  private String nombre;
  private int edad;
    public Alumno1(){
        nombre="";
        edad=0;
    }
    public Alumno1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
    public void ingresarDato(){
       System.out.println("Ingrese su nombre: ");
       this.nombre=leer.next();
       System.out.println("Ingrese su edad: ");
       this.edad=leer.nextInt();
    }
    public void mayorEdad(){
      if(edad>=18)
          System.out.println("Es mayor de edad");
      else
            System.out.println("No es mayor de edad");
    }
   public void mostrarDatos(){
       System.out.println("---------------------------------");
       System.out.println("-Nombre: "+nombre+"    -Edad: "+edad);  
   } 
   
}
