
package SEMANA01.Teorico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args)  {
     Scanner leer= new Scanner(System.in);
     DecimalFormat formato=new DecimalFormat("###.##");
     int suma=0;
     int n[]=new int[4];
     for(int i=0;i<4;i++){
         System.out.println("Ingresar el "+(i+1)+" numero:");
         n[i]=leer.nextInt();
         suma+=n[i];   
     }
   
     for(int i=0;i<4;i++){
         System.out.println("El procentaje de "+n[i]+" de la suma Total de "+suma+" es: "+ formato.format((double)n[i]*100/(double)suma)+" %");
     }
    }
}
