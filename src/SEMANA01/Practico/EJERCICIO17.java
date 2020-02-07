
package SEMANA01.Practico;

import java.util.Scanner;

public class EJERCICIO17 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el monto inicial: ");
        double monto = leer.nextDouble();
        double montoFinal = monto;
        
        for(int i=0;i<12;i++){
            montoFinal += montoFinal*0.02;
        }
        
        System.out.println("Luego de 1 año, el monto pasó de s/."+monto+" a s/."+montoFinal);
        
    }
}
