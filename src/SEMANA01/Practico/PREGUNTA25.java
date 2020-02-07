
package SEMANA01.Practico;

import java.util.Scanner;

public class PREGUNTA25 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("\t MENU DE OPCIONES");
        int opcion;
        double DeudaF=0,montoA;
       do{
            System.out.println("1: Compra Articulo");
            System.out.println("2: Salir");
            
            System.out.println("\nIngrese una opcion:");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingresa la cantidad a comprar del mismo articulo:  ");
                    int cantidad=leer.nextInt();
                    System.out.println("Ingresa el precio del articulo:  ");
                    double precio=leer.nextDouble(); 
                    montoA=precio*cantidad;  
                    DeudaF+=montoA; 
                    break;
                case 2:
                    break;
                    default:
                        System.out.println("Opcion invalida intentalo otra vez");           
            } 
        }while(opcion!=2);
        System.out.println("Deuda Final a pagar: S/"+DeudaF);
    }
}
