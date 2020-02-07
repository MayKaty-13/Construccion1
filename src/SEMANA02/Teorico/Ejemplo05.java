
package SEMANA02.Teorico;

class perro{
  String nombre;
  int edad;
  String raza;
 public perro(){
    this.nombre="";
    this.edad=0;
    this.raza="";
}

 public perro(String cad){
     this.nombre=cad;
 }  
 public perro(String cad,int x){
     this.nombre=cad;
     this.edad=x;
 }
  public perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
 }
  
 
}
public class Ejemplo05 {
    public static void main(String[] args) {
       perro p1=new perro();
       perro p2=new perro("fido"); 
       perro p3=new perro("fido",2); 
       perro p4=new perro("fido",2,"Pitbull"); 
    }
    
}
