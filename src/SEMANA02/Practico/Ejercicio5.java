
package SEMANA02.Practico;

import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       int suma,f=0,valor;
       double promedio;
       suma=0;
       do{
           System.out.println("Ingrese valor: ");
           valor=teclado.nextInt();
           suma=suma+valor;
           f++;
       }while(f<10);
        System.out.println("La suma es: "+suma);
        promedio=suma/10;
        System.out.println("El promedio es: "+promedio);
    }
  
}
