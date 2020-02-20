
package SEMANA02.Practico;

import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la lista: ");
        int n=leer.nextInt();
        System.out.println("Ingrese un valor para X: ");
        int x=leer.nextInt();
        int num,suma=0;
        for(int i=1;i<=n;i++){
          num=(2*i)-1;
         System.out.print("(x *"+num+" )/"+num+"   ");
          suma+=(x*num)/(num);
        }
        System.out.println("\nLa suma de la sucesion es: "+suma);
    }
  
}
