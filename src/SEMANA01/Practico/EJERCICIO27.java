
package SEMANA01.Practico;

import java.util.Scanner;

public class EJERCICIO27 {
 public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double precioE=2500;
        int nO = 0;
        do{
         System.out.println("Ingrese el número de obreros : ");
         nO = dato.nextInt();   
        }while(nO<0);

        int horasT[] = new int[nO];
        double salarios[] = new double[nO];
         System.out.println("RESULTADOS DE LOS SALARIOS DE LOS OBREROS:");
        for(int i=0;i<nO;i++){
           horasT[i]=aleatorio(1,200);
            if(horasT[i]<=40){
                salarios[i] = precioE*horasT[i];
            }else{
                if(horasT[i]<=48){
                    salarios[i] = 40*precioE+precioE*(horasT[i]-40)*2;
                }else{
                    salarios[i] = 40*precioE+precioE*16+precioE*(horasT[i]-48)*3;
                }
            }
          System.out.println("OBRERO "+(i+1)+" :  -Salario Inicial: "+precioE+"     -Salario Obtenido: s/."+salarios[i]);  
        }
    }
  public static int aleatorio(double min,double max){
        return (int)((max+min-1)*Math.random()+1);
    }
}
