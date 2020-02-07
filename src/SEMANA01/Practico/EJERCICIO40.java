
package SEMANA01.Practico;

import java.util.Scanner;

public class EJERCICIO40 {
 public static void main(String[] args) {
   Scanner leer=new Scanner(System.in);
    int i=1,n,suma,notas,indicePM=0;
    double promedio,mayorP;
    do{
       System.out.println("Ingrese el numero de alumnos que hay en el curso de Diseño estructura de algoritmo: "); 
       n=leer.nextInt();
    }while(n<0);
    mayorP=0;
    while(i<=n){
     suma=0;   
      for(int j=0;j<5;j++){
        notas=aleatorio(0,20);  
        suma+=notas;
      }  
     promedio=suma/5;
        System.out.println("Alumno "+(i)+" : -promedio: "+promedio);
     if(mayorP<promedio){
         mayorP=promedio;
         indicePM=i;
     }  
     i++;  
    } 
     System.out.println("El alumno que obtuvo mayor promedio fue el numero: "+indicePM+" con un promedio de "+mayorP); 
 }  
  public static int aleatorio(double min,double max){
        return (int)((max+min-1)*Math.random()+1);
    }
}
