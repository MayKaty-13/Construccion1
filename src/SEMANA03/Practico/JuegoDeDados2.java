
package SEMANA03.Practico;

public class JuegoDeDados2 {
 private Dado2 dado1,dado2,dado3;
 public JuegoDeDados2() { 
   dado1=new Dado2(); 
   dado2=new Dado2(); 
   dado3=new Dado2();       
 }
 public void jugar() { 
   dado1.tirar();
   dado1.imprimir(); 
   dado2.tirar();
   dado2.imprimir(); 
   dado3.tirar();
   dado3.imprimir(); 
   if (dado1.retornarValor()==dado2.retornarValor() && dado1.retornarValor()==dado3.retornarValor()) { 
       System.out.println("Ganó"); 
   }else{ 
       System.out.println("Perdió");
   }
  } 
  public static void main(String[] args) {
    JuegoDeDados2 j=new JuegoDeDados2(); 
    j.jugar();
    
    }
}
