
package SEMANA01.Practico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EJERCICIO31 {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("###.##");
        int n ;
        do{
         System.out.println("Ingrese el número de personas encuestadas: ");
         n = leer.nextInt();   
        }while(n<0);
        
        int dato[] = new int[n];

        double opc1=0,opc2=0,opc3=0,opc4=0,opc5=0;
        
        for(int i=0;i<n;i++){
            dato[i] = aleatorio(1,5);
            switch(dato[i]){
                case 1:
                    opc1++;break;
                case 2:
                    opc2++;break;
                case 3:
                    opc3++;break;
                case 4:
                    opc4++;break;
                case 5:
                    opc5++;break;
            }
        }  
         System.out.println("-----------RESULTADOS: ------------");
        System.out.println(opc1+" Personas de un total de "+n+" estudió Primaria con un porcentaje de:  "+formato.format((opc1/n)*100)+" %");
        System.out.println(opc2+" Personas de un total de "+n+" estudió Secundaria con un porcentaje de:  "+formato.format((opc2/n)*100)+" %");
        System.out.println(opc3+" Personas de un total de "+n+" estudió una Carrera Técnica con un porcentaje de:  "+formato.format((opc3/n)*100)+" %");
        System.out.println(opc4+" Personas de un total de "+n+" tiene Estudios Profesionales con un porcentaje de:  "+formato.format((opc4/n)*100)+" %");
        System.out.println(opc5+" Personas de un total de "+n+" tiene Estudios de Posgrado con un porcentaje de:  "+formato.format((opc5/n)*100)+" %"); 
    } 
  public static int aleatorio(int min,int max){
        return (int)((max+min-1)*Math.random()+1);
    }
}
