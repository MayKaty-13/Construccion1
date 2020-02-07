
package SEMANA01.Teorico;

import java.util.Scanner;


public class Ejercicio06 {
 public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
 
       int m,s;
       System.out.println("Cantidad en horas:");
       int h=sc.nextInt();
       
       m=(h * 60);
       s=(h * 3600);
       
       System.out.println("-----------RESULTADO:--------");
       System.out.println("En Minuto es: "+ m +" minutos");
       System.out.println("En Segundo es: "+ s +" segundos");
       System.out.println("----------------------------");
    }   
}
