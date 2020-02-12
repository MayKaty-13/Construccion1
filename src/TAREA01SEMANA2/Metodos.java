
package TAREA01SEMANA2;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {
Scanner leer=new Scanner(System.in);
  ArrayList<Asistente> miasistente=new ArrayList<>();
  private Asistente asistentes[]=new Asistente[50];
  private Boleto miboleto=new Boleto();
  private Boleto boletos[]=new Boleto[5];
  private Expositor expositores[]=new Expositor[10];;
  private Evento eventos[]=new Evento[5];
  private Evento mievento=new Evento();
  private double GananciaA=0.0;

    public double getGananciaA() {
        return GananciaA;
    }

    public void setGananciaA(double GananciaA) {
        this.GananciaA = GananciaA;
    }
  
    public void generarBoleto(){
      boletos[0]= new Boleto(01,"P","Platinum",250.50);
      boletos[1]= new Boleto(02,"G","Gold",150.50);
      boletos[2]= new Boleto(03,"v","VIP",95.00);  
    }
    public void mostrarBoleto(){
       System.out.println("---------------------TIPOS DE ENTRADA:----------------------");
      for(int i=0;i<3;i++){
         boletos[i].mostrarBoleto();
      }   
    }
    public void generarExpositor(){
      expositores[1]=new Expositor("1111","Carmen","Gomez Contreras","tuchiquita3@gmail.com"); 
      expositores[2]=new Expositor("2222","Max","Diaz Sandoval","bbteamo@gmail.com"); 
      expositores[3]=new Expositor("3333","Andrea","Reategui Gomez","tumundo16@gmail.com"); 
      expositores[4]=new Expositor("4444","Mateo","Hernandez Flores","naturaleza17@gmail.com"); 
      expositores[5]=new Expositor("5555","Rosa","Rojas Polo","teamo15@gmail.com"); 
      expositores[6]=new Expositor("6666","Lucas","Paredes Rivadeneiro","contigo26@gmail.com"); 
    }
   
   public void generarEvento(){
       eventos[0]=new Evento(1,"Programacion en java","8.00 a.m","12.30 p.m","4.30 horas",aleatorio(1,2));
       eventos[1]=new Evento(2,"Robotica","2.00 p.m","5.00 p.m","3.00 horas",aleatorio(1,2));
       eventos[2]=new Evento(3,"Internet de las cosas","5.30 p.m","8.00 p.m","2.30 horas",aleatorio(1,2));
       eventos[3]=new Evento(4,"Conexion en la nube","8.30 p.m","11.30 p.m","3.00 horas",aleatorio(1,2));
   }
   public void ventaEntrada(String codigo,int codE,String codigoB){
     double montoD=0.0;
     int indiceA=-1,indiceE=-1,indiceB=-1;
     for(int i=0;i<miasistente.size();i++){
       if(codigo.equals(asistentes[i].getCodigo())){
           indiceA=i;
         for(int j=0;j<4;j++){
           if(codE==eventos[j].getCodigo()){
             indiceE=j;  
            for(int k=0;k<3;k++){
             if(codigoB.equals(boletos[k].getCodigo())){
                 indiceB=k;
             if(eventos[indiceE].getTemporada()==1){
                montoD=boletos[indiceB].getCosto()*0.10;
                asistentes[indiceA].setDeuda(montoD);               
                GananciaA+=montoD; 
             }else{
                montoD=boletos[indiceB].getCosto()*0.05;
                asistentes[indiceA].setDeuda(montoD);
                GananciaA+=montoD;  
             }    
           }else
            System.out.println("El codigo de la Entrada es incorrecto");    
            }   
                 
          }else
               System.out.println("El codigo del evento es incorrecto");  
         }  
          
       }else
             System.out.println("El asistente no existe");        
     }
   }
   public void mostrarEvento(){
       for(int i=0;i<4;i++){
        System.out.println("Evento "+(i+1)+" :");  
        eventos[i].mostrarEvento();
        System.out.print("\nExpositor: ");
        expositores[aleatorio(1,6)].mostrarDatos(); 
        System.out.println("\n");
       }  
   }
  public int aleatorio(int min,int max){
      return (int) ((max+min-1)*Math.random()+1);
  }
}
