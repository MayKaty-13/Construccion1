
package SEMANA03.Practico;

public class Club {  
  private Socio s1=new Socio("Andres ",5);  
  private Socio s2=new Socio("Maria",10); 
  private Socio s3=new Socio("Max ",7); 
  
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
        Club club=new Club();
        club.mayorAntiguedad();
    }
}
