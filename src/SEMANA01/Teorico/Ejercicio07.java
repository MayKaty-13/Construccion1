
package SEMANA01.Teorico;

import java.util.Scanner;


public class Ejercicio07 {
      public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    
    float a,b;
    float c,f;
    
    System.out.println("Ingrese en Grados Celsius:");
    a=sc.nextFloat();
    System.out.println("Ingrese en Grados Fahrenheit:");
    b=sc.nextFloat();

    f=(float)((a*9/5)+32);
    c=(float)((b-32)*5/9);
    
    System.out.println("EN Fahrenheit: "+f);
    System.out.println("EN Celsius: "+c);

    }  
}
