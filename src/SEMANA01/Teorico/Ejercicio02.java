
package SEMANA01.Teorico;

import java.util.Scanner;

public class Ejercicio02 {
        public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        System.out.print("Ingrese el primer numero: ");
        int numero1= leer.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2= leer.nextInt();
        
        int sum=0;
        sum=numero1+numero2;
        
        System.out.println("La suma de los numeros es: "+sum);
        
    }
}
