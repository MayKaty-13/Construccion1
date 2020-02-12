
package TAREA03SEMANA2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
       int nota1,nota2,nota3;
        System.out.println("Ingrese primer nota:");
        nota1=teclado.nextInt();
        System.out.println("Ingrese segunda nota:");
        nota2=teclado.nextInt();
        System.out.println("Ingrese tercer nota:");
        nota3=teclado.nextInt();
        double promedio=(nota1+nota2+nota3)/3;
        Ejercicio2 obj =new Ejercicio2();
        obj.mensaje(promedio);
    }
   public double mensaje(double prom){
    if(prom>=13)
        System.out.println("Promocionado");
    else{
        if(prom>=11)
            System.out.println("Regular");
        else
            System.out.println("Reprobado");
    }
    return prom;
   }
   
}
