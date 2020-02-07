
package SEMANA01.Practico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pregunta30 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
         DecimalFormat formato=new DecimalFormat("###.##");
        int n;
        System.out.println("------------------TIENDA ENANO S.A---------------------");
        do{
         System.out.println("Ingrese cuantos productos desea comprar:  ");
        n=leer.nextInt();   
        }while(n<0);
        double precio;
        int etiqueta;
        double totalP=0;
        for(int i=0;i<n;i++){
        precio=precioaleatorio(05.0,20.0);   
        etiqueta=aleatorio(1,2); 
        System.out.print("Producto "+(i+1)+" :  -Precio: s/."+formato.format(precio));
        if(etiqueta==1){
         totalP+=(precio*0.20);
            System.out.println("      -Cuenta con etiqueta Roja");
        }else{
          if(etiqueta==2){
            totalP+=precio;
           System.out.println("      -No cuenta con etiqueta Roja");  
          }
          
        }
        }
        System.out.println("-------------------------------------------");
        System.out.println("PRECIO TOTAL A PAGAR ES: S/"+formato.format(totalP));
        
    }
    public static double precioaleatorio(double max,double min){
            return (double)((max+min-1)*Math.random()+1);
        }
    public static int aleatorio(int min,int max){
        return (int)((max+min-1)*Math.random()+1);
    }
}

