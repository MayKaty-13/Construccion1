
package SEMANA01.Practico;

import java.util.Scanner;


public class EJERCICIO4 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,mul;
        do{
        System.out.println("Ingresar un numero: ");
        n=leer.nextInt();
        }while(n<0);
        System.out.println("--------TABLA DE MULTIPLICAR DEL NUMERO "+n+"-------------");
        for(int i=0;i<12;i++){
            mul=n*(i+1);
            System.out.println("- "+n+" * "+(i+1)+" = "+mul);
        }
        
    }
    
   
}
