
package SEMANA01.Practico;

import java.util.Scanner;

public class EJERCICIO3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,opcion;
        do{
        System.out.println("Ingrese el tamaño de la lista: ");
        n=leer.nextInt();
        }while(n<0);
        do{
          System.out.println("opcion 1: Repita mientras");
          System.out.println("opcion 2: Repita Hasta");
          System.out.println("opcion 3: Repita Para");
          System.out.println("opcion 4: Salir");
          
          System.out.println("Ingrese una opcion:  ");
          opcion=leer.nextInt(); 
          int i=1;
          double suma=0;
        switch(opcion){ 
            case 1:
                while(i<=n){
                    if(i==1){
                        suma=i;
                    }else{
                       suma+=1/factorial(i);
                    }        
                i++;
            }
                System.out.println("Suma: "+suma);
             break;
            case 2:    
                do{
                    if(i==1){
                        suma=i;
                    }else{
                       suma+=1/factorial(i);
                    }
                    i++;
                }while(i<=n);
                System.out.println("Suma: "+suma);
                break;
            case 3:
                for(i=1;i<=n;i++){
                 if(i==1){
                        suma=i;
                    }else{
                       suma+=1/factorial(i);
                    }      
                }
                System.out.println("Suma: "+suma);
                break;
            case 4:
                break;
            default:
                System.out.println("La opcion  no es invalida");
        }
       }while(opcion!=4); 
    }    
        
    public static double factorial(int n){
        int fact=n;
                for(int i=1;i<n;i++){
                  fact=fact*i;
                }
        return fact;
    }            
}
