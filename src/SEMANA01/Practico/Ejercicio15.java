
package SEMANA01.Practico;

import java.util.Scanner;

public class Ejercicio15{
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el número de autos: ");
        int numA = leer.nextInt();
        
        Auto15 autos[];
        autos = new Auto15[numA];
        
        System.out.println("Ingrese las placas de los"+numA+" autos (4 dígitos):");
        for(int i=0;i<numA;i++){
            autos[i] = new Auto15();
            System.out.println("Auto "+(i+1)+" - Placa: ");
            autos[i].setPlaca(leer.next());
            System.out.println("--------------------");
            
            autos[i].registrarColor();
        }
        
        System.out.println("COLORES DE LAS CALCOMANÍAS DE LOS AUTOS:");
        for(int i=0;i<numA;i++){
            System.out.println("Auto - Placa: "+autos[i].getPlaca()+" - Color: "+autos[i].getColorCalcomania());
            System.out.println("--------------------");
        }
        
    }
    
}