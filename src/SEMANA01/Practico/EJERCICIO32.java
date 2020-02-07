
package SEMANA01.Practico;

import java.util.Scanner;

public class EJERCICIO32 {
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        do{
         System.out.println("Ingrese el número de personas que asistieron a las votaciones: ");
         n = leer.nextInt();   
        }while(n<0);
       
        int voto[] = new int[n]; 
        int opc1=0;
        int opc2=0;
        int opc3=0;
        
        for(int i=0;i<n;i++){
            voto[i]=aleatorio(1,3);
            switch(voto[i]){
                case 1:
                    opc1++;break;
                case 2:
                    opc2++;break;
                case 3:
                    opc3++;break;
            }
        }
        System.out.println("------------RESULTADOS------------");
        System.out.println(opc1+" personas irán al Norte");
        System.out.println(opc2+" personas irán al Sur");
        System.out.println(opc3+" personas irán al Centro");
        System.out.println();
        if(opc1>opc2){
            if(opc1>opc3){
                System.out.println("HAY MÁS VOTANTES EN LA SECCIÓN NORTE");
            }else{
                System.out.println("HAY MÁS VOTANTES EN LA SECCIÓN CENTRAL");
            }
        }else{
            if(opc2>opc3){
                System.out.println("HAY MÁS VOTANTES EN LA SECCIÓN SUR");
            }else{
                System.out.println("HAY MÁS VOTANTES EN LA SECCIÓN CENTRAL");
            }
        }   
    }
 public static int aleatorio(double min,double max){
        return (int)((max+min-1)*Math.random()+1);
    }
}
