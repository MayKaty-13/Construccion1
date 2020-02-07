
package SEMANA01.Practico;

import java.util.Scanner;

public class EJERCICIO33 {
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int offset = 20000;
        int estandar = 30000;
        int tipoC=0;
        
        do{
        System.out.println("Ingrese el tipo de copias que prefiere: ");
        System.out.println("1. Offset");
        System.out.println("2. Estándar");
        System.out.println("3. Salir");
        tipoC = leer.nextInt();
        int nc; 
        switch(tipoC){
            case 1:  
                System.out.println("Ingrese la cantidad de copias que solicite: ");
                nc = leer.nextInt(); 
                if(offset>=nc){
                offset-=nc;
                }else{
                   if(offset==0){
                    System.out.println("Se agotaron las copias offset");
                   }else{
                    System.out.println("No se puede imprimir esa cantidad de copias.");
                   }
                } 
            case 2:  
                 System.out.println("Ingrese la cantidad de copias que solicite: ");
                nc = leer.nextInt(); 
                if(estandar>=nc){
                estandar-=nc;
                }else{
                  if(estandar==0){
                    System.out.println("Se agotaron las copias estandar.");
                  }else{
                    System.out.println("No se puede imprimir esa cantidad de copias.");
                  }
                }
            case 3: break;    
        }
            System.out.println("----------------------------------------------------------");
            System.out.println("Copias tipo offset que quedan es de: "+offset);
            System.out.println("Copias tipo estandar que quedan es de: "+estandar);
        }while(tipoC!=3);
        
    }    
}
