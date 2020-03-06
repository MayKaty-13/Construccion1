
package SEMANA03.Practico;

import java.util.TreeSet;

public class Ejercicio02 {
    public static Integer aleatorio(int max,int min){
        return (int)((max+min-1)*Math.random()+1);
    }
    public static void main(String[] args) {
         TreeSet<Integer>aleatorios=new TreeSet<>();
         for(int i=0;i<100;i++){
            aleatorios.add(aleatorio(1,100));
             
         }
          System.out.println(aleatorios);
     
     }  
}
