
package SEMANA03.Practico;

public class Club4 {  
  private Socio4 s1=new Socio4("Andres ",5);  
  private Socio4 s2=new Socio4("Maria",10); 
  private Socio4 s3=new Socio4("Max ",7); 
  
  public void mayorAntiguedad(){
     if(s1.getAntiguedad()>s2.getAntiguedad())
         System.out.println("El socio con mayor años de antiguedad es : "+s1.getNombre()); 
     else{
        if(s2.getAntiguedad()>s3.getAntiguedad())
         System.out.println("El socio con mayor años de antiguedad es : "+s2.getNombre()); 
        else
          System.out.println("El socio con mayor años de antiguedad es : "+s3.getNombre());      
     } 
  }
    public static void main(String[] args) {
        Club4 club=new Club4();
        club.mayorAntiguedad();
    }
}
