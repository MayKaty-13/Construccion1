
package SEMANA01.Practico;

import java.util.Scanner;

public class PREGUNTA21 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       
        double precio,precio_total=0,montoP=0;
        int opcion;
       
        do{
            System.out.println("VENTA DE UN SUPERMERCADO");
            System.out.println("1: Venta de producto:  ");
            System.out.println("2: Salir  ");
            
            System.out.println("Ingrese una opcion:");
            opcion=leer.nextInt();
       
            switch(opcion){
                case 1:
                    System.out.println("Ingresa la cantidad de productos a comprar:");
                    int cantidad=leer.nextInt();
                    for(int i=0;i<cantidad;i++){
                       precio=aleatorio(05.0,10.0);  
                       montoP+=(precio*i);
                    }
                    System.out.println("Monto a pagar por la compra: s/. "+montoP);
                    precio_total+=montoP;
                    break;
                case 2:
                    break;
                default:
                    System.out.println("!!Opcion invalida intentalo otra vez !!"); 
            }
        }while(opcion!=2);
        System.out.println("\nPrecio Total Acumulado durante todo el día: s/. "+precio_total);
    }
    public static int aleatorio(double min,double max){
        return (int)((max+min-1)*Math.random()+1);
    }
}
