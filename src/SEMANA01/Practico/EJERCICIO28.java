
package SEMANA01.Practico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJERCICIO28 {
  public static void main(String[] args) {
   Scanner leer=new Scanner(System.in);
   DecimalFormat formato=new DecimalFormat("###.##");
    int n,numH;
    double peso,altura,calidad,sumaC=0,promC,precioF;
    do{
       System.out.println("Ingrese el numero de gallinas que hay en la granja: "); 
       n=leer.nextInt();
    }while(n<0);
    
    for(int i=0;i<n;i++){    
     peso=aleatorio(09.0,20.0);
     altura=aleatorio(05.0,10.0);
     numH=aleatorio(10,20);
     System.out.print("Gallina "+(i+1)+" :  -Peso: "+peso+"  -Altura: "+altura+"     -# Huevos: "+numH);
     calidad=(peso*altura)/numH;
     System.out.println("     -Calidad: "+formato.format(calidad));
     sumaC+=calidad;
    }
    promC=sumaC/n;
      System.out.println("Promedio de calidad: "+formato.format(promC));
    if(promC<=8){
     precioF=0.80*promC; 
        System.out.println("El precio de venta por kilo de huevo es de s/. "+formato.format(precioF));
    }else{
        if(promC>8 && promC<15){
          precioF=1.0*promC; 
         System.out.println("El precio de venta por kilo de huevo es de s/. "+formato.format(precioF));
        }else{
            if(promC>=15){
              precioF=1.2*promC; 
              System.out.println("El precio de venta por kilo de huevo es de s/. "+formato.format(precioF));
            }
        }
    }
  }
   public static int aleatorio(double min,double max){
        return (int)((max+min-1)*Math.random()+1);
    }
}
