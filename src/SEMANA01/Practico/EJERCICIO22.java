
package SEMANA01.Practico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJERCICIO22 {
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    DecimalFormat formato=new DecimalFormat("###.##");
    int i=0;
    double pi,pf,suma,proPF,rest; 
    while(i<5){
       suma=0.0;
       pi=aleatorio(60,100);
        System.out.println("Peso Inicial: "+pi);
       for(int j=0;j<10;j++){
        pf=aleatorio(60,80);
        suma+=pf;
       }
       proPF=suma/10;
       System.out.println("Peso Final: "+proPF);
       rest=proPF-pi;
       if(rest<=0){
           System.out.println("El "+(i+1)+" mienbro del club BAJO de peso "+formato.format(rest)+" kilos");  
       }else{
           System.out.println("El "+(i+1)+" mienbro del club SUBIO de peso "+formato.format(rest)+" kilos"); 
       }
      i++;
    }
   
    }
    public static int aleatorio(double min,double max){
        return (int)((max+min-1)*Math.random()+1);
    }
}
