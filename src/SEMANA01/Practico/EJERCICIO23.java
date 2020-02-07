
package SEMANA01.Practico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJERCICIO23 {
 public static void main(String[] args) {
   Scanner leer=new Scanner(System.in);
   DecimalFormat formato=new DecimalFormat("###.##");
    int i=1,nG,nA,nM;
    int sumaN,sumaM,sumaA,sumaG=0;
    double notas,promN,promM,promA,promG;
    do{
       System.out.println("Ingrese el numero de grupos a evaluar: "); 
       nG=leer.nextInt();
    }while(nG<0); 
    while(i<=nG){
    sumaA=0;    
    System.out.println("-------------------------------------------GRUPO "+i+" :-------------------------------------");    
    nA=aleatorio1(3,5);    
    for(int j=0;j<nA;j++){
      sumaM=0;
      System.out.println("-------------------------Alumno "+(j+1)+" :----------------------------");  
      nM=aleatorio1(01,05);
      for(int k=0;k<nM;k++){
          sumaN=0; 
          System.out.print("-Materia "+(k+1)+" :");
        for(int l=0;l<3;l++){
          notas=aleatorio(03.0,20.0);
            System.out.print("\tNota "+(l+1)+" : "+formato.format(notas));
          sumaN+=notas;
        } 
        promN=sumaN/3;
        System.out.println("\tPromedio de Notas: "+formato.format(promN));
        sumaM+=promN;
      }
      promM=sumaM/nM;
      System.out.println("Promedio de notas de las Materias: "+formato.format(promM));
      sumaA+=promM;
    } 
    promA=sumaA/nA;
    System.out.println("--------------->Promedio de nota del grupo de Alumnos: "+formato.format(promA));
    sumaG+=promA;
    i++;   
    }
    promG=sumaG/nG;
    System.out.println("-----------------------------------------------------------------------------------");
    System.out.println("El promedio de los "+nG+" grupos es de: "+formato.format(promG));
 }
 public static double aleatorio(double min,double max){
        return (double)((max+min-1)*Math.random()+1);
    }
 public static int aleatorio1(int min,int max){
        return (int)((max+min-1)*Math.random()+1);
    }
}
