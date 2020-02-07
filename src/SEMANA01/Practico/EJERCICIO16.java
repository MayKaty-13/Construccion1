
package SEMANA01.Practico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJERCICIO16 {
public static void main(String[] args) {
   Scanner leer=new Scanner(System.in);
   DecimalFormat formato=new DecimalFormat("###.##");
    int n;
    double promA,suma=0,promedioF;
    do{
       System.out.println("Ingrese el numero de alumos a evaluar: "); 
       n=leer.nextInt();
    }while(n<0);
    for(int i=0;i<n;i++){
       promA=aleatorio(05,20);
      suma+=promA; 
        System.out.println("Alumno "+(i+1)+" : "+promA);
    }
    promedioF=suma/n;
    System.out.println("El promedio de los promedios de nota de "+n+" alumnos es de: "+formato.format(promedioF));
 } 
 public static int aleatorio(double min,double max){
        return (int)((max+min-1)*Math.random()+1);
    }
}
