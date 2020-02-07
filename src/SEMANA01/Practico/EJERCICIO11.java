
package SEMANA01.Practico;

import java.text.DecimalFormat;

public class EJERCICIO11 {
     public static void main(String[] args) {
        DecimalFormat formato=new DecimalFormat("###.##");
        int e[]=new int[25];
        int j[]=new int[20];
        int c[]=new int[45];
        int anyos1,anyos2,anyos3,contC1=0,contC2=0,contC3=0;
        for(int i=0;i<20;i++){
          anyos1=aleatorio(0,6);
          if(anyos1>=0 && anyos1<=1){
              contC1+=1;
          }else{
              if(anyos1>1 && anyos1<3){
               contC2+=1;   
              }else{
                  if(anyos1>=3){
                   contC3+=1;     
                  }
              } 
          }
        }
        for(int i=0;i<15;i++){
          anyos2=aleatorio(0,6);
          if(anyos2>=0 && anyos2<=1){
              contC1+=1;
          }else{
              if(anyos2>1 && anyos2<3){
               contC2+=1;   
              }else{
                  if(anyos2>=3){
                   contC3+=1;     
                  }
              } 
          }
        }
        for(int i=0;i<40;i++){
          anyos3=aleatorio(0,6);
          if(anyos3>=0 && anyos3<=1){
              contC1+=1;
          }else{
              if(anyos3>1 && anyos3<3){
               contC2+=1;   
              }else{
                  if(anyos3>=3){
                   contC3+=1;     
                  }
              } 
          }
        }
        System.out.println("En la 1CATEGORIA HAY: "+contC1+" animales con un porcentaje de: "+formato.format((double)(contC1*100)/75)+" % ");
        System.out.println("En la 2CATEGORIA HAY: "+contC2+" animales con un porcentaje de: "+formato.format((double)(contC2*100)/75)+" % ");
        System.out.println("En la 3CATEGORIA HAY: "+contC3+" animales con un porcentaje de: "+formato.format((double)(contC3*100)/75)+" % ");
     }
     public static int aleatorio(double max,double min){
        return (int)((max+min-1)*Math.random()+1);
    }
}
