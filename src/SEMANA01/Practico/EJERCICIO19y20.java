
package SEMANA01.Practico;

import java.util.Scanner;


public class EJERCICIO19y20 {
     public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int ln[]= new int[50];
        int n,men,may;
        do{
        System.out.println("Ingresar el tamaño de la lista: ");
        n=leer.nextInt();
        }while(n<0);
         System.out.println("Ingresar los numeros a la lista: ");
        for(int i=0;i<n;i++){
           ln[i]=leer.nextInt();
        }
        men=ln[0];
       for(int i=0;i<n;i++){
           if(men>ln[i]){
               men=ln[i];
           }
       }
         System.out.println("El numero menor de la lista es: "+men);
        may=ln[0]; 
         for(int i=0;i<n;i++){
           if(may<ln[i]){
               may=ln[i];
           }
       }
         System.out.println("El numero mayor de la lista es: "+may); 
         
     }
}
