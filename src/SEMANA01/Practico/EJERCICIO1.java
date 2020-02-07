
package SEMANA01.Practico;

import java.util.Scanner;
public class EJERCICIO1 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double num,sum=0;
        int cont=0;
        boolean valor=true;
        do{
        System.out.println("Ingrese un numero que sea diferente de un negativo:  ");
        num=leer.nextDouble();
        if(num>=0){
            sum+=num;
            cont++;
        }else{
            valor=false;
        }   
        }while(valor);
        double prom=sum/cont;
        System.out.println("Se pudieron ingresar correctamente: "+cont+" numeros ");
        System.out.println("La suma de los numeros ingresados es:  "+sum);
        System.out.println("El promedio de los numeros ingresados es: "+prom);
    }
}

