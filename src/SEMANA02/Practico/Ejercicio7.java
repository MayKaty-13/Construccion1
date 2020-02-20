
package SEMANA02.Practico;

import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
 /* 
    ejercicio7.a:
    System.out.println("Ingrese las horas de trabajo de un obrero: ");
    int horas=leer.nextInt();
    int horasE;
    double precioHN=5.5,sueldo=0;
    for(int i=1;i<=horas;i++){
     if(i<=40){
        sueldo+=precioHN;  
     }else{
         if(i>40 && i<=48){
          sueldo+=(2*precioHN);
         }else{
         sueldo+=(3*precioHN);
         }   
      }
    }
    System.out.println("El sueldo que recibe el obrero por las "+horas+" horas es de s/. "+sueldo);
 */ 
 
//Ejercicio7.b: 
  int n,edad,nA,precioA=20;
    double deuda,montoC1=0,montoC2=0,montoC3=0,montoC4=0,montoC5=0;
    do{
       System.out.println("Ingresar el numero de clientes a evaluar: "); 
       n=leer.nextInt(); 
    }while(n<0); 
    for(int i=0;i<n;i++){
        do{
         System.out.println("Ingrese la edad del cliente : ");
         edad=leer.nextInt();
         if(edad<5){
         System.out.println("Niños menores de 5 años no pueden entrar al teatro ");    
         }
        }while(edad<5);
        System.out.println("Ingrese la cantidad de acientos a adquirir: ");
        nA=leer.nextInt();
        if(edad>=5 && edad<=14){
            deuda=(nA*precioA)*0.35;
            montoC1+=deuda;
        }else{
            if(edad>14 && edad<=19){
            deuda=(nA*precioA)*0.25;
            montoC2+=deuda;
            }else{
               if(edad>19 && edad<=45){
               deuda=(nA*precioA)*0.10;
               montoC3+=deuda;
               }else{
                  if(edad>45 && edad<=65){
                  deuda=(nA*precioA)*0.25;
                  montoC4+=deuda;
                  }else{
                     deuda=(nA*precioA)*0.35;
                     montoC5+=deuda;
                  }  
               }  
            }  
        }  
    }
    System.out.println("----GANANCIAS POR CADA CATEGORIA-----");
    System.out.println("1 CATEGORIA: S/. "+montoC1);
    System.out.println("2 CATEGORIA: S/. "+montoC2);
    System.out.println("3 CATEGORIA: S/. "+montoC3);
    System.out.println("4 CATEGORIA: S/. "+montoC4);
    System.out.println("5 CATEGORIA: S/. "+montoC5);
 }
}
