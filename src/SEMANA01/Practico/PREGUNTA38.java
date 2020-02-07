
package SEMANA01.Practico;

public class PREGUNTA38 {
   public static void main(String[] args) {
        int suma=0;
        System.out.println("------------------------");
        for(int i=100;i>0;i-=2){
            System.out.print(i+ " + ");  
            suma+=i;
        }
        System.out.print("0 ");
        System.out.println("\n------------------------");
        System.out.println("La suma total de los numeros es: "+suma);
    }  
}
