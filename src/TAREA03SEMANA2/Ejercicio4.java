
package TAREA03SEMANA2;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
    //Ejercicio4.a:
        System.out.println("Ingrese el numero de pantalones a producir:");
       int numP=leer.nextInt();
       double precioTela=3.0,ganancia=0;
       double PrecioMA=0,PrecioMB=0,PrecioF;
       PrecioMA=(numP*(1.50*precioTela))*0.80;
       PrecioMB=(numP*(1.80*precioTela))*0.95;
       System.out.println("El Precio de los pantalones para el modelo A es de s/. "+PrecioMA);
       System.out.println("El Precio de los pantalones para el modelo B es de s/. "+PrecioMB);
        if(PrecioMA>PrecioMB){
           PrecioF=PrecioMA;
           System.out.println("El precio Final de venta es de s/. "+PrecioF);
       }else{
           PrecioF=PrecioMB;
           System.out.println("El precio Final de venta es de s/. "+PrecioF);      
       }
       for(int i=0;i<numP;i++){
          ganancia+=PrecioF; 
       }
        System.out.println("La ganancia producida por los "+numP+" es de s/. "+ganancia);
     /*Ejercicio4.b:
        System.out.println("Ingrese las horas a usar el estacionamiento: ");
        int horas=leer.nextInt();
        int precioU=0;
        for(int i=1;i<=horas;i++){
          if(i<=2){
           precioU+=5;
          }else{
            if(i>2 && i<=5){ 
               precioU+=4;
            }else{
               if(i>5 && i<=10){
                precioU+=3;
               }else{
                 if(i>10){  
                  precioU+=2;                   
                 }
                } 
            }  
          }
        }
        System.out.println("El precio a pagar de las "+horas+" horas por el uso del estacionamiento es de s/. "+precioU);
    */    
   }  
}
