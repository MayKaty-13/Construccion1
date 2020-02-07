
package SEMANA01.Practico;

import java.util.Scanner;

public class EJERCICIO12 {
  public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    int n,i=0;
    double sueldoB=2000,montoV,comision,sueldoF;
    do{
     System.out.println("Ingresar cantidad de vendedores:");
     n=leer.nextInt();   
    }while(n<0);
    while(i<n){
     comision=0;   
      for(int j=0;j<3;j++){
        montoV=aleatorio(100,300);
        comision+=montoV*0.1;  
      }
    sueldoF=sueldoB+comision;  
    System.out.println("El "+(i+1)+" vendedor tuvo una comision de: "+comision+" obteniendo un sueldo de s/. "+sueldoF);
     i++; 
    }
    
  }
   public static int aleatorio(double min,double max){
        return (int)((max+min-1)*Math.random()+1);
    }
}
