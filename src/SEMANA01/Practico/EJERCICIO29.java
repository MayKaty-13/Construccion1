
package SEMANA01.Practico;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class EJERCICIO29 {
  public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa el numero de diputados:  ");
        int cantidad=leer.nextInt();
        String[][] diputados=new String[cantidad][2];
        for(int i=0;i<cantidad;i++){
            for(int j=0;j<2;j++){
                if(j==0){
                    diputados[i][j]="Diputado "+(i+1);
                }else{
                    diputados[i][j]=Cadena();
                }
            }
        }
        
        System.out.println("\t RESULTADOS");
        double contFavor=0,contContra=0,contAbstiene=0;
        
        
        for(int i=0;i<cantidad;i++){
            for(int j=0;j<2;j++){
                if(j==0){
                    System.out.print("Nombre:  "+diputados[i][j]);
                }else{
                    System.out.print("  Encuesta:  "+diputados[i][j]);
                    if(diputados[i][j].equals("Favor")){
                        contFavor++;
                    }else{
                        if(diputados[i][j].equals("Contra")){
                            contContra++;
                        }else{
                            contAbstiene++;
                        }
                    }
                } 
            }
            System.out.println(); 
        }
        
        double porFavor=(100*contFavor)/cantidad;
        double porContra=(100*contContra)/cantidad;
        double porAbstiene=(100*contAbstiene)/cantidad;
        
        System.out.println("\n"+"Resultados a Favor del libre comercio es: "+(int)(contFavor)+ " con: "+retornar(porFavor)+"%");
        System.out.println("Resultados en Cotra del libre comercio es: "+(int)(contContra)+ " con: "+retornar(porContra)+"%");
        System.out.println("Resultados que se Abstienen ante el libre comercio es: "+(int)(contAbstiene)+ " con: "+retornar(porAbstiene)+"%");
    }
    public static double retornar(double n){
        BigDecimal bigDecimal = new BigDecimal(n).setScale(2, RoundingMode.UP);
        return bigDecimal.doubleValue();
    }
    public static String Cadena(){
        String[] cad={"","Favor","Contra","Abstiene"};
        return cad[aleatorio(3, 1)];
    }
    public static int aleatorio(int max,int min){
        return (int)((max+min-1)*Math.random()+1);
    }  
}
