
package SEMANA01.Practico;

import java.util.Scanner;
public class EJERCICIO5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,i,np,cd,cp;
        do{
         System.out.println("Ingresar el tamaño de la lista de numeros primos a mostrar: ");   
         n=leer.nextInt();   
        }while(n<=0);
        System.out.println("----------Numeros primos:------------- ");
        np=2;
        cp=0;
       while(cp<n){
         cd=0;
         i=1;
         while(i<=np && cd<=2){
             if(np%i==0){
                cd++; 
             }
             i++;
         }
         if(cd==2){
             cp++;
             System.out.print(np+" ");  
         }
         np++; 
        }
        System.out.println();
   
    }
}
