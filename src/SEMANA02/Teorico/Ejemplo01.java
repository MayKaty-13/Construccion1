
package SEMANA02.Teorico;

import java.util.ArrayList;

public class Ejemplo01 {
    public static void main(String[] args) {
       ArrayList<String> listafamilia=new ArrayList<>();
      
     listafamilia.add("A");
     listafamilia.add("B");
     listafamilia.add("C");
     listafamilia.add("D");
     listafamilia.add("E");
     listafamilia.add("F");
     
     for(int i=0;i<listafamilia.size();i++){
         System.out.println(listafamilia.get(i));
     }
    }
  
}
