
package SEMANA02.Teorico;
class daddy{
  void carrera(){
      System.out.println(" Enfermeria");
  }  
   void universidad(){
      System.out.println(" UNNAS");
  } 
    void deporte(){
      System.out.println(" Futbol");
  } 
}
class son extends daddy{
    @Override
    void carrera(){
        System.out.println("sistemas");
    }
}        

public class Ejemplo08 {
    
}
