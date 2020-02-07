
package SEMANA01.Teorico;

import java.util.Scanner;


public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero en milimetros:");
        int mil=leer.nextInt();
        int met,cen,dec;
        met=mil/1000;
        mil=mil%1000;
        cen=mil/100;
        mil=mil%100;
        dec=mil/10;
        mil=mil%10;
        System.out.println("El numero es igual a: "+met+" metros, "+cen+" centimetros, "+dec+" decimetros, "+mil+" milimetros");
        
        
    }
  
}
