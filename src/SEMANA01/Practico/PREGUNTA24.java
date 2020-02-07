
package SEMANA01.Practico;


import java.text.DecimalFormat;
import java.util.Scanner;

public class PREGUNTA24 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("###.##");
        int n;
        do{
        System.out.println("Ingresa la cantidad de clientes:  ");
         n=leer.nextInt();
        }while(n<0);
        System.out.println("-------------------------------------");
        System.out.println("Bolita Roja 40% descueto");
        System.out.println("Bolita Amarilla 25% descuento");
        System.out.println("Bolita Blanca No hay descuento");
        
        System.out.println("----------------------LISTA DE COMPRAS Y PAGOS:-------------------- ");
        for(int i=0;i<n;i++){
            System.out.print("Cliente "+(i+1)+" :");    
            double precio=0;  
            precio=aleatorio(10.0, 100.0);
            System.out.print("    -Precio Inicial: S/"+formato.format(precio));
            String color="";
            color=bolaAleatorio();
            System.out.print("    -Bolita sacada:  "+color+"   ");
            if(color.equals("Rojo")){
                System.out.print("    -Precio Total a Pagar:  S/"+formato.format((precio*40)/100));
            }
            if(color.equals("Amarillo")){
                System.out.print("    -Precio Total a Pagar:  S/"+formato.format((precio*25)/100));
            }
            if(color.equals("Blanco")){
                System.out.print("    -Precio Total a Pagar:  S/"+formato.format(precio));
            }
            System.out.println("");
        }       
    }
   
    public static double aleatorio(double min,double max){
        return (double)((max+min-1)*Math.random()+1);
    }
    public static String bolaAleatorio(){
        String[] cad={"","Rojo","Amarillo","Blanco"};
        int numero=(int)((3+1-1)*Math.random()+1);
        return cad[numero];
    }
}
