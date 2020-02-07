
package SEMANA01.Practico;

import java.util.Scanner;


public class EJERCICIO7 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa un numero entero y positivo");
        int n=leer.nextInt();
        int cd=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cd++;
            } 
        }
        if(cd==2){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
        int a=0,b=1,c=0;
        for(int i=0;c<=n;i++){
            if(n==c){
             System.out.println("El numero es fibonacci"); 
            }
            a=b;
            b=c;
            c=a+b;   
        }
        
    }
   
}
