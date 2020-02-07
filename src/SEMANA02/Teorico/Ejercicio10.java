
package SEMANA02.Teorico;

import java.util.ArrayList;

 class numeros{
         private int x=10;
         void setx(int a){
             this.x=a;
         }
         int getx(){
             return this.x;
         }
     }
public class Ejercicio10 {  
    public static void main(String[] args) {
//        int x=10, y=10;
//      incrementar(x);
//        System.out.println(x+y);
        numeros num=new numeros();
        ArrayList lista=new ArrayList();
        incrementar(num);
        System.out.println(num.getx());
    }
//  static void incrementar(int a){
//      a++;
//  }
   static void incrementar(numeros a){
     a.setx(30);
  } 
}
