
package SEMANA01.Practico;

import java.util.Scanner;

public class EJERCICIO6 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int g, tipo;
        double montoP, montoT=0;
        do{   
        System.out.println("INGRESE EL TIPO DE PRECIO DEL LITRO DE GASOLINA QUE DESEA: ");
        System.out.println("1. TIPO A");
        System.out.println("2. TIPO B");
        System.out.println("3. TIPO C");
        System.out.println("3. SALIR");
        tipo=leer.nextInt(); 
        switch(tipo){
            case 1: 
                do{
                System.out.println("NUMERO DE GALONES QUE DESEA COMPRAR: ");
                g=leer.nextInt();
                }while(g<0);
                montoP=g*(3785*50);
                montoT+=montoP;
                System.out.println(" Monto a pagar por el cliente: "+montoP);
                break;
            case 2: 
                do{
                System.out.println("NUMERO DE GALONES QUE DESEA COMPRAR: ");
                g=leer.nextInt();
                }while(g<0);
                montoP=g*(3785*55);
                montoT+=montoP;
                System.out.println(" Monto a pagar por el cliente: "+montoP);
                break;
            case 3: 
                do{
                System.out.println("NUMERO DE GALONES QUE DESEA COMPRAR: ");
                g=leer.nextInt();
                }while(g<0);
                montoP=g*(3785*60);
                montoT+=montoP;
                System.out.println(" Monto a pagar por el cliente: "+montoP);
                break;
            case 4: 
                break;
        }
        }while(tipo!=4);
        System.out.println(" El monto Total recaudado por la gasolinera es: "+montoT);  
    } 
}
