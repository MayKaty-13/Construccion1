
package SEMANA01.Practico;

import java.util.Scanner;

public class PREGUNTA2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa X soles que desea prestarse:  ");
        int X=Integer.parseInt(leer.nextLine());
        System.out.println("Ingresa Y soles que desea devolver cada mes:  ");
        int Y=Integer.parseInt(leer.nextLine());
        System.out.println("Ingrese el interes en %: ejemplo 1%");
        String interes=leer.nextLine();
        String cad="";
        for(int i=0;i<interes.length();i++){
            if(interes.charAt(i)!='%'){
                 cad+=interes.charAt(i);
            }
        }
        
        double i=Double.parseDouble(cad);
        double interesmen=(double)((i*Y)/100);
        int contador=(int)(X/(Y-((i*Y))/100));
        System.out.println("\n"+"\t IMPRESION DE DATOS");
        System.out.println("a) Cantidad de interes pagada cada mes: "+interesmen);
        System.out.println("b) Cantidad de dinero aplicada cada mes al capital por devolver: "+(Y-((i*Y))/100));
        System.out.println("c) La cantidad acumulada de intereses pagados al final de cada mes: "+interesmen*contador);
        System.out.println("d) La cantidad del prestamo aun pendientes al final de cada mes:  "+"\n");
        double cantida_ultimo=0;
        for(int j=1;j<=contador;j++){
            double pendiente=(double)(X-(j*(Y-((i*Y))/100)));
            System.out.println("Mes "+j+"  : "+""+pendiente);
            if(j==contador){
                cantida_ultimo=pendiente;
            }
        }
        System.out.println("e) El numero necesario de pagos mensuales para devolver el prestamo completo: "+contador);
        System.out.println("La cantidad del ultimo pago (Probablemente menor que Y): "+cantida_ultimo);
    }
    
}
