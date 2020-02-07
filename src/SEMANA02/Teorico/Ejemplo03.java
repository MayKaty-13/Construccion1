
package SEMANA02.Teorico;

import java.util.ArrayList;
import java.util.Iterator;


public class Ejemplo03 {
   public static void main(String[] args) {
       ArrayList<String> listafamilia=new ArrayList<>();
      
     listafamilia.add("A");
     listafamilia.add("B");
     listafamilia.add("C");
     listafamilia.add("D");
     listafamilia.add("E");
     listafamilia.add("F");
     Iterator it=listafamilia.iterator();
     while(it.hasNext()){
         System.out.println(it.next().toString());
     }
   }
}
