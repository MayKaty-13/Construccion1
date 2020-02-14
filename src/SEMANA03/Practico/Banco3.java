
package SEMANA03.Practico;

public class Banco3 {
 private Cliente3 cliente1,cliente2,cliente3;
  public Banco3(){ 
    cliente1=new Cliente3("Juan"); 
    cliente2=new Cliente3("Ana"); 
    cliente3=new Cliente3("Pedro"); 
  } 
  public void operar(){ 
    cliente1.depositar (100); 
    cliente2.depositar (150); 
    cliente3.depositar (200); 
    cliente3.extraer (150); 
 } 
  public void depositosTotales(){ 
      int t = cliente1.retornarMonto() + cliente2.retornarMonto () + cliente3.retornarMonto ();
      System.out.println ("El total de dinero en el banco es:" + t);
      cliente1.imprimir(); 
      cliente2.imprimir();
      cliente3.imprimir(); 
  }
  
  public static void main(String[] ar){
    Banco3 banco1=new Banco3();
    banco1.operar();
    banco1.depositosTotales(); 
  }    
}
